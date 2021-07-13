package level1;

// 소수 만들기
public class MakePrimeNumber {
	static int answer = 0;	// 출력값을 전역 변수로 선언
	
	public int solution(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        
        combination(nums, visited, 0, 3);
        
        return answer;
    }
	
	// 조합 - 백트래킹 이용
	static void combination(int[] nums, boolean[] visited, int start, int r) {
		int sum = 0;
		
		if(r == 0) {
			for(int i = 0; i < nums.length; i++) {
	            if(visited[i] == true)
	                sum += nums[i];
	        }
			if (pnum(sum)) answer++;
			return;
		}
		else {
			for(int i = start; i < nums.length; i++) {
				visited[i] = true;
				combination(nums, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}
	}
	
	// 소수 판별 함수
	static boolean pnum(int num) {
		for (int n = 2; n < num; n++) {
			if (num % n == 0) return false;
		}
		return true;
	}
	
}
