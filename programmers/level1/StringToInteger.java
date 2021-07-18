package level1;

// 문자열을 정수로 바꾸기
public class StringToInteger {
    public int solution(String s) {
        int answer = 0;

        // 내장 함수로 변환하는 방법
        // answer = Integer.parseInt(s);
        // return answer;

        // 직접 변환하는 방법
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