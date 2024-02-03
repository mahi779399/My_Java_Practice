class ParentSuper {
    int a;

    public ParentSuper(int a) {
        this.a = a;
        System.out.println("parent constructor " + a);
    }

    public void parentMethod() {
        System.out.println("parent method");
    }
}

class Child1Super extends ParentSuper {
    int b;

    public Child1Super(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("child1 constructor " + a + " " + b);
    }

    public void child1Class() {
        super.parentMethod();
        System.out.println("child 1 method");
    }
}

public class SuperClass {
    public static void main(String[] args) {
        Child1Super c1 = new Child1Super(10, 20);
        c1.parentMethod();
        c1.child1Class();
    }
}
