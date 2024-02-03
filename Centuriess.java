
//num of centuries for given year
import java.util.*;

class Centuriess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = s.nextInt();
        if (year % 100 == 0) {
            System.out.println(year / 100);
        } else {
            System.out.println((year / 100) + 1);
        }
        s.close();
    }
}