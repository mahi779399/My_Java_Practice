import java.util.Scanner;

public class Pension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Enter gender(male/female): ");
        String gender = sc.next();
        System.out.println("Any Disability(yes/no): ");
        String disability = sc.next();
        System.out.println("widow(yes/no): ");
        String widow = sc.next();
        if (age >= 5 && disability.equals("yes")) {
            System.out.println("Eligible for Disability Pension");
        }
        if (age >= 40 && gender.equals("female") && widow.equals("yes")) {
            System.out.println("Eligible for Widow Pension");
        }
        if (age >= 55 && disability.equals("no") && !(gender.equals("female") && widow.equals("yes"))) {
            System.out.println("Eligible for Oldage Pension");
        }
        sc.close();
    }
}