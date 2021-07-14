package level1;

// 숫자 문자열과 영단어
public class ChangeToNumber {
	public int solution(String s) {
		int answer = 0;
		
        answer = FirstSolution(s);
        //answer = SecondSolution(s);
        
        return answer;
    }
	
	private int FirstSolution(String s) {
		int answer = 0;
		String[] num = {"0","1","2","3","4","5","6","7","8","9"};
		String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(word[i], num[i]);
		}
		
		answer = Integer.parseInt(s);
		
		return answer;
	}
	
	private int SecondSolution(String s) {
		int answer = 0;
        String number = "";
        String[][] word_table = {
        		{"z","0","3"},
        		{"o","1","2"},
        		{"tw","2","1"},
        		{"th","3","3"},
        		{"fo","4","2"},
        		{"fi","5","2"},
        		{"si","6","1"},
        		{"se","7","3"},
        		{"e","8","4"},
        		{"n","9","3"},
        };
        
        String letter = "";
        char[] str = s.toCharArray();
        int pass_num = 0;
        
        for (char w : str) {
        	if (pass_num != 0) {
        		pass_num--;
        		continue;
        	}
        	
        	int num = Character.getNumericValue(w);
        	
        	if (num >= 0 && num < 10) {
        		number += w;
        		continue;
        	}
        	
        	letter += w;
        	
        	for (int i = 0; i < 10; i++) {
        		if (letter.equals(word_table[i][0])) {
        			number += word_table[i][1];
        			pass_num = Integer.parseInt(word_table[i][2]);
        			letter = "";
        			break;
        		}
        	}
        }
        
        answer = Integer.parseInt(number);
		
		return answer;
	}
}