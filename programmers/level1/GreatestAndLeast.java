package level1;

// �ִ������� �ּҰ����
public class GreatestAndLeast {
    public long[] solution(int n, int m) {
        long[] answer = {1, 1};
        
        // ù ��° ���
        answer = getFirstSolution(n, m);
        
        // �� ��° ���
        //answer[0] = getSecondSolution(n, m);  // ��� �Լ��� ���� �ִ����� ���ϱ�
        //answer[1] = (long) n*m/answer[0];     // (n*m)/�ִ����� = �ּҰ����

        return answer;
    }

    // �ݺ������� �ִ������� �ּҰ���� ���ϱ�
    private long[] getFirstSolution(int n, int m) {
        long[] answer = {1, 1};

        int small_num = Math.min(n,m);
        int loop_stop = 0;

        do {
            for (int i = small_num; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    n /= i;
                    m /= i;
                    answer[0] *= i;
                    small_num = Math.min(n, m);
                    loop_stop = i;
                    break;
                }
            }
        } while (loop_stop != small_num && loop_stop != 1);

        answer[1] = answer[0] * n * m;

        return answer;
    }

    // ����Լ��� �ִ����� ���ϱ�
    private long getSecondSolution(int n, int m) {
        if (m == 0) return n;
        return getSecondSolution(m, n%m);
    }

}