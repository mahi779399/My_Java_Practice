
// 12 compare two strs if chars in str1 are present in str2 then it should be printed as such in output, else'+' should be printed in output
import java.util.*;

class StrCom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String s1 = s.nextLine();
        System.out.println("Enter str2: ");
        String s2 = s.nextLine();
        if (s1.equals(s2)) {
            System.out.println(s1);
        } else {
            System.out.println("+");
        }
        s.close();
    }
}