
import java.util.Scanner;

public class RussianMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number2 ");
        int n2 = sc.nextInt();
        int sum = 0;

        // If n1 is odd, add n2 to sum and halve n1 and double n2
        if (n1 % 2 != 0) {
            sum = n2;
        }

        // While n1 is not 1, keep halving n1 and doubling n2
        // If n1 is odd at any point, add n2 to sum and halve n1 and double n2
        while (n1 > 1) {
            // System.out.println(sum);
            n1 /= 2;
            n2 *= 2;
            if (n1 % 2 != 0) {
                sum += n2;
            }
            // System.out.println(sum);
        }

        // Print the result of Russian Multiplication
        System.out.println("Russian Multiplication: " + sum);
        sc.close();
    }
}

//
// This code implements the Russian Multiplication algorithm. It takes two
// numbers as input and calculates their product using the Russian
// Multiplication method. The algorithm works by halving the first number and
// doubling the second number until the first number becomes 1. If the first
// number is odd at any point, the second number is added to the sum. Finally,
// the sum is printed as the result of the Russian Multiplication..</s>