import java.util.Scanner;
import java.lang.Long;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long a = num;
        int f = 0;
        while (num != 0) {
            long r = num % 10;
            num = num / 10;
            if (r == 1 || r == 0) {
                f = 0;
            } else {
                f = 1;
                break;
            }
        }
        if (f == 0) {
            String conv = Long.toString(a);
            // int bin = 0b1010;
            // System.out.println(bin);
            // System.out.println(0b10101);
            System.out.println(Long.parseLong(conv, 2));
        } else {
            System.out.println("Not a binary number");
        }
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(-0b1010);
        sc.close();
    }
}
