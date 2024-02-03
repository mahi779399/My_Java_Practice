
//1.to count num of char in a str
import java.util.*;

class StrCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = s.nextLine();
        System.out.println("Num of char's in a str: " + s1.length());
        s.close();
    }
}