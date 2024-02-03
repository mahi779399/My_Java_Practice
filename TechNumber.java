import java.util.Scanner;
import java.lang.Math;

public class TechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0, temp = n;
        for (; n > 0; n /= 10, count++) {
        }
        if (count % 2 != 0) {
            System.out.println("Not a Tech number");
        } else {
            int half1 = temp / (int) Math.pow(10, (count / 2));
            int half2 = temp % (int) Math.pow(10, (count / 2));
            if ((int) Math.pow((half1 + half2), 2) == temp) {
                System.out.println("Tech number");
            } else {
                System.out.println("Not a Tech number");
            }
        }
    }
}
