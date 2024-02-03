
//leap year or not
import java.util.*;

class LeapYearNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year");
        int year = s.nextInt();
        // boolean a = (year % 4 == 0 && year % 100 != 0);
        // boolean b = (year % 400 == 0);
        // System.out.println(a + " " + b);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("LEEP YEAR");
        } else {
            System.out.println("COMMON YEAR");
        }
        s.close();
    }
}