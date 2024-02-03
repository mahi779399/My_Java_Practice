
//8. to find count of uppercase letters,lowercase letters,digits and special char in a str
import java.util.*;

class SpeCount {
    public static void main(String[] args) {
        int u = 0, l = 0, sp = 0, d = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str: ");
        String s1 = s.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            int a = s1.codePointAt(i);
            if (65 <= a && a <= 90) {
                u++;
            } else if (97 <= a && a <= 122) {
                l++;
            } else if (48 <= a && a <= 57) {
                d++;
            } else {
                sp++;
            }
        }
        System.out.println("Upper count: " + u);
        System.out.println("Lower count: " + l);
        System.out.println("Digit count: " + d);
        System.out.println("Special count: " + sp);
        s.close();
    }
}