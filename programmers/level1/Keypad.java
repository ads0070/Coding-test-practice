package level1;

// 키패드 누르기
import java.util.HashMap;

public class Keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] leftHand = {0,3};	 // 왼손의 위치
        int[] rightHand = {2,3}; // 오른손의 위치
        int leftLen = 0;
        int rightLen = 0;
        int center = 0;
        // 키패드의 숫자별 y값을 hashMap에 기본값으로 저장 
        // y\x|  0   1   2
        //ㅡㅡㅡ|ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        //  0 |  1   2   3
        //  1 |  4   5   6
        //  2 |  7   8   9
        //  3 |  *   0   #
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>(){
        	{
        		put(1,0);
        		put(4,1);
        		put(7,2);
        		put(3,0);
        		put(6,1);
        		put(9,2);
        		put(2,0);
        		put(5,1);
        		put(8,2);
        		put(0,3); 	
        	}
        };
        
        for(int n : numbers) {
        	// 1, 4, 7은 왼손으로 누르기
        	if (n==1 || n==4 || n==7) {
        		leftHand[0] = 0;
        		leftHand[1] = hashMap.get(n);
        		answer += "L";
        	}
        	// 3, 6, 9는 오른손으로 누르기
        	else if (n==3 || n==6 || n==9) {
        		rightHand[0] = 2;
        		rightHand[1] = hashMap.get(n);
        		answer += "R";
        	}
        	// 가운데 키패드인 경우
        	else {
        		center = hashMap.get(n);	// n의 y값을 구해 center에 저장
        		leftLen =  (1 - leftHand[0]) + Math.abs((center - leftHand[1]));	// n번 키패드와 왼손 위치의 거리
        		rightLen = (rightHand[0] - 1) + Math.abs((rightHand[1] - center));	// n번 키패드와 오른손 위치의 거리
        		// 거리가 같은 경우는 주 손잡이로 키패드 누르기
        		if (leftLen == rightLen) {
        			if (hand.equals("right")) {
        				rightHand[0] = 1;
                		rightHand[1] = center;
                		answer += "R";
        			} else {
        				leftHand[0] = 1;
                		leftHand[1] = center;
        				answer += "L";
        			}
        		}
        		// 왼손의 거리가 작은 경우
        		else if (leftLen < rightLen) {
        			leftHand[0] = 1;
            		leftHand[1] = center;
    				answer += "L";
        		}
        		// 오른손의 거리가 작은 경우
        		else if (leftLen > rightLen) {
        			rightHand[0] = 1;
            		rightHand[1] = center;
            		answer += "R";
        		}
        	}
        }
        return answer;
    }
}
