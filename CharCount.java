
//3.to count total numof occurances of a given char in a str
import java.util.*;

class CharCount {
    public static void main(String[] args) {
        int c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str: ");
        String s1 = s.nextLine();
        System.out.println("Enter char: ");
        char s2 = s.next().charAt(0);
        // String s3 = "" + s2;
        for (int i = s1.indexOf(s2); i < s1.length(); i++) {
            if (s2 == s1.charAt(i)) {
                c++;
            }
        }
        System.out.println(c);
        s.close();
    }
}