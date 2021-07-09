package level1;

//실패율
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FailureRate {
	public List<Integer> solution(int N, int[] stages) {
        int len = stages.length;
        int[] count = new int[N];
        HashMap<Integer,Double> hashMap = new HashMap<Integer,Double>();
        
        // 스테이지 별로 남아있는 사람의 수를 count 배열에 순서대로 저장
        for (int i = 0; i < len; i++) {
        	if (stages[i] <= N) {
        		count[stages[i]-1] += 1;
        	}
        }
        
        double rate = 0;
        int num = 1;
        
        for (int n : count) {
        	rate = n*1.0 / len;
        	if (Double.isNaN(rate)) rate = 0;	// rate가 NaN이 나온 경우 0으로 초기화
        	
        	hashMap.put(num, rate); // hashMap에 (스테이지, 실패율) 추가
        	
        	len -= n;
        	num++;
        }
        
        // answerList를 hashMap의 keySet으로 초기화
        // hashMap의 value를 기준으로 key를 오름차순 정렬
        List<Integer> answerList = new ArrayList<>(hashMap.keySet());
        Collections.sort(answerList, (o1, o2) -> (hashMap.get(o2).compareTo(hashMap.get(o1))));
        
        return answerList;
    }
}
