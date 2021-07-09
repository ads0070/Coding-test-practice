package level1;

//정수 내림차순으로 배치하기
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
	public long solution(long n) {
        long answer = 0;
        
        int[] nums1 = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();	// n을 자릿수 별로 쪼개서 배열에 저장
        Integer nums2[] = Arrays.stream(nums1).boxed().toArray(Integer[]::new);	// 정렬을 위해 int배열을 Integer로 변환
        
        Arrays.sort(nums2,Collections.reverseOrder());	// num2 배열을 내림차순으로 정렬
        
        answer = Long.parseLong(Arrays.toString(nums2).replaceAll("[^0-9]","")); // num2 배열을 String형으로 이어 붙인 후, Long형으로 변환
        
        return answer;
    }
}
