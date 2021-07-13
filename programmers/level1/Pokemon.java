package level1;

// 폰켓몬
import java.util.HashSet;

public class Pokemon {
	public int solution(int[] nums) {
        int answer = nums.length / 2;
        HashSet<Integer> hashSet = new HashSet<>();
        
        // hashSet에 nums 배열의 모든 원소를 추가하면서 중복된 값은 제거되도록 한다.
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