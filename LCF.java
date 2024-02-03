// import java.util.Scanner;

public class LCF {
    // public static int commonFactor(int x, int y) {
    // int commonFav = 1;
    // if (x == y) {
    // commonFav = x;
    // return commonFav;
    // } else {
    // int i = (x < y) ? y : x;
    // while (i > 0) {
    // if ((i % x) == 0 && (i % y) == 0) {
    // commonFav = i;
    // break;
    // }
    // i++;
    // }
    // return commonFav;
    // }
    // }
    public static int maxDiv(int[] x, int i) {
        int flag = 0;
        for (int num : x) {
            if (i % num != 0) {
                flag = 1;
            }
        }
        return flag;
    }

    public static int commonLCFVarArg(int... x) {
        int commonVar = 1;
        int max = x[0];
        int c = 0;
        for (int num : x) {
            if (num == max) {
                c++;
            }
            if (num > max) {
                max = num;
            }
        }
        if (c == x.length) {
            return max;
        } else {
            int i = max;
            while (i > 0) {
                if (maxDiv(x, i) == 0) {
                    commonVar = i;
                    break;
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
        // System.out.println("LCF of two numbers: " + commonFactor(a,b));
        System.out.println("LCF of three numbers: " + commonLCFVarArg(24, 36, 60));
        System.out.println("LCF of four numbers: " + commonLCFVarArg(24, 36, 60, 120));
        System.out.println("LCF of five numbers: " + commonLCFVarArg(60, 36, 120, 240));
        System.out.println("LCF of five numbers: " + commonLCFVarArg(24, 24, 24, 24, 24));
        System.out.println("LCF of five numbers: " + commonLCFVarArg(24, 37, 47, 27, 59));
        // sc.close();
    }
}
