import java.util.Scanner;

public class SpeedAir {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            int a = sc.nextInt();
            a = a * 10;
            a = a - 25;
            a = a / 5;
            total += a;
        }
        total /= 10;
        if (total > 300 && total < 1000) {
            System.out.println("you speed sound is in air");
        }
        sc.close();
    }
}