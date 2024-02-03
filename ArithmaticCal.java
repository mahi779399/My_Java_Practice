import java.util.Scanner;
import java.util.Arrays;

public class ArithmaticCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---.---Enter your arithmatic operation(include '+-*/ and numbers')---.---");
        String op = sc.nextLine();
        char[] opChar = op.toCharArray();
        System.out.println(Arrays.toString(opChar));
        // int a = '+';
        // int b = '-';
        // int c = '*';
        // int d = '/';
        // System.out.println(a);//43
        // System.out.println(b);//45
        // System.out.println(c);//42
        // System.out.println(d);//47
    }
}
