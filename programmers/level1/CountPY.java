package level1;

// ���ڿ� �� p�� y�� ����
public class CountPY {
    boolean solution(String s) {
        boolean answer = true;
        int exclude_p = 0;
        int exclude_y = 0;

        exclude_p = s.toLowerCase().replaceAll("p","").length();
        exclude_y = s.toLowerCase().replaceAll("y","").length();

        if (exclude_p == exclude_y) answer = true;
        else answer = false;

        return answer;
    }
}