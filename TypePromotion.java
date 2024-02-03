public class TypePromotion {
    // public void add(int a, long b) {
    // System.out.println("int a and long b: " + (a + b));
    // }

    // public void add(int a, int b) {
    // System.out.println("int a and int b: " + (a + b));
    // }

    public void add(long a, int b) {
        System.out.println("long a and int b: " + (a + b));
    }

    public void add(long a, long b) {
        System.out.println("long a and long b: " + (a + b));
    }

    // public void add(int a, int b, int c) {
    // System.out.println("int a, int b, int c: " + (a + b + c));
    // }

    // public void add(int a, int b, long c) {
    // System.out.println("int a, int b, long c: " + (a + b + c));
    // }

    // public void add(int a, long b, int c) {
    // System.out.println("int a, long b, int c: " + (a + b + c));
    // }

    // public void add(int a, long b, long c) {
    // System.out.println("int a, long b, long c: " + (a + b + c));
    // }

    // public void add(long a, int b, int c) {
    // System.out.println("long a, int b, int c: " + (a + b + c));
    // }

    // public void add(long a, int b, long c) {
    // System.out.println("long a, int b, long c: " + (a + b + c));
    // }

    // public void add(long a, long b, int c) {
    // System.out.println("long a, long b, int c: " + (a + b + c));
    // }

    // public void add(long a, long b, long c) {
    // System.out.println("long a, long b, long c: " + (a + b + c));
    // }

    public static void main(String[] args) {
        TypePromotion tp = new TypePromotion();
        tp.add(10l, 20l);
        // tp.add(100, 20, 30);
    }
}
