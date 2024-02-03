
/*
 *           * * * *    *       *
 * *         * * *      * *     * *
 * * *       * *        * * *   * * *
 * * * * and *      and * * *and* *
                        * *     *
                        * 
 */
import java.util.*;

class Pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter char: ");
        char c = s.next().charAt(0);
        System.out.println("Enter length: ");
        int l = s.nextInt();
        String ch = "" + c;

        /*
         * for (int i = 1; i <= l; i++) {
         * System.out.println(((ch + " ").repeat(i)).trim());
         * }
         * 
         * for (int i = l - 1; i > 0; i--) {//i=l
         * System.out.println(((ch + " ").repeat(i)).trim());
         * }
         */
        /*
         * int i = 1, j = 1;
         * while (i < l + l) {// <=
         * if (1 <= i && i <= l) {
         * System.out.println(((ch + " ").repeat(i)).trim());
         * i++;
         * } else {
         * System.out.println(((ch + " ").repeat(i - j - 1)).trim());// i-j
         * j += 2;
         * i++;
         * }
         * }
         */
        for (int i = 1; i <= l; i++) {
            for (int j = l; j >= i; j--) {
                System.out.print(ch + " ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("    ");
            }
            // for (int k = 1; k < i; k++) {
            // System.out.print(" ");
            // }
            for (int j = l; j >= i; j--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            for (int k = l; k > i; k--) {
                System.out.print("    ");
            }
            // for (int k = l; k > i; k--) {
            // System.out.print(" ");
            // }
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        s.close();
    }
}