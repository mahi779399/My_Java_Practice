interface AnonymsInterface {
    static void interfaceStatic() {
        System.out.println("this is static interface");
    }

    default void interfaceDefault() {
        System.out.println("this is default interface");
    }

    void interfaceMethod();

    void interfaceMethod1();

    void interfaceMethod2();

    class AnonymsInterfaceInner {

        void anonymsInterInnerMethod() {
            System.out.println("this is anonymus interface inner method");
        }
    }
}

public class AnonymsInnerClass {
    public static void main(String[] args) {
        AnonymsInterface obj = new AnonymsInterface() {
            public void interfaceMethod() {
                System.out.println("this is override interface method");
            }

            public void interfaceMethod1() {
                System.out.println("this is override interface method 1");
            }

            public void interfaceMethod2() {
                System.out.println("this is override interface method 2");
            }

            // public void interfaceMethod 2(){
            // System.out.println("this is override interface method 2 override");
            // }
        };
        AnonymsInterface obj1 = new AnonymsInterface() {
            public void interfaceMethod() {
                System.out.println("this is override interface method 0");
            }

            public void interfaceMethod1() {
                System.out.println("this is override interface method 11");
            }

            public void interfaceMethod2() {
                System.out.println("this is override interface method 22");
            }

            // public void additionalMethod() {
            // System.out.println("additional method");
            // }
        };
        obj.interfaceMethod();
        obj.interfaceMethod1();
        obj1.interfaceMethod2();
        obj1.interfaceDefault();
        AnonymsInterface.interfaceStatic();
        AnonymsInterface.AnonymsInterfaceInner obj2 = new AnonymsInterface.AnonymsInterfaceInner();
        obj2.anonymsInterInnerMethod();
        // obj1.additionalMethod();//error
    }
}
