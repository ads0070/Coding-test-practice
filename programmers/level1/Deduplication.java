package level1;

// 같은 숫자는 싫어
import java.util.List;
import java.util.ArrayList;

public class Deduplication {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int num = -1;
		List<Integer> answer_list = new ArrayList<Integer>();
		
		for (int n : arr) {
			if (n == num) continue;	// 연속된 숫자이면 continue
			else {
				answer_list.add(n);
				num = n;
			}
		}
		
		// list를 배열로 변환
		answer = answer_list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}