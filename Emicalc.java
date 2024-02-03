import java.util.*;

class Emicalc {
    public static void main(String[] args) {
        double Emi, p, a, b, i;
        int d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        p = s.nextDouble();
        System.out.println("Enter duration amount: ");
        d = s.nextInt();
        System.out.println("Enter rate of interest per annum: ");
        i = s.nextDouble();
        a = i / 12 / 100;
        b = Math.pow((1 + a), d);
        Emi = (p * a * b) / (b - 1);
        System.out.println("Monthly interest: ");
        System.out.println(Math.ceil(Emi));
        System.out.println("Total interest: ");
        System.out.println(Math.ceil(Emi * d) - p);
        System.out.println("Total to be paid: ");
        System.out.println(Math.ceil(Emi * d));
        s.close();
    }
}