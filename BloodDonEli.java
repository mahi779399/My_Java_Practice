
//eligible for blood donation
import java.util.*;

class BloodDonEli {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = s.nextInt();
        System.out.println("Enter weight: ");
        int wei = s.nextInt();
        if (age < 18) {
            System.out.println("UnderAge");
        } else {
            if (wei <= 50) {
                System.out.println("NotEligible");
            } else {
                System.out.println("Eligible");
            }
        }
        s.close();
    }
}