interface InterfaceInterface {
    default void interDefaultMethod1() {
        System.out.println("this is default in interface");
        interStaticMethod1();
        interAbsMethod1();
    }

    static void interStaticMethod1() {
        System.out.println("this is static in interface");
        // interDefaultMethod1();
    }

    void interAbsMethod1();
}

class InterConcrete implements InterfaceInterface {
    @Override
    public void interAbsMethod1() {
        System.out.println("this is abstarct method implemented in class");
    }

    public void concMethod1() {
        System.out.println("this is instance method in concrete class");
    }
}

public class InterfaceMethods {
    // @Override
    // public void interAbsMethod1() {
    // System.out.println("this is abstarct method implemented in class");
    // }

    public static void main(String[] args) {
        InterConcrete obj = new InterConcrete();
        /*
         * if object is of InterfaceInterface interface type concMethd1() cant be
         * cause its not type of InterConcrete class.
         */
        obj.interAbsMethod1();
        obj.interDefaultMethod1();
        InterfaceInterface.interStaticMethod1();
        obj.concMethod1();
    }
}
