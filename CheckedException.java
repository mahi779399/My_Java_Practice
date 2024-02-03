import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        try{
            a=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Entered value is not an integer");
            System.out.println(e);
            a=sc.nextInt();
        }
        System.out.println(a);
        sc.close();
    }
}
