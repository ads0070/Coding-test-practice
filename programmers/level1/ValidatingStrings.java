package level1;

// ���ڿ� �ٷ�� �⺻
public class ValidatingStrings {
    public boolean solution(String s) {
        boolean answer = false;
        int len = s.length();

        if (len == 4 || len == 6) {
            try {
                Integer.parseInt(s);
                answer = true;
            } catch (Exception e) {
                answer = false;
            }
        }

        return answer;
    }
}