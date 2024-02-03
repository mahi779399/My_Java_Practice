package package02;

public class C {
    {
        System.out.println("instance block CCC");
    }
    static {
        System.out.println("static block CCC");
    }

    public static void cStatic() {
        System.out.println("static method CCC");
    }

    public void cInstance() {
        System.out.println("instance method CCC");
    }

    public static void main(String[] args) {
        System.out.println("haai CCCC main");
    }
}
