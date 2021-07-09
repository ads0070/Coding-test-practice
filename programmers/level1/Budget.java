package level1;

//예산
import java.util.Arrays;

public class Budget { 
	public int solution(int[] r, int budget) {
        int answer = 0;
        int total = 0;
        
        Arrays.sort(r);	// 배열 r을 오름차순으로 정렬
        
        for (int count : r) {
        	total += count;
        	if (total > budget) break; // total이 예산을 초과하면 반복문 종료
        	answer++;
        }
        
        return answer;
    }
}
