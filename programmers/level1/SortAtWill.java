package level1;

// ���ڿ� �� ������� �����ϱ�
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAtWill {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<String>();
        StringBuilder str = new StringBuilder();

        // ���ڿ� �� �տ� �ε��� ���ڸ� �߰��ϱ�
        for (String s : strings) {
            str.setLength(0);
            str.append(s);
            str.insert(0, s.charAt(n));
            list.add(String.valueOf(str));
        }

        // �迭�� ������������ ����
        Collections.sort(list);

        // ���ڿ� �� �տ� �߰��� �ε��� ���� ����
        for (int i = 0; i < list.size(); i++) {
            str.setLength(0);
            str.append(list.get(i));
            str.delete(0,1);
            answer[i] = String.valueOf(str);
        }

        return answer;
    }
}
