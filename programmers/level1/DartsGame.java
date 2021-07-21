package level1;

// [1차] 다트 게임
import java.util.ArrayList;
import java.util.List;

public class DartsGame {
	public int solution(String dartResult) {
        int answer = 0;
        char[] game = dartResult.toCharArray();
        List<Integer> score = new ArrayList<Integer>();
        List<Character> bonus = new ArrayList<Character>();
        StringBuilder num_str = new StringBuilder();
        int loc = 0;
        
        // 점수는 score 리스트에 보너스와 옵션은 bonus 리스트에 추가
        for (char c : game) {
            if (Character.isDigit(c)) {
                num_str.append(c);  // 점수가 10인 경우를 처리하기 위해 StringBuilder 사용
            }
            else {
                // num_str이 비어있으면 보너스 다음 옵션이 나온 경우
                if (num_str.length() != 0) score.add(Integer.parseInt(String.valueOf(num_str)));
                num_str.setLength(0);
                bonus.add(c);
            }
        }

        for (char c : bonus) {
            if (c == 'D') score.set(loc, (int) Math.pow(score.get(loc),2));
            else if (c == 'T') score.set(loc, (int) Math.pow(score.get(loc),3));
            else if (c == '*') {
                loc--;
                score.set(loc, (score.get(loc) * 2));
                if (loc > 0) score.set(loc-1, (score.get(loc-1) * 2));
            }
            else if (c == '#') {
                loc--;
                score.set(loc, (-score.get(loc)));
            }
            loc++;
        }
        
        // 최종 점수 합산
        for (int i : score) {
            answer += i;
        }

        return answer;
    }
}