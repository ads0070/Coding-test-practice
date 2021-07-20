package level1;

// 자릿수 더하기
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