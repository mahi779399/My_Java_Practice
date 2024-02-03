import java.util.Scanner;

public class HappyNumber {
    public static String happy(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum += r * r;
            n /= 10;
        }
        if (sum > 9) {
            return happy(sum);
        } else {
            if (sum > 1) {
                return "Not a Happy number";
            } else {
                return "Happy number";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        // String s = happy(n);
        System.out.println(happy(n));
    }
}
