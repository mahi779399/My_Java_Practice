public class ThisKeyword {
    // int a = 10;
    // static int c = 30;
    int b = 40;
    int d = 10;

    public ThisKeyword() {
        System.out.println("no parameter constructor");
    }

    // public ThisKeyword(int b) {
    // this();
    // System.out.println(c);
    // c = b;
    // System.out.println(c);
    // this.a = b;
    // System.out.println(a);
    // thisKeywordInstanceMethod(b);
    // thisKeywordStaticMethod(b);
    // }

    // public void thisKeywordInstanceMethod(int e) {
    // System.out.println("this is instance method" + e);
    // }

    // public static void thisKeywordStaticMethod(int f) {
    // System.out.println("this is static method" + f);
    // }
    public void instanceOuter(int a) {
        this.b = a;
        System.out.println(b);
        instanceInner(this);
    }

    public void instanceInner(ThisKeyword obj1) {
        int c = obj1.b;
        this.d = obj1.b;
        System.out.println(c + "  " + d);
    }

    public static void main(String[] args) {
        // ThisKeyword ch = new ThisKeyword(20);
        ThisKeyword ch2 = new ThisKeyword();
        ch2.instanceOuter(20);
        ch2.instanceInner(ch2);

    }
}
