package level1;

// [1��] ��Ʈ ����
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
        
        // ������ score ����Ʈ�� ���ʽ��� �ɼ��� bonus ����Ʈ�� �߰�
        for (char c : game) {
            if (Character.isDigit(c)) {
                num_str.append(c);  // ������ 10�� ��츦 ó���ϱ� ���� StringBuilder ���
            }
            else {
                // num_str�� ��������� ���ʽ� ���� �ɼ��� ���� ���
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
        
        // ���� ���� �ջ�
        for (int i : score) {
            answer += i;
        }

        return answer;
    }
}