import java.util.*;

class Basicemi {
    public static void main(String[] args) {
        double emi, P, a, I = 2;
        int D;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        P = s.nextDouble();
        System.out.println("Enter duration amount: ");
        D = s.nextInt();
        a = (P * (I / 100)) * D;
        emi = (a + P) / D;
        System.out.println(emi);
        s.close();
    }
}