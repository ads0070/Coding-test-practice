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
        
        // 순서가 없는 hashSet을 hashList로 변환하여 오름차순 정렬
        List<Integer> hashList = new ArrayList<>(hashSet);
        hashList.sort(Comparator.naturalOrder());
        
        return hashList;
    }
	
	// nums 배열에서 숫자 두 개를 뽑아 두 수를 더해 만들 수 있는 합을 return하는 함수
	// 숫자 두 개를 뽑는 조합을 추출하여 합을 hashSet에 추가
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
