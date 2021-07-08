package level1;

// 그리디 알고리즘 - 체육복
import java.util.HashMap;

public class GymSuit {
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for (Integer key : reserve) hashMap.put(key, 1);
        
        for (Integer key : lost) {
        	if(hashMap.containsKey(key)) {
        		hashMap.put(key, 0);
        		answer++;
        	}
        }
        
        Integer key = 0;
        for(int i = 0; i < lost.length; i++) {
        	if(hashMap.containsKey(lost[i])) {
        		continue;
        	}
        	if(hashMap.containsKey(lost[i]-1)) {
        		key = lost[i]-1;
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        			continue;
        		}
        	}
        	if(hashMap.containsKey(lost[i]+1)) {
        		key = lost[i]+1;
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        		}
        	}
        }
        
        return answer;
    }
}
