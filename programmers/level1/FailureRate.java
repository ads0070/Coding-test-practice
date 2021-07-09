package level1;

//������
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FailureRate {
	public List<Integer> solution(int N, int[] stages) {
        int len = stages.length;
        int[] count = new int[N];
        HashMap<Integer,Double> hashMap = new HashMap<Integer,Double>();
        
        // �������� ���� �����ִ� ����� ���� count �迭�� ������� ����
        for (int i = 0; i < len; i++) {
        	if (stages[i] <= N) {
        		count[stages[i]-1] += 1;
        	}
        }
        
        double rate = 0;
        int num = 1;
        
        for (int n : count) {
        	rate = n*1.0 / len;
        	if (Double.isNaN(rate)) rate = 0;	// rate�� NaN�� ���� ��� 0���� �ʱ�ȭ
        	
        	hashMap.put(num, rate); // hashMap�� (��������, ������) �߰�
        	
        	len -= n;
        	num++;
        }
        
        // answerList�� hashMap�� keySet���� �ʱ�ȭ
        // hashMap�� value�� �������� key�� �������� ����
        List<Integer> answerList = new ArrayList<>(hashMap.keySet());
        Collections.sort(answerList, (o1, o2) -> (hashMap.get(o2).compareTo(hashMap.get(o1))));
        
        return answerList;
    }
}
