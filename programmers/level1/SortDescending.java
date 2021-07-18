package level1;

// ���ڿ� ������������ ��ġ�ϱ�
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDescending {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split(""); // ���ڿ��� �и��Ͽ� �迭�� ����
        Stream<String> sorted_str = Arrays.stream(str).sorted(Comparator.reverseOrder());   // str�� �������� ����
        answer = sorted_str.collect(Collectors.joining());  // ���ĵ� �迭�� join���� ���ڿ��� ��ȯ

        return answer;
    }
}