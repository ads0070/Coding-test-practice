package level1;

//해시 - 완주하지 못한 선수
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> listMap = new HashMap<String,Integer>();
        
        // 참가자 명단을 listMap에 추가 (이름, 해당 이름을 가진 사람 수 + 1) 
        for(int i=0; i<participant.length; i++) {
            if(listMap.containsKey(participant[i])) {
                listMap.put(participant[i], listMap.get(participant[i])+1);
            }
            else {
                listMap.put(participant[i], 1);
            }
        }
        
        // 완주자 명단에 따라 listMap 업데이트 (이름, 해당 이름을 가진 사람 수 - 1)
        for(int i=0; i<completion.length; i++) {
            if(listMap.containsKey(completion[i])) {
                listMap.put(completion[i], listMap.get(completion[i])-1);
            }
            else {
                answer = completion[i];
                return answer;
            }
        }
        
        // 완주하지 못한 선수 출력
        Set<Entry<String, Integer>> entrySet = listMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue().equals(1)) {
                answer = entry.getKey();
            }
        }
		
        // getOrDefault를 사용한 방식
		/*// hashMap에 해당 key가 존재하지 않으면 default 값으로 0+1=1이 들어가고, 존재하면 해당 key의 value값+1로 업데이트 된다.
		for (String key : participant) hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
		for (String key : completion) hashMap.put(key, hashMap.get(key) - 1);
		
		for (String key : hashMap.keySet()) {
            if (hashMap.get(key) != 0){
                answer = key;
                break;
            }
        }*/
		
        return answer;
    
	}
}