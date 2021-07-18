package level1;

// 핸드폰 번호 가리기
public class HideNumber {
    public String solution(String phone_number) {
        String answer = "";
        int standard = phone_number.length() - 4;

        answer = phone_number.substring(0,standard).replaceAll("[0-9]","*")
                    + phone_number.substring(standard);

        return answer;
    }
}