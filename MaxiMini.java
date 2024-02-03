import java.util.Scanner;
import java.lang.Math;

public class MaxiMini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = ((a + b - (Math.abs(a - b))) / 2);
        int max = ((a + b + (Math.abs(a - b))) / 2);
        System.out.println(min + "  " + max);
        sc.close();
    }
}
