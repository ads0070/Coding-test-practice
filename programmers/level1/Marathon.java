package level1;

//해시 - 완주하지 못한 선수
import java.util.HashMap;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
//		for(int i=0; i<participant.length; i++) {
//			if(hashMap.containsKey(participant[i])) {
//				hashMap.put(participant[i], hashMap.get(participant[i])+1);
//			}
//			else {
//				hashMap.put(participant[i], 1);
//			}
//		}
//		
//		for(int i=0; i<completion.length; i++) {
//			if(hashMap.containsKey(completion[i])) {
//				hashMap.put(completion[i], hashMap.get(completion[i])-1);
//			}
//			else {
//				answer = completion[i];
//				return answer;
//			}
//		}
		
		for (String key : participant) hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
		for (String key : completion) hashMap.put(key, hashMap.get(key) - 1);
		
		for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0){
                answer = key;
                break;
            }
        }
		
        return answer;
    
	}
}