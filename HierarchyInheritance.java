class Parent3 {
    public Parent3() {
        System.out.println("Parent3 constructor");
    }

    {
        System.out.println("Parent3 instance block");
    }
    static {
        System.out.println("Parent3 static block");
    }

    public void parent3InstanceMethod1() {
        System.out.println("parent3InstanceMethod1 called from Parent3");
    }

    public static void parent3StaticMethod1() {
        System.out.println("parent3StaticMethod1 called from Parent3");
    }

    public void parent3InstanceOverride() {
        System.out.println("parent3OverrideInstance called from Parent3");
    }

    public static void parent3StaticOverride() {
        System.out.println("parent3OverrideStatic called from Parent3");
    }
}

class Child5 extends Parent3 {
    public Child5() {
        System.out.println("child5 constructor");
    }

    {
        System.out.println("child5 instance block");
    }
    static {
        System.out.println("child5 static block");
    }

    public void child5InstanceMethod1() {
        System.out.println("child5InstanceMethod1 called from Parent3");
    }

    public static void child5StaticMethod1() {
        System.out.println("child5StaticMethod1 called from Parent3");
    }

    public void parent3InstanceOverride() {
        System.out.println("child5OverrideInstance called from Parent3");
    }

    public static void parent3StaticOverride() {
        System.out.println("child5OverrideStatic called from Parent3");
    }
}

class Child6 extends Parent3 {
    public Child6() {
        System.out.println("child6 constructor");
    }

    {
        System.out.println("child6 instance block");
    }
    static {
        System.out.println("child6 static block");
    }

    public void child6InstanceMethod1() {
        System.out.println("child6InstanceMethod1 called from Parent3");
    }

    public static void child6StaticMethod1() {
        System.out.println("child6StaticMet hod1 called from Parent3");
    }

    public void parent3InstanceOverride() {
        System.out.println("child6OverrideInstance called from Parent3");
    }

    public static void parent3StaticOverride() {
        System.out.println("child6OverrideStatic called from Parent3");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        // Child6 ch = new Child6();
        // Child5 ch1 = new Child5();
        Parent3 ch2 = new Child6();
        Parent3 ch3 = new Child5();
        Parent3.parent3StaticOverride();
        ch2.parent3StaticOverride();
    }
}
