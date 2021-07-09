package level1;

// 크레인 인형뽑기 게임
import java.util.ArrayList;
import java.util.List;

public class ClawCrane { 
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] topLoc = new int[board.length];	// 위치 별로 가장 최근에 인형이 뽑혔던 y값을 저장할 topLoc 배열 선언
        List<Integer> basket = new ArrayList<Integer>();	// 뽑은 인형이 담기는 리스트 선언
        basket.add(0);
        int lastLoc = 0;	// basket의 마지막 원소 인덱스 번호를 저장할 변수 선언

        for (int m : moves) {
        	// 반복 횟수를 줄이기 위해 위치 별로 가장 최근에 인형이 뽑혔던 y값(topLoc[m-1])부터 반복문 시작
        	for (int i = topLoc[m-1]; i < board.length; i++) {
        		if (board[i][m-1] != 0) {
        			// basket의 마지막 인형과 뽑은 인형이 같은 인형인 경우
        			if(basket.get(lastLoc) == board[i][m-1]) {
        				answer += 2;
        				basket.remove(lastLoc);	// basket의 마지막 인형을 제거하고, 뽑은 인형도 추가하지 않음
        				lastLoc--;
        			} 
        			// basket의 마지막 인형과 뽑은 인형이 다른 인형인 경우
        			else {
        				basket.add(board[i][m-1]); // basket에 뽑은 인형 추가
        				lastLoc++;
        			}
        			
        			board[i][m-1] = 0;	// 뽑은 인형의 자리를 0으로 초기화
        			topLoc[m-1] = i;
        			break;
        		}
        	}
        }
        return answer;
    }
}
