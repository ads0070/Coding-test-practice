package level1;

// 이상한 문자 만들기
public class CreateWeirdChar {
    public String solution(String s) {
        String answer = "";
        StringBuilder word_builder = new StringBuilder();

        s = s.toLowerCase();
        s += ".";   // split 할 때 문자열 뒤의 공백 문자를 살리기 위해 문자열 맨 뒤에 마침표(.)를 임시로 추가
        String[] word = s.split(" ");   // 공백을 기준으로 s 문자열을 split하여 word 배열에 저장

        for (int i = 0; i < word.length; i++) {
            word_builder.setLength(0);
            word_builder.append(word[i]);

            for (int j = 0; j < word[i].length(); j+=2) {
                word_builder.setCharAt(j, Character.toUpperCase(word_builder.charAt(j)));
            }
            
            // 임시로 추가했던 마침표(.) 제거
            if (i == word.length - 1) {
                word_builder.deleteCharAt(word[i].length() - 1);
            }

            word[i] = String.valueOf(word_builder);
        }

        answer = String.join(" ",word); // word 배열의 각 원소을 공백을 두고 join시켜 문자열로 변환

        return answer;
    }
}
