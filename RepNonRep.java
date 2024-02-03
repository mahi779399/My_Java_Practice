
//9.to find first repeated and non repeated characters in a str
import java.util.*;

class RepNonRep {
    public static void main(String[] args) {
        int f = 0, n = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str: ");
        String s1 = s.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            int fc = 0, nc = 0;
            for (int j = i + 1; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)) {
                    fc++;
                } else {
                    nc++;
                }
            }
            if (f == 1 && n == 1) {
                break;
            }
            if (fc > 0) {
                if (f == 1) {
                    continue;
                }
                System.out.println("First Repeated: " + s1.charAt(i));
                f++;
                continue;
            }
            if (nc > 0) {
                if (n == 1) {
                    continue;
                }
                System.out.println("First Nonrepeated: " + s1.charAt(i));
                n++;
                continue;
            }
        }
        s.close();
    }
}