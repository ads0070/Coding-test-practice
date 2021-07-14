package level1;

// ����� ������ ����
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
		
		// ȿ���� ���� sqrt(num) ��ŭ�� �ݺ��� ����
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i) count++;
				else count += 2;
			}
		}
		
		// ����� ������ ¦���̸� num, Ȧ���̸� -num ��ȯ
		if (count % 2 == 0) return num;
		else return -num;
	}
}
