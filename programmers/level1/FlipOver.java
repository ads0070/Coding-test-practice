package level1;

// 3진법 뒤집기
import java.util.stream.Stream;

public class FlipOver {
	public int solution(int n) {
        int answer = 0;
        
        answer = decimal(reverse_ternary(n));
        
        return answer;
    }
	
	// 10진법 -> 거꾸로 된 3진법
	private String reverse_ternary(int n) {
		String ternary_num = "";
		
		while (n > 0) {
			ternary_num += (n % 3);
			n /= 3;
		}
		
		return ternary_num;
	}
	
	// 3진법 -> 10진법
	private int decimal(String n) {
		int[] nums = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();
		int power = nums.length - 1;
		int decimal_num = 0;
		
		for (int num : nums) {
			decimal_num += (int) Math.pow(3,  power) * num;
			power--;
		}
		
		// 다른 방법) n진법 -> 10진법 변환 = Integer.parserInt(str, n)
		// decimal_num = Integer.parseInt(n,3);
		
		return decimal_num;
	}
	
}