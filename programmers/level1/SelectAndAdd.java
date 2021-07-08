package level1;

// 두 개 뽑아서 더하기
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class SelectAndAdd {
	public List<Integer> solution(int[] numbers) {
		
        int n = numbers.length;
        boolean[] visited = new boolean[n];
        HashSet<Integer> hashSet = new HashSet<>();
        
        hashSet = combination(numbers, visited, 0, n, 2, hashSet);
        
        List<Integer> hashList = new ArrayList<>(hashSet);
        hashList.sort(Comparator.naturalOrder());
        
        return hashList;
    }
	
	static HashSet<Integer> combination(int[] nums, boolean[] visited, int start, int n, int r, HashSet<Integer> hashSet) {
        if (r == 0) {
        	int sum = 0;
        	
        	for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    sum += nums[i];
                }
            }
        	hashSet.add(sum);
        	sum = 0;
        	return hashSet;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(nums, visited, i + 1, n, r - 1, hashSet);
            visited[i] = false;
        }
        return hashSet;
    }
}
