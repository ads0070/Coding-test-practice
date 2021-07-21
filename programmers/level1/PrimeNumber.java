package level1;

// 소수 찾기
public class PrimeNumber {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            boolean isPnum = true;

            for (int j = 2; (j*j) <= i; j++) {
                if (i % j == 0) {
                    isPnum = false;
                    break;
                }
            }
            if (isPnum) answer++;
        }

        return answer;
    }
}