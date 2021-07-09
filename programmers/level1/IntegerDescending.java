package level1;

//���� ������������ ��ġ�ϱ�
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Collections;

public class IntegerDescending {
	public long solution(long n) {
        long answer = 0;
        
        int[] nums1 = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();	// n�� �ڸ��� ���� �ɰ��� �迭�� ����
        Integer nums2[] = Arrays.stream(nums1).boxed().toArray(Integer[]::new);	// ������ ���� int�迭�� Integer�� ��ȯ
        
        Arrays.sort(nums2,Collections.reverseOrder());	// num2 �迭�� ������������ ����
        
        answer = Long.parseLong(Arrays.toString(nums2).replaceAll("[^0-9]","")); // num2 �迭�� String������ �̾� ���� ��, Long������ ��ȯ
        
        return answer;
    }
}
