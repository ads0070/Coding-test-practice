package level1;

//정수 내림차순으로 배치하기
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
	public long solution(long n) {
        long answer = 0;
        
        int[] nums1 = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        Integer nums2[] = Arrays.stream(nums1).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums2,Collections.reverseOrder());
        
        answer = Long.parseLong(Arrays.toString(nums2).replaceAll("[^0-9]",""));
        
        return answer;
    }
}
