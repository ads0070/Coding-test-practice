package level1;

// ���ڿ��� ������ �ٲٱ�
public class StringToInteger {
    public int solution(String s) {
        int answer = 0;

        // ���� �Լ��� ��ȯ�ϴ� ���
        // answer = Integer.parseInt(s);
        // return answer;

        // ���� ��ȯ�ϴ� ���
        int start = 0;
        boolean sign = true;

        if (s.charAt(0) == '-') {
            start = 1;
            sign = false;
        } else if (s.charAt(0) == '+'){
            start = 1;
        }

        for (int i = start; i < s.length(); i++) {
            answer = answer * 10 + (s.charAt(i) - 48);
        }

        if (sign) return answer;
        else return -answer;
    }
}