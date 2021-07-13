package level1;

// 3���� ������
import java.util.stream.Stream;

public class FlipOver {
	public int solution(int n) {
        int answer = 0;
        
        answer = decimal(reverse_ternary(n));
        
        return answer;
    }
	
	// 10���� -> �Ųٷ� �� 3����
	private String reverse_ternary(int n) {
		String ternary_num = "";
		
		while (n > 0) {
			ternary_num += (n % 3);
			n /= 3;
		}
		
		return ternary_num;
	}
	
	// 3���� -> 10����
	private int decimal(String n) {
		int[] nums = Stream.of(n.split("")).mapToInt(Integer::parseInt).toArray();
		int power = nums.length - 1;
		int decimal_num = 0;
		
		for (int num : nums) {
			decimal_num += (int) Math.pow(3,  power) * num;
			power--;
		}
		
		// �ٸ� ���) n���� -> 10���� ��ȯ = Integer.parserInt(str, n)
		// decimal_num = Integer.parseInt(n,3);
		
		return decimal_num;
	}
	
}