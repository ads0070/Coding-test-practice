package level1;

// x��ŭ ������ �ִ� n���� ����
import java.util.ArrayList;
import java.util.List;

public class IncreasingNum {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        long num = x;

        for (int i = 0; i < n; i++) {
            answer.add(num);
            num += x;
        }

        return answer;
    }
}