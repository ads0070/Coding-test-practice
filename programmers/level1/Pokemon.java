package level1;

// ���ϸ�
import java.util.HashSet;

public class Pokemon {
	public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();
        
        // hashSet�� nums �迭�� ��� ���Ҹ� �߰��ϸ鼭 �ߺ��� ���� ���ŵǵ��� �Ѵ�.
        for (int n : nums) {
        	hashSet.add(n);
        }
        
        int setSize = hashSet.size();
        
        if (setSize < answer) {
        	answer = setSize;
        }
        
        return answer;
    }
}