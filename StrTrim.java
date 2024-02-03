
//5.to rem all str & ending spaces from a str
import java.util.*;

class StrTrim {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a str: ");
        String a = s.nextLine();
        System.out.println(a.trim());
        s.close();
    }
}