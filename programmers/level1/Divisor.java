package level1;

// 약수의 개수와 덧셈
public class Divisor {
	public int solution(int left, int right) {
        int answer = 0;
        
	    for (int i = left; i <= right; i++) {
	    	answer += CountDivisor(i);
	    }

        return answer;
    }
	
	private int CountDivisor(int num) {
		int count = 0;
		
		// 효율을 위해 sqrt(num) 만큼만 반복문 실행
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i) count++;
				else count += 2;
			}
		}
		
		// 약수의 개수가 짝수이면 num, 홀수이면 -num 반환
		if (count % 2 == 0) return num;
		else return -num;
	}
}
