package level1;

// 문자열 내림차순으로 배치하기
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDescending {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(""); // 문자열을 분리하여 배열에 저장
        Stream<String> sorted_str = Arrays.stream(str).sorted(Comparator.reverseOrder());   // str을 역순으로 정렬
        answer = sorted_str.collect(Collectors.joining());  // 정렬된 배열을 join시켜 문자열로 변환

        return answer;
    }
}