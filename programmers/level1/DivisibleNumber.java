package level1;

// ������ �������� ���� �迭
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumber {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        // �Է� �迭�� �̸� �����ϰ� �����ϴ� ���
        // => answer ����Ʈ�� ���� ������ �ʿ䰡 ������ �Է� �迭 ���̿� ���� �ӵ��� ���� �ɸ� �� ����.
        // Arrays.sort(arr);

        for (int n : arr) {
            if (n % divisor == 0) {
                answer.add(n);
            }
        }

        if (answer.isEmpty()) {
            answer.add(-1);
            return answer;
        }
        else return selection_sort(answer);
    }

    // ���� ����
    private List<Integer> selection_sort(List<Integer> list) {
        int temp = 0;
        int size = list.size();

        for (int i = 0; i < size; i++) {
            int smallest_num = list.get(i);
            int loc = 0;

            for (int j = i + 1; j < size; j++) {
                if (list.get(j) < smallest_num) {
                    smallest_num = list.get(j);
                    loc = j;
                }
            }
            if (smallest_num != list.get(i)) {
                temp = list.get(i);
                list.set(i, smallest_num);
                list.set(loc, temp);
            }
        }

        return list;
    }
}