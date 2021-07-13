package level1;

// 로또의 최고 순위와 최저 순위
import java.util.stream.IntStream;

/*순위	    당첨 내용
   1	  6개 번호가 모두 일치
   2	  5개 번호가 일치
   3	  4개 번호가 일치
   4	  3개 번호가 일치
   5	  2개 번호가 일치
   6(낙첨)	그 외*/
public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];  // answer[0] : 최대 순위, answer[1] : 최저 순위
        int same_num = 0;	 		// 같은 숫자 개수
        int unknown_num = 0; 		// 모르는 숫자(=0) 개수
        
        for (int lotto_num : lottos) {
        	// 0의 개수 세기
        	if (lotto_num == 0) {
        		unknown_num++;
        		continue;
        	}
        	// 같은 숫자의 개수 세기
        	if (IntStream.of(win_nums).anyMatch(x -> x == lotto_num)) {
        		same_num++;
        	}
        }
        
        answer[1] = 7 - same_num;
        answer[0] = answer[1] - unknown_num;
        if (answer[1]==7) answer[1] = 6;
        if (answer[0]==7) answer[0] = 6;
        
        return answer;
    }
}
