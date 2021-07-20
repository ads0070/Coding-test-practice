package level1;

// 정수 제곱근 판별
public class SquareRoot {
    public long solution(long n) {
        double sqrt_num = Math.sqrt(n);

        if (sqrt_num-Math.floor(sqrt_num) != 0) return -1;
        else return (long) Math.pow(Math.sqrt(n) + 1, 2);
    }
}