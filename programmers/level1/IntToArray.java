package level1;

// �ڿ��� ������ �迭�� �����
public class IntToArray {
	public int[] solution(long n) {
		String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int loc = 0;
        
        for (int i = num.length()-1; i >= 0; i--) {
        	answer[loc] = Character.getNumericValue(num.charAt(i));
        	loc++;
        }
        
        return answer;
    }
}