package level1;

// ��� ���� ��������
public class MiddleLetter {
	public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        if(len%2==0) {
        	answer = s.substring(len/2-1,len/2+1);	// ¦���� ��� ���� �� �ڸ� ��������
        }
        else {
        	answer = s.substring(len/2,len/2+1);	// Ȧ���� ��� ���� �� �ڸ� ��������
        }
        return answer;
        
        // �� �ڵ带 ���ٷ� �ذ��ϴ� ���
        // return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}