package level2;

// 프린터
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

        Collections.sort(priority_list); // 리스트를 중요도 순서로 오름차순 정렬

        // queue의 크기가 0보다 클 동안만 반복
        while (queue.size() > 0) {
            max = priority_list.get(priority_list.size() - 1);  // 정렬되어 있는 리스트의 마지막 원소를 max에 대입
            priority = queue.poll();    // queue의 첫 원소를 추출하여 priority에 대입

            // priority 값이 max인 경우
            if (priority == max) {
                // 사용자가 인쇄 요청한 문서의 location이 0인 경우 => 해당 문서가 출력될 차례인 경우
                if (location == 0) return answer;
                // 그렇지 않은 경우는 answer를 1만큼 증가하고, 리스트의 마지막 원소 제거
                answer++;
                priority_list.remove(priority_list.size() - 1);
            }
            // priority 값이 max가 아닌 경우
            else {
                queue.add(priority);    // queue에서 추출한 priority를 queue의 맨 뒤에 삽입
            }

            location = (location <= 0) ? queue.size()-1 : location-1; // 인쇄 요청한 문서의 location 값 갱신
        }

        return answer;
    }
}