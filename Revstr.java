
//4.to rev a str
import java.util.*;
//import java.util.Arrays;
//import java.util.ArrayList;

class Revstr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String a = s.nextLine();
        /*
         * String[] b = a.split("");
         * // ArrayList<String> strList = new ArrayList<String>(Arrays.asList(b));
         * String rev = "";
         * for (String c : b) {
         * rev = c + rev;
         * }
         * System.out.println(rev);
         */

        String b = "";
        for (int i = 0; i < a.length(); i++) {
            b = a.charAt(i) + b;
        }
        System.out.println(b);
        System.out.println(a.getClass().getName());
        /*
         * for (int i = (a.length()) - 1; i >= 0; i--) {
         * System.out.print(a.charAt(i));
         * }
         */
        s.close();

    }
}