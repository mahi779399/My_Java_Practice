
//15 to verify whether given str is palindrome or not
import java.util.*;

class Palind {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str: ");
        String s1 = s.nextLine();
        /*
         * String b = "";
         * for (int i = 0; i < s1.length(); i++) {
         * b = s1.charAt(i) + b;
         * }
         * if (s1.equals(b)) {
         * System.out.println(s1 + " Is palindrome");
         * } else {
         * System.out.println(s1 + " Is  not a palindrome");
         * }
         */
        int a = 0;
        for (int i = 0; i < s1.length() / 2; i++) {
            if (s1.charAt(i) != s1.charAt((s1.length()) - i - 1)) {
                a++;
                if (a == 1) {
                    break;
                }
            }
        }
        if (a > 0) {
            System.out.println(s1 + " Is  not a palindrome");
        } else {
            System.out.println(s1 + " Is palindrome");
        }
        s.close();
    }
}