package level1;

// �� ���� ������ ��
public class SumBetween {
	public long solution(int a, int b) {
        long answer = 0;
        
        // �� ���� ���� ���
        if(a==b) {
        	answer = a;
        	return answer;
        }
        // a�� b���� ū ��� �� ���ڸ� ġȯ
        else if(a>b) {
        	int c = a;
        	a = b;
        	b = c;
        }
        // a���� b���� ���� ���ϱ�
        for(int i = a; i <= b; i++) {
    		answer += i;
    	}
        
        // �������� �������� ���� �ذ��ϱ�
        // answer = (b - a + 1) * (a + b) / 2;
        
        return answer;
    }
}