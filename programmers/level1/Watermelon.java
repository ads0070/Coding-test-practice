package level1;

// 수박수박수박수박수박수?
public class Watermelon {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n/2; i++) {
            answer.append("수박");
        }

        if (n % 2 == 1) answer.append("수");

        return answer.toString();
    }
}