package level1;

//신규 아이디 추천
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class RecommendID {
	public String solution(String new_id) {
        String answer = "";
        int[] Special_Char = {45,46,95};
        
        // 1단계. new_id의 모든 대문자를 대응되는 소문자로 치환 
        new_id = new_id.toLowerCase();
        //System.out.println("1단계: "+new_id);
        
        // 2단계. new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
        byte bytes[] = new_id.getBytes(StandardCharsets.US_ASCII);	// new_id를 아스키코드로 변환
        
        new_id = "";
        for (byte letter : bytes) {
        	// 알파벳 소문자, 숫자, 빼기(-), 밀줄(_), 마침표(.)인 경우만 new_id에 추가
        	if ((letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57) || IntStream.of(Special_Char).anyMatch(x -> x == letter)) {
        		new_id += (char)letter;	// 아스키코드인 letter을 char형으로 변환
        	}
        }
        //System.out.println("2단계: "+new_id);
        
        // 3단계. new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        char[] chars = new_id.toCharArray();	// new_id를 글자별로 쪼개서 chars 배열에 저장
        char previous_letter = 'a';
        new_id = "";
           
        for (char letter : chars) {
        	if (letter == '.') {
        		if (letter == previous_letter) {
        			continue; // 마침표(.)가 연속되는 경우 continue하여 new_id에 추가되지 않도록 함.
        		}
        	}
        	new_id += letter;
        	previous_letter = letter;
        }
        //System.out.println("3단계: "+new_id);
        
        // 4단계. new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거
           
        if (new_id.charAt(0) == '.') {
        	new_id = new_id.substring(1); // 맨 앞 마침표 제거
        }
           
        if (!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.') {
        	new_id = new_id.substring(0, new_id.length()-1); // 맨 뒤 마침표 제거
        }
        //System.out.println("4단계: "+new_id);
        
        // 5단계. new_id가 빈 문자열이라면, new_id에 "a"를 대입
        if (new_id.isEmpty()) {
        	new_id += 'a';
        }
        //System.out.println("5단계: "+new_id);
        
        // 6단계. new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        //		 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
        if (new_id.length() >= 16) {
        	new_id = new_id.substring(0, 15);
        	if (new_id.charAt(14) == '.') {
        		new_id = new_id.substring(0, 14);
        	}
        }
        //System.out.println("6단계: "+new_id);
        
        // 7단계. new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
        int len = new_id.length();
        char letter = new_id.charAt(new_id.length()-1);
        
        if (len <= 2) {
        	while (len <= 2) {
        		new_id += letter;
        		len++;
        	}
        }
        //System.out.println("7단계: "+new_id);
        
        answer = new_id;
        return answer;
    }
}
