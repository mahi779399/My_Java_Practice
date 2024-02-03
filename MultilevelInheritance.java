class Parent2 {
    public Parent2() {
        System.out.println("Parent2 constructor");
    }

    {
        System.out.println("Parent2 instance block");
    }
    static {
        System.out.println("Parent2 static block");
    }

    public void parent2InstanceMethod1() {
        System.out.println("Parent2 instance method1");
    }

    public static void parent2StaticMethod1() {
        System.out.println("Parent2 static method1");
    }

    public void multiOverride() {
        System.out.println("Override method parent2");
    }
}

class Child3 extends Parent2 {
    public Child3() {
        System.out.println("Child3 constructor");
    }

    {
        System.out.println("Child3 instance block");
    }
    static {
        System.out.println("Child3 static block");
    }

    public void Child3InstanceMethod1() {
        System.out.println("Child3 instance method1");
    }

    public static void Child3StaticMethod1() {
        System.out.println("Child3 static method1");
    }

    public void multiOverride() {
        System.out.println("Override method child3");
    }
}

class Child4 extends Child3 {
    public Child4() {
        System.out.println("Child4 constructor");
    }

    {
        System.out.println("Child4 instance block");
    }
    static {
        System.out.println("Child4 static block");
    }

    public void Child4InstanceMethod1() {
        System.out.println("Child4 instance method1");
    }

    public static void Child4StaticMethod1() {
        System.out.println("Child4 static method1");
    }

    public void multiOverride() {
        System.out.println("Override method child4");
        super.Child3InstanceMethod1();
        super.parent2InstanceMethod1();
    }

}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Child4 ch = new Child4();
        // Child3 ch1 = new Child3();
        // Parent2 ch3 = new Parent2();
        Parent2 ch4 = new Child4();
        ch4.multiOverride();
    }
}
