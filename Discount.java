import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        if (total < 2000) {
            System.out.println("no discount");
        } else if (total >= 2000 && total < 5000) {
            int sav = total * 3 / 100;
            System.out.println("sav: " + sav);
            System.out.println("bill: " + (total - sav));
        } else if (total >= 5000 && total < 10000) {
            int sav = total * 8 / 100;
            System.out.println("sav: " + sav);
            System.out.println("bill: " + (total - sav));
        } else if (total >= 10000 && total < 15000) {
            int sav = total * 15 / 100;
            System.out.println("sav: " + sav);
            System.out.println("bill: " + (total - sav));
        } else {
            int sav = total * 25 / 100;
            System.out.println("sav: " + sav);
            System.out.println("bill: " + (total - sav));
        }
        s.close();
    }

}
