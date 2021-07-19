package level1;

// 나누어 떨어지는 숫자 배열
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumber {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        // 입력 배열을 미리 정렬하고 수행하는 방법
        // => answer 리스트를 따로 정렬할 필요가 없지만 입력 배열 길이에 따라 속도가 오래 걸릴 수 있음.
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

    // 선택 정렬
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