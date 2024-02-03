import java.util.Scanner;

public class Division {
    // static int c = 0;

    // public static int divi(int x, int y) {
    // if (x >= y) {
    // ++c;
    // return (divi(x - y, y));
    // } else {
    // return c;
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int r = 0;
        while (c >= d) {
            ++r;
            c = c - d;
        }
        System.out.println("After division using recursion: " + r);
        // System.out.println("After division using recursion: " + divi(c, d));
        sc.close();
    }
}
