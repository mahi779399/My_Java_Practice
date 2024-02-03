
//13 given 1st input and last input print last name first then followed by "," and first char of the first name
import java.util.*;

class S2S1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str1: ");
        String s1 = s.nextLine();
        System.out.println("Enter str2: ");
        String s2 = s.nextLine();
        System.out.println(s2 + "," + s1.charAt(0));
        s.close();
    }
}