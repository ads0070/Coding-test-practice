package level1;

// ���簢�� �����
import java.util.Scanner;

public class PrintStars {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder star = new StringBuilder();
        
        for (int i = 0; i < a; i++) {
        	star.append("*");
        }
        
        for (int j = 0; j < b; j++) {
        	System.out.println(star);
        }
    }
}