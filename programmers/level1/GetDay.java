package level1;

// 2016³â
public class GetDay {
	public String solution(int a, int b) {
		int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOftheWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String answer = "";
        
        int totalDay = 4;
        //int totalDay = (2016-1)*365 + ((2016-1)/4 - (2016-1)/100 + (2016-1)/400);
        
        for (int i = 0; i < a-1; i++) {
        	totalDay += months[i];
        }
        
        totalDay += b;
        
        answer = dayOftheWeek[totalDay%7];
        
        return answer;
    }
}