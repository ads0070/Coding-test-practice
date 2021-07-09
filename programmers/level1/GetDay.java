package level1;

// 2016년
public class GetDay {
	public String solution(int a, int b) {
		int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};	 // 월별 일 수를 미리 저장
		String[] dayOftheWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String answer = "";
        
        int totalDay = 4;	// 해당 문제에서는 totalDay를 4로 설정하면 요일 일치
        //int totalDay = (2016-1)*365 + ((2016-1)/4 - (2016-1)/100 + (2016-1)/400);	// 2016년 전까지의 일 수를 계산 (윤년 고려)
        
        // totalDay에 a월 전까지의 일 수 더하기
        for (int i = 0; i < a-1; i++) {
        	totalDay += months[i];
        }
        
        totalDay += b;	// totalDay에 b 더하기 = 2016년 a월 b일까지의 총 일 수
        
        answer = dayOftheWeek[totalDay%7];
        
        return answer;
    }
}