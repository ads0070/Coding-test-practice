package level1;

//�ؽ� - �������� ���� ����
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Marathon {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> listMap = new HashMap<String,Integer>();
        
        // ������ ����� listMap�� �߰� (�̸�, �ش� �̸��� ���� ��� �� + 1) 
        for(int i=0; i<participant.length; i++) {
            if(listMap.containsKey(participant[i])) {
                listMap.put(participant[i], listMap.get(participant[i])+1);
            }
            else {
                listMap.put(participant[i], 1);
            }
        }
        
        // ������ ��ܿ� ���� listMap ������Ʈ (�̸�, �ش� �̸��� ���� ��� �� - 1)
        for(int i=0; i<completion.length; i++) {
            if(listMap.containsKey(completion[i])) {
                listMap.put(completion[i], listMap.get(completion[i])-1);
            }
            else {
                answer = completion[i];
                return answer;
            }
        }
        
        // �������� ���� ���� ���
        Set<Entry<String, Integer>> entrySet = listMap.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue().equals(1)) {
                answer = entry.getKey();
            }
        }
		
        // getOrDefault�� ����� ���
		/*// hashMap�� �ش� key�� �������� ������ default ������ 0+1=1�� ����, �����ϸ� �ش� key�� value��+1�� ������Ʈ �ȴ�.
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