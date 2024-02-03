public class IncDec {
    public static void main(String[] args) {
        // Example program on Increment
        int a = 10;
        System.out.println("After Preincrement: " + (++a));
        int b = 10;
        System.out.println("After Postincrement: " + (b++));
        // Printing Even numbers using Decrement
        int c = 10;
        int i = 0;
        while (i <= c) {
            System.out.println(c--);
            --c;
        }
        // printing Odd numbers using Decrement
        int d = 20;
        int j = 0;
        while (j < d) {
            System.out.println(--d);
            d--;
        }
    }
}
