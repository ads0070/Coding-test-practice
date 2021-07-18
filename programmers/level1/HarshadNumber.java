package level1;

// ÇÏ»þµå ¼ö
public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        String num = Integer.toString(x);

        for (int i = 0; i < num.length(); i++) {
            sum += Character.getNumericValue(num.charAt(i));
        }

        return x % sum == 0;
    }
}