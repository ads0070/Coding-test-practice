package level1;

// 제일 작은 수 제거하기
import java.util.ArrayList;
import java.util.List;

public class RemoveSmallNum {
    public List<Integer> solution(int[] arr) {
        int smallest_num = 2147483647;
        int loc = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest_num) {
                smallest_num = arr[i];
                loc = i;
            }
            list.add(arr[i]);
        }
        list.remove(loc);

        if (list.isEmpty()) list.add(-1);

        return list;
    }
}