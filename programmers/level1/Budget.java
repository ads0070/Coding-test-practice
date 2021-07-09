package level1;

//����
import java.util.Arrays;

public class Budget { 
	public int solution(int[] r, int budget) {
        int answer = 0;
        int total = 0;
        
        Arrays.sort(r);	// �迭 r�� ������������ ����
        
        for (int count : r) {
        	total += count;
        	if (total > budget) break; // total�� ������ �ʰ��ϸ� �ݺ��� ����
        	answer++;
        }
        
        return answer;
    }
}
