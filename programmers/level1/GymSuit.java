package level1;

// �׸��� �˰��� - ü����
import java.util.HashMap;

public class GymSuit {
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = n-lost.length;	// �켱 ü������ ������ �л� ���� answer�� ����
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        
        for (Integer key : reserve) hashMap.put(key, 1);	// ���� ���� ������ �л��� hashMap�� �߰�
        
        // ü������ �о���� �л��� ���� ���� �ִ� ���,
        // �ش� �л��� ���� ���� �ڽ��� �Ծ�� �ϹǷ� ���� �� ������ 0���� �����ϰ�,
        // answer�� 1��ŭ ����
        for (Integer key : lost) {
        	if(hashMap.containsKey(key)) {
        		hashMap.put(key, 0);
        		answer++;
        	}
        }
        
        // 
        Integer key = 0;
        for(int i = 0; i < lost.length; i++) {
        	// �Ҿ���� �л��� ���� ���� �ִ� ���� ������ �̸� ó�������Ƿ� continue
        	if(hashMap.containsKey(lost[i])) {
        		continue;
        	}
        	// �׸��� �˰��� ���� �� ��ȣ, �� ��ȣ �� �� ��ȣ���� ���� ������ ��찡
        	// �׻� �ּ��̱� ������ �� ��ȣ �л��� �������� �ִ����� ���� Ȯ���Ѵ�.
        	if(hashMap.containsKey(lost[i]-1)) {
        		key = lost[i]-1;
        		// �� ��ȣ �л��� ���� ���� �ִ� ��� ������
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        			continue;
        		}
        	}
        	// �� ��ȣ �л��� ���� ���� ���� ���� �� ��ȣ �л� Ȯ��
        	if(hashMap.containsKey(lost[i]+1)) {
        		key = lost[i]+1;
        		// �� ��ȣ �л��� ���� ���� �ִ� ��� ������
        		if(hashMap.get(key)!=0) {
        			answer++;
        			hashMap.put(key, hashMap.get(key)-1);
        		}
        	}
        }
        
        return answer;
    }
}
