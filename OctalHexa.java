import java.util.Scanner;
import java.lang.Long;

public class OctalHexa {
    public static void octalDec(long a) {
        long b = a;
        int f = 0;
        while (b != 0) {
            long r = b % 10;
            b /= 10;
            if (r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5 || r == 6 || r == 7) {
                f = 0;
            } else {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            String conv = Long.toString(a);
            System.out.println(Long.parseLong(conv, 8));
        } else {
            System.out.print("Not an Octal number");
        }
    }

    public static void hexaDec(String a) {
        int f = 0;
        for (int i = 0; i < a.length(); i++) {
            if ("0123456789ABCDEabcde".contains("" + a.charAt(i))) {
                f = 0;
            } else {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            // String conv = Long.toString(a);
            System.out.println(Long.parseLong(a, 16));
        } else {
            System.out.print("Not a Hexa number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Octal number: ");
        long octal = sc.nextLong();
        System.out.println("Enter a Hexa number: ");
        String hexa = sc.next();
        octalDec(octal);
        hexaDec(hexa);
        sc.close();
    }
}
