package level1;

// 두 정수 사이의 합
public class SumBetween {
	public long solution(int a, int b) {
        long answer = 0;
        
        // 두 수가 같은 경우
        if(a==b) {
        	answer = a;
        	return answer;
        }
        // a가 b보다 큰 경우 두 숫자를 치환
        else if(a>b) {
        	int c = a;
        	a = b;
        	b = c;
        }
        // a부터 b까지 숫자 합하기
        for(int i = a; i <= b; i++) {
    		answer += i;
    	}
        
        // 등차수열 공식으로 문제 해결하기
        // answer = (b - a + 1) * (a + b) / 2;
        
        return answer;
    }
}