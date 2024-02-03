import java.util.Scanner;

public class UniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0, count = 0, min = 0, max = 0, rc = 0;
        for (; n > 0; n /= 10, count++) {
            int r = n % 10;
            if (r == 0) {
                rc++;
            }
            sum += r;
            if (r > max) {
                max = r;
            } else {
                min = r;
            }
        }
        if (rc > 1) {
            System.out.println("Not a Unique number");
        } else if (rc == 1) {
            if (max == count - 1) {
                System.out.println("Unique Number");
            } else {
                System.out.println("Not a Unique number");
            }
        } else {
            if (max == count) {
                System.out.println("Unique Number");
            } else {
                System.out.println("Not a Unique number");
            }
        }

    }
}
