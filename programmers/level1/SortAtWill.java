package level1;

// 문자열 내 마음대로 정렬하기
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAtWill {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<String>();
        StringBuilder str = new StringBuilder();

        // 문자열 맨 앞에 인덱스 문자를 추가하기
        for (String s : strings) {
            str.setLength(0);
            str.append(s);
            str.insert(0, s.charAt(n));
            list.add(String.valueOf(str));
        }

        // 배열을 오름차순으로 정렬
        Collections.sort(list);

        // 문자열 맨 앞에 추가한 인덱스 문자 제거
        for (int i = 0; i < list.size(); i++) {
            str.setLength(0);
            str.append(list.get(i));
            str.delete(0,1);
            answer[i] = String.valueOf(str);
        }

        return answer;
    }
}
