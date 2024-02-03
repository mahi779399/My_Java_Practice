import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        if (temp % sum == 0) {
            System.out.println(temp + " is Navin number...");
        } else {
            System.out.println(temp + " is not Navin number...");
        }
    }
}
