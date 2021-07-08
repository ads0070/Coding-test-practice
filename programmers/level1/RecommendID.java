package level1;

//신규 아이디 추천
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;

public class RecommendID {
	public String solution(String new_id) {
        String answer = "";
        int[] Special_Char = {45,46,95};
        
        // 1단계
        new_id = new_id.toLowerCase();
        //System.out.println("1단계: "+new_id);
        
        // 2단계
        byte bytes[] = new_id.getBytes(StandardCharsets.US_ASCII);
        
        new_id = "";
        for (byte letter : bytes) {
        	if ((letter >= 97 && letter <= 122) || (letter >= 48 && letter <= 57) || IntStream.of(Special_Char).anyMatch(x -> x == letter)) {
        		new_id += (char)letter;
        	}
        }
        //System.out.println("2단계: "+new_id);
        
        // 3단계
        char[] chars = new_id.toCharArray();
        char previous_letter = 'a';
        new_id = "";
        for (char letter : chars) {
        	if (letter == '.') {
        		if (letter == previous_letter) {
        			continue;
        		}
        	}
        	new_id += letter;
        	previous_letter = letter;
        }
        //System.out.println("3단계: "+new_id);
        
        // 4단계
        if (new_id.charAt(0) == '.') {
        	new_id = new_id.substring(1);
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.') {
        	new_id = new_id.substring(0, new_id.length()-1);
        }
        //System.out.println("4단계: "+new_id);
        
        // 5단계
        if (new_id.isEmpty()) {
        	new_id += 'a';
        }
        //System.out.println("5단계: "+new_id);
        
        // 6단계
        if (new_id.length() >= 16) {
        	new_id = new_id.substring(0, 15);
        	if (new_id.charAt(14) == '.') {
        		new_id = new_id.substring(0, 14);
        	}
        }
        //System.out.println("6단계: "+new_id);
        
        // 7단계
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
