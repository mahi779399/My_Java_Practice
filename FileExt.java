
//14 to print filename extension in console
import java.util.*;

class FileExt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String s1 = s.nextLine();
        System.out.println(s1.substring(s1.indexOf(".")));
        s.close();
    }
}