package level1;

// 크레인 인형뽑기 게임
import java.util.ArrayList;
import java.util.List;

public class ClawCrane {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] topLoc = new int[board.length];
        List<Integer> basket = new ArrayList<Integer>();
        basket.add(0);
        int lastLoc = 0;

        for (int m : moves) {
        	for (int i = topLoc[m-1]; i < board.length; i++) {
        		if (board[i][m-1] != 0) {
        			
        			if(basket.get(lastLoc) == board[i][m-1]) {
        				answer += 2;
        				basket.remove(lastLoc);
        				lastLoc--;
        			} else {
        				basket.add(board[i][m-1]);
        				lastLoc++;
        			}
        			
        			board[i][m-1] = 0;
        			topLoc[m-1] = i;
        			break;
        		}
        	}
        }
        return answer;
    }
}
