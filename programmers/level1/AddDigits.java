package level1;

// �ڸ��� ���ϱ�
public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);

        for (int i = 0; i < num.length(); i++) {
            answer += Character.getNumericValue(num.charAt(i));
        }

        return answer;
    }
}