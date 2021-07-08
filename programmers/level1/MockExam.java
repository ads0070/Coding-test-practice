package level1;

// 완전탐색 - 모의고사
import java.util.ArrayList;
import java.util.List;

public class MockExam {
	public List<Integer> solution(int[] answers) {
		int[] arr_1st = {1, 2, 3, 4, 5};
		int[] arr_2nd = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] arr_3rd = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = {0, 0, 0};
        
        for(int i = 0; i < answers.length; i++) {
        	if (arr_1st[i%arr_1st.length]==answers[i]) {
        		count[0]++;
        	}
        	if (arr_2nd[i%arr_2nd.length]==answers[i]) {
        		count[1]++;
        	}
        	if (arr_3rd[i%arr_3rd.length]==answers[i]) {
        		count[2]++;
        	}
        }
        
        int max = 0;
        
        for(int i = 0; i < 3; i++) {
        	if(count[i]>max) {
        		max = count[i];
        	}
        }
        
        List<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0; i < 3; i++) {
			if(max == count[i]) {
				answer.add(i+1);
			}
        }
        
        return answer;
    }
	
}
