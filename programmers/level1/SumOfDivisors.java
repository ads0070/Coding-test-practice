package level1;

// ����� ��
public class SumOfDivisors {
	public int solution(int n) {
        int answer = 0;
        
        if (n == 1) return 1;
        
        for (int i = 1; i <= n/2; i++) {
        	if (n % i == 0) {
        		answer += i;
        	}
        }
        
        return answer+n;
    }
}