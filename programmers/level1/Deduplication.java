package level1;

// ���� ���ڴ� �Ⱦ�
import java.util.List;
import java.util.ArrayList;

public class Deduplication {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int num = -1;
		List<Integer> answer_list = new ArrayList<Integer>();
		
		for (int n : arr) {
			if (n == num) continue;	// ���ӵ� �����̸� continue
			else {
				answer_list.add(n);
				num = n;
			}
		}
		
		// list�� �迭�� ��ȯ
		answer = answer_list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}