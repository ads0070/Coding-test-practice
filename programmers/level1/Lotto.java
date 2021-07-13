package level1;

// �ζ��� �ְ� ������ ���� ����
import java.util.stream.IntStream;

/*����	    ��÷ ����
   1	  6�� ��ȣ�� ��� ��ġ
   2	  5�� ��ȣ�� ��ġ
   3	  4�� ��ȣ�� ��ġ
   4	  3�� ��ȣ�� ��ġ
   5	  2�� ��ȣ�� ��ġ
   6(��÷)	�� ��*/
public class Lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];  // answer[0] : �ִ� ����, answer[1] : ���� ����
        int same_num = 0;	 		// ���� ���� ����
        int unknown_num = 0; 		// �𸣴� ����(=0) ����
        
        for (int lotto_num : lottos) {
        	// 0�� ���� ����
        	if (lotto_num == 0) {
        		unknown_num++;
        		continue;
        	}
        	// ���� ������ ���� ����
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
