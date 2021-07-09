package level1;

// Ű�е� ������
import java.util.HashMap;

public class Keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] leftHand = {0,3};	 // �޼��� ��ġ
        int[] rightHand = {2,3}; // �������� ��ġ
        int leftLen = 0;
        int rightLen = 0;
        int center = 0;
        // Ű�е��� ���ں� y���� hashMap�� �⺻������ ���� 
        // y\x|  0   1   2
        //�ѤѤ�|�ѤѤѤѤѤѤѤѤ�
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
        	// 1, 4, 7�� �޼����� ������
        	if (n==1 || n==4 || n==7) {
        		leftHand[0] = 0;
        		leftHand[1] = hashMap.get(n);
        		answer += "L";
        	}
        	// 3, 6, 9�� ���������� ������
        	else if (n==3 || n==6 || n==9) {
        		rightHand[0] = 2;
        		rightHand[1] = hashMap.get(n);
        		answer += "R";
        	}
        	// ��� Ű�е��� ���
        	else {
        		center = hashMap.get(n);	// n�� y���� ���� center�� ����
        		leftLen =  (1 - leftHand[0]) + Math.abs((center - leftHand[1]));	// n�� Ű�е�� �޼� ��ġ�� �Ÿ�
        		rightLen = (rightHand[0] - 1) + Math.abs((rightHand[1] - center));	// n�� Ű�е�� ������ ��ġ�� �Ÿ�
        		// �Ÿ��� ���� ���� �� �����̷� Ű�е� ������
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
        		// �޼��� �Ÿ��� ���� ���
        		else if (leftLen < rightLen) {
        			leftHand[0] = 1;
            		leftHand[1] = center;
    				answer += "L";
        		}
        		// �������� �Ÿ��� ���� ���
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
