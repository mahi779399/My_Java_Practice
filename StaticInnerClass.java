class StaticOuter {
    int a = 10;
    static int b = 20;

    public void staticOuterInstanceMethod() {
        System.out.println("this is instance method in static outer: " + a + " : " + b);
    }

    public static void staticOuterStaticMethod() {
        System.out.println("this is static method in static outer: " + b);
    }

    static class StaticInner {
        public void staticInnerInstanceMethod() {
            System.out.println("this is instance method in static inner: " + b);
            staticOuterStaticMethod();
            StaticOuter obj = new StaticOuter();
            obj.staticOuterInstanceMethod();
        }

        public static void staticInnerStaticMethod() {
            System.out.println("this is static method in static inner: " + b);
            staticOuterStaticMethod();
        }

        // @Override //Not possible
        // public void staticOuterInstanceMethod() {
        //     System.out.println("this is instance method in static outer over ride in static inner: ");
        // }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        StaticOuter obj2 = new StaticOuter();
        obj2.staticOuterInstanceMethod();
        StaticOuter.staticOuterStaticMethod();
        StaticOuter.StaticInner obj3 = new StaticOuter.StaticInner();
        obj3.staticInnerInstanceMethod();
        StaticOuter.StaticInner.staticInnerStaticMethod();
    }
}
