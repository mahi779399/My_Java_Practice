class Parent1 {
    // public int a = 10;
    // public static int b = 20;

    public Parent1() {
        System.out.println("Parent1 no parameter constructor");
        // instanceOverrideMethod1();
        // staticOverrideMethod1();
    }

    {
        System.out.println("Parent1 Instance block ");
    }
    static {
        System.out.println("Parent1 Static block ");
    }

    // public void parentInstanceMethod1() {
    // System.out.println("Parent1 instance method");
    // }

    // public static void ParentStaticMethod1() {
    // System.out.println("Parent1 static method");
    // }
    public void instanceOverrideMethod1() {
        System.out.println("Parent1 instance override method");
    }

    public static void staticOverrideMethod1() {
        System.out.println("Parent1 static override method");
    }
}

class Child2 extends Parent1 {
    public Child2() {
        // super();
        System.out.println("Child2 no parameter constructor");
    }

    {
        System.out.println("Child2 Instance block ");
    }
    static {
        System.out.println("Child2 Static block ");
    }

    // public void childInstanceMethod1() {
    // super.parentInstanceMethod1();
    // Parent1.ParentStaticMethod1();
    // System.out.println("Child2 instance method");
    // }

    // public static void childStaticMethod1() {
    // Parent1.ParentStaticMethod1();
    // Parent1 p = new Parent1();
    // p.parentInstanceMethod1();
    // System.out.println("Child2 static method " + p.a);
    // }
    public void instanceOverrideMethod1() {
        System.out.println("Child2 instance override method");
    }

    public static void staticOverrideMethod1() {
        System.out.println("Child2 static override method");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Child2 ch = new Child2();
        Parent1 ch1 = new Child2();
        // Parent1 ch2 = new Parent1();
        // ch.childInstanceMethod1();
        // ch.parentInstanceMethod1();
        // Child2.childStaticMethod1();
        // Child2.ParentStaticMethod1();
        // ch1.childInstanceMethod1(); error
        // ch1.parentInstanceMethod1();
        // Child2.childStaticMethod1();
        // Child2.ParentStaticMethod1();
        // ch.instanceOverrideMethod1();
        ch1.instanceOverrideMethod1();
        // ch2.instanceOverrideMethod1();
        // ch.staticOverrideMethod1();
        // ch1.staticOverrideMethod1();
        // ch.instanceOverrideMethod1();
        // ch1.instanceOverrideMethod1();
    }
}
