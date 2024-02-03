// import java.util.Scanner;

public class GCD {
    // public static int commonDivisor(int x, int y) {
    // int commonDiv = 1;
    // if (x == y) {
    // commonDiv = x;
    // return commonDiv;
    // } else {
    // int i = 1;
    // while (i <= x && i <= y) {
    // if ((x % i) == 0 && (y % i) == 0) {
    // commonDiv = i;
    // }
    // i++;
    // }
    // return commonDiv;
    // }
    // }
    public static int minDiv(int[] x, int i) {
        int flag = 0;
        for (int num : x) {
            if (num % i != 0) {
                flag = 1;
            }
        }
        return flag;
    }

    public static int commonVarArg(int... x) {
        int commonVar = 1;
        int min = x[0];
        int c = 0;
        for (int num : x) {
            if (num == min) {
                c++;
            }
            if (num < min) {
                min = num;
            }
        }
        if (c == x.length) {
            return min;
        } else {
            int i = 1;
            while (i <= min) {
                if (minDiv(x, i) == 0) {
                    commonVar = i;
                }
                i++;
            }
            return commonVar;
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("GCD of two numbers: " + commonDivisor(a, b));
        System.out.println("GCD of three numbers: " + commonVarArg(24, 36, 60));
        System.out.println("GCD of four numbers: " + commonVarArg(24, 36, 60, 120));
        System.out.println("GCD of five numbers: " + commonVarArg(60, 36, 120, 240));
        System.out.println("GCD of five numbers: " + commonVarArg(24, 24, 24, 24, 24));
        System.out.println("GCD of five numbers: " + commonVarArg(24, 37, 47, 27, 59));
        // sc.close();
    }
}
