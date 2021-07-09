package level1;

// 그리디 알고리즘 - 체육복
import java.util.HashMap;

public class GymSuit {
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;	// 우선 체육복을 가져온 학생 수를 answer에 저장
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for (Integer key : reserve) hashMap.put(key, 1);	// 여벌 옷을 가져온 학생을 hashMap에 추가
        
        // 체육복을 읽어버린 학생이 여벌 옷이 있는 경우,
        // 해당 학생은 여벌 옷을 자신이 입어야 하므로 여벌 옷 개수를 0으로 변경하고,
        // answer를 1만큼 증가
        for (Integer key : lost) {
        	if(hashMap.containsKey(key)) {
        		hashMap.put(key, 0);
        		answer++;
        	}
        }
        
        // 
        Integer key = 0;
        for(int i = 0; i < lost.length; i++) {
        	// 잃어버린 학생이 여벌 옷이 있는 경우는 위에서 미리 처리했으므로 continue
        	if(hashMap.containsKey(lost[i])) {
        		continue;
        	}
        	// 그리디 알고리즘에 따라 앞 번호, 뒷 번호 중 앞 번호에게 옷을 빌리는 경우가
        	// 항상 최선이기 때문에 앞 번호 학생이 여벌옷이 있는지를 먼저 확인한다.
        	if(hashMap.containsKey(lost[i]-1)) {
        		key = lost[i]-1;
        		// 앞 번호 학생이 여벌 옷이 있는 경우 빌리기
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        			continue;
        		}
        	}
        	// 앞 번호 학생이 여벌 옷이 없는 경우는 뒷 번호 학생 확인
        	if(hashMap.containsKey(lost[i]+1)) {
        		key = lost[i]+1;
        		// 뒷 번호 학생이 여벌 옷이 있는 경우 빌리기
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        		}
        	}
        }
        
        return answer;
    }
}
