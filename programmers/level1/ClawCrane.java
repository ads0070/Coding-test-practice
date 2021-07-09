package level1;

// ũ���� �����̱� ����
import java.util.ArrayList;
import java.util.List;

public class ClawCrane { 
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] topLoc = new int[board.length];	// ��ġ ���� ���� �ֱٿ� ������ ������ y���� ������ topLoc �迭 ����
        List<Integer> basket = new ArrayList<Integer>();	// ���� ������ ���� ����Ʈ ����
        basket.add(0);
        int lastLoc = 0;	// basket�� ������ ���� �ε��� ��ȣ�� ������ ���� ����

        for (int m : moves) {
        	// �ݺ� Ƚ���� ���̱� ���� ��ġ ���� ���� �ֱٿ� ������ ������ y��(topLoc[m-1])���� �ݺ��� ����
        	for (int i = topLoc[m-1]; i < board.length; i++) {
        		if (board[i][m-1] != 0) {
        			// basket�� ������ ������ ���� ������ ���� ������ ���
        			if(basket.get(lastLoc) == board[i][m-1]) {
        				answer += 2;
        				basket.remove(lastLoc);	// basket�� ������ ������ �����ϰ�, ���� ������ �߰����� ����
        				lastLoc--;
        			} 
        			// basket�� ������ ������ ���� ������ �ٸ� ������ ���
        			else {
        				basket.add(board[i][m-1]); // basket�� ���� ���� �߰�
        				lastLoc++;
        			}
        			
        			board[i][m-1] = 0;	// ���� ������ �ڸ��� 0���� �ʱ�ȭ
        			topLoc[m-1] = i;
        			break;
        		}
        	}
        }
        return answer;
    }
}
