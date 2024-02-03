class OuterClass {
    private int a = 10;

    public OuterClass() {
        System.out.println("This is outer constructor");
    }

    public OuterClass(int a) {
        this.a = a;
        System.out.println("This is outer constructor with para");
    }

    static {
        System.out.println("This is outer Static block");
    }
    {
        System.out.println("This is outer Instance block");
    }

    public void outerInstanceMethod1() {
        System.out.println("This is Outer Instance Method");
    }

    public static void outerStaticMethod1() {
        System.out.println("This is Outer Static Method");
    }

    public void outerInnerOverriding() {
        System.out.println("This is Outer override Method");
    }

    class Inner {
        public Inner() {
            System.out.println("This is inner constructor");
        }

        static {
            System.out.println("This is inner Static block");
        }
        {
            System.out.println("This is inner Instance block");
        }

        public void innerInstanceMethod1() {
            // outerInstanceMethod1();//comment 01
            // OuterClass.this.outerInstanceMethod1();//comment 02
            // outerStaticMethod1();
            outerInnerOverriding();
            OuterClass.this.outerInnerOverriding();
            System.out.println("This is Inner Instance Method" + a);
        }

        public static void innerStaticMethod1(Inner s, OuterClass t) {
            // outerStaticMethod1();
            // s.innerInstanceMethod1();
            // t.outerInstanceMethod1();
            System.out.println("This is Inner Static Method");
        }

        public void outerInnerOverriding() {
            System.out.println("This is Outer Inner override Method");
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass(20);
        OuterClass obj4 = new OuterClass();
        OuterClass.Inner obj2 = obj1.new Inner();
        OuterClass.Inner obj3 = obj4.new Inner();
        // obj1.outerInstanceMethod1();
        // OuterClass.outerStaticMethod1();
        obj2.innerInstanceMethod1();
        // obj3.innerInstanceMethod1();
        OuterClass.Inner.innerStaticMethod1(obj2, obj1);
    }
}
