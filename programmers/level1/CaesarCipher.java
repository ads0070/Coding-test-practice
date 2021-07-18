package level1;

// 시저 암호
public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int c = s.charAt(i);

            if (c == 32) answer.append(" ");
            else {
                if (c >= 97 && c <= 122 && c+n > 122) c += (n-26);
                else if (c >= 65 && c <= 90 && c+n > 90) c += (n-26);
                else c += n;

                answer.append(String.valueOf((char)c));
            }
        }
        return answer.toString();
    }
}