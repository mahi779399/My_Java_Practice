import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your age: ");
        // int ge=sc.nextInt();
        // System.out.println("Enter your weight: ");
        // int weight=sc.nextInt();
        // System.out.println("Any donations since 3 months(yes/no): ");
        // /sc.nextLine();
        // String donation=sc.next();
        // System.out.println("Any sickness since 1 month(yes/no): ");
        // String sickness=sc.next();
        System.out.println("Enter your age: ");
        if(sc.nextInt()<20){
            System.out.println("Under age, not eligible");
        }
        else{
            System.out.println("Enter your weight: ");
            if(sc.nextInt()<50){
                System.out.println("Under weight, not eligible");
            }
            else{
                System.out.println("Any donations since 3 months(yes/no): ");
                if(sc.next().equals("yes")){
                    System.out.println("Not eligible");
                }
                else{
                    System.out.println("Any sickness since 1 month(yes/no): ");
                    if(sc.next().equals("yes")){
                        System.out.println("Not eligible");
                    }
                    else{
                        System.out.println("Eligible to Donate blood");
                    }
                }
            }
        }
        sc.close();
    }
}