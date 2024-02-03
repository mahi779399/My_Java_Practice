import java.lang.Math;
public class MathClass {
    public static void main(String[] args){
        System.out.println(Math.abs(-2349876l));
        System.out.println(Math.E);
        System.out.println(Math.PI);
        int c = 2147483646; // Maximum value for a signed int
        int d = 2;
        System.out.println(c+d);
        try {
            int result = Math.addExact(c, d);
            System.out.println("Result of adding " + c + " and " + d + ": " + result);
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred for int addition.");
        }
        System.out.println(Math.ceil(2.3445601));
        System.out.println(Math.floor(2.3445601));
        System.out.println(Math.round(2.3445601));
        System.out.println(Math.floorDiv(20, 6));
        System.out.println(Math.floorMod(20,6));
        System.out.println(20/6);

        double originalValue = 5.5;
        double nextDownValue = Math.nextDown(originalValue);
        System.out.println("Original value: " + originalValue);
        System.out.println("Next down value: " + nextDownValue);
        System.out.println((int)(Math.random()*100));
    }
}
