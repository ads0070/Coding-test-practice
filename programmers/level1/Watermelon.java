package level1;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
public class Watermelon {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n/2; i++) {
            answer.append("����");
        }

        if (n % 2 == 1) answer.append("��");

        return answer.toString();
    }
}