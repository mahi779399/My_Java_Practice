import java.util.Scanner;

public class Minicalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator: ");
        String c = sc.next();
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        switch (c) {
            case "+":
                System.out.print("sum = " + (a + b));
                break;
            case "-":
                System.out.print("diff = " + (a - b));
                break;
            case "*":
                System.out.print("mul = " + (a * b));
                break;
            case "/":
                System.out.print("div = " + (a / b));
                break;
            case "%":
                System.out.print("rem = " + (a % b));
                break;
            default:
                System.out.print("Invalid operator");
                sc.close();
        }
    }
}