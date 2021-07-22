package level2;

// ´õ ¸Ê°Ô
import java.util.ArrayList;

public class MoreSpicy {
    private ArrayList<Integer> heap = new ArrayList<>() {
        {add(0);}
    };

    public int solution(int[] scoville, int K) {
        int answer = 0;

        for (int i : scoville) {
            insert(i);
        }

        System.out.println(heap);
        System.out.println(combine());
        System.out.println(heap);

        return answer;
    }

    private void insert(int n) {
        heap.add(n);
        int p = heap.size() - 1;

        while (p > 1 && heap.get(p/2) > heap.get(p)) {
            int temp = heap.get(p/2);
            heap.set(p/2, heap.get(p));
            heap.set(heap.get(p/2), temp);

            p = p / 2;
        }
    }

    private int combine() {
        int minScoville = heap.get(1);

        heap.set(1, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int pos = 1;
        while((pos*2) < heap.size()) {
            int min = heap.get(pos * 2);
            int minPos = pos * 2;

            if (((pos*2 + 1) < heap.size()) && (min > heap.get(pos*2+1))) {
                min = heap.get(pos*2+1);
                minPos = pos * 2 + 1;
            }
            if (heap.get(pos) < min) break;

            int temp = heap.get(pos);
            heap.set(pos, heap.get(minPos));
            heap.set(minPos, temp);
            pos = minPos;
        }

        return minScoville;
    }

}
