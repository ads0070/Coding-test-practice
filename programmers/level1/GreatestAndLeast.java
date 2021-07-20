package level1;

// 최대공약수와 최소공배수
public class GreatestAndLeast {
    public long[] solution(int n, int m) {
        long[] answer = {1, 1};
        
        // 첫 번째 방법
        answer = getFirstSolution(n, m);
        
        // 두 번째 방법
        //answer[0] = getSecondSolution(n, m);  // 재귀 함수를 통해 최대공약수 구하기
        //answer[1] = (long) n*m/answer[0];     // (n*m)/최대공약수 = 최소공배수

        return answer;
    }

    // 반복문으로 최대공약수와 최소공배수 구하기
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

    // 재귀함수로 최대공약수 구하기
    private long getSecondSolution(int n, int m) {
        if (m == 0) return n;
        return getSecondSolution(m, n%m);
    }

}