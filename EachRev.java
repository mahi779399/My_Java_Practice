
//6.to rev each word of a str
import java.util.*;

class EachRev {
    public static void main(String[] args) {
        String c/* ,reverse = "" */;
        String rev = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String a = s.nextLine();
        String[] b = a.split(" ");
        for (String i : b) {
            c = "";
            for (int j = 0; j < i.length(); j++) {
                c = i.charAt(j) + c;
            }
            rev = a.replace(i, c);
            a = rev;
            System.out.println(c);
            // reverse = reverse + c + " ";
        }
        System.out.println(rev);
        s.close();
    }
}