package level2;

// ´õ ¸Ê°Ô
import java.util.ArrayList;

public class MoreSpicy {
    private final ArrayList<Integer> heap = new ArrayList<>();

    public int solution(int[] scoville, int K) {
        int answer = 0;

        for(int i : scoville) heap.add(i);

        heap_sort();

        while (heap.get(0) < K) {
            if(heap.size() <= 1) return -1;

            heap.add(heap.get(0) + (heap.get(1) * 2));
            heap.remove(0);
            heap.remove(0);

            heap_sort();
            answer++;
        }

        return answer;
    }

    private void heap_sort() {
        for(int i = 1; i < heap.size(); i++) {
            int p = i;
            do {
                int root = p / 2;
                if(heap.get(root) > heap.get(p)) {
                    int temp = heap.get(root);
                    heap.set(root, heap.get(p));
                    heap.set(p, temp);
                }
                p = root;
            } while (p != 0);
        }
    }

}
