package level2;

// ������
import java.util.*;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int priority = 0;
        int max = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> priority_list = new ArrayList<>();

        for (int i : priorities) {
            queue.add(i);
            priority_list.add(i);
        }

        Collections.sort(priority_list); // ����Ʈ�� �߿䵵 ������ �������� ����

        // queue�� ũ�Ⱑ 0���� Ŭ ���ȸ� �ݺ�
        while (queue.size() > 0) {
            max = priority_list.get(priority_list.size() - 1);  // ���ĵǾ� �ִ� ����Ʈ�� ������ ���Ҹ� max�� ����
            priority = queue.poll();    // queue�� ù ���Ҹ� �����Ͽ� priority�� ����

            // priority ���� max�� ���
            if (priority == max) {
                // ����ڰ� �μ� ��û�� ������ location�� 0�� ��� => �ش� ������ ��µ� ������ ���
                if (location == 0) return answer;
                // �׷��� ���� ���� answer�� 1��ŭ �����ϰ�, ����Ʈ�� ������ ���� ����
                answer++;
                priority_list.remove(priority_list.size() - 1);
            }
            // priority ���� max�� �ƴ� ���
            else {
                queue.add(priority);    // queue���� ������ priority�� queue�� �� �ڿ� ����
            }

            location = (location <= 0) ? queue.size()-1 : location-1; // �μ� ��û�� ������ location �� ����
        }

        return answer;
    }
}