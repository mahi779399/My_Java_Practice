import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        if (num % 3 == 0) {
            System.out.print("fizz");
        }
        if (num % 5 == 0) {
            System.out.print("buzz");
        }
        sc.close();
    }
}