public class BasicFun {
    static int PrintAdd(int x, int y) {
        // System.out.println("sum: " + (x + y));
        return x + y;
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        int c = PrintAdd(a, b);
        System.out.println(c);
    }
}