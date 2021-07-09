package level1;

// 가운데 글자 가져오기
public class MiddleLetter {
	public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        if(len%2==0) {
        	answer = s.substring(len/2-1,len/2+1);	// 짝수면 가운데 글자 두 자리 가져오기
        }
        else {
        	answer = s.substring(len/2,len/2+1);	// 홀수면 가운데 글자 한 자리 가져오기
        }
        return answer;
        
        // 위 코드를 한줄로 해결하는 방법
        // return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}