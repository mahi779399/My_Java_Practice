public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // swapping two numbers using addition and subtraction without using tamp
        // variable.
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping with Addition and Subtraction: " + a + "  " + b);
        // swapping two numbers using multiplication and division without using tamp
        // variable.
        int c = 30;
        int d = 40;
        c = (c * d);
        d = c / d;
        c = c / d;
        System.out.println("After swapping with Multiplication and Division: " + c + "  " + d);
        int e = 50;
        int f = 60;
        e = e ^ f;
        f = e ^ f;
        e = e ^ f;
        System.out.println("After swapping with Multiplication and Division: " + e + "  " + f);
    }
}
