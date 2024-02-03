interface AbstractInterface {
    void interAbsMethod1();

    void interAbsMethod2();

    void interAbsMethod3();

    static void interAbsStatic() {
        System.out.println("this is static method in interface");
    }

    default void interAbsDefault() {
        System.out.println("this is default method in interface");
    }
}

abstract class AbstractAbstract implements AbstractInterface {
    @Override
    public void interAbsMethod1() {
        System.out.println("this is interface method 1 implimented in abstract class");
    }

    abstract void absMethod1();

    public AbstractAbstract() {
        System.out.println("this is constructor in abstract class");
    }

    {
        System.out.println("this is instance block in abstract class");
    }
    static {
        System.out.println("this is static block in abstract class");
    }

    public void absInstanceMethod() {
        System.out.println("this is instance method in abstract class");
    }

    public static void absStaticMethod() {
        System.out.println("this is static method in abstract class");
    }
}

class ConcreteClass extends AbstractAbstract {
    public ConcreteClass() {
        System.out.println("this is constructor of concrete class");
    }

    {
        System.out.println("this is instance block of concrete class");
    }
    static {
        System.out.println("this is static block of concrete class");
    }

    @Override
    public void interAbsMethod2() {
        System.out.println("this is interface method 2 implimeted in concrete class");
    }

    @Override
    public void interAbsMethod3() {
        System.out.println("this is interface method 3 implimented in concrete class");
    }

    @Override
    public void absMethod1() {
        System.out.println("this is abstract method in abstract implimented in concreter class");
    }

    @Override
    public void interAbsMethod1() {
        System.out.println("this is interface method 1 implimented in concrete class");
    }

    public void concreteInstanceMethod() {
        System.out.println("this is instance method in concrete class");
    }

    public static void concreteStaticMethod() {
        System.out.println("this is static method in concrete class");
    }

    @Override
    public void absInstanceMethod() {
        System.out.println("this is instance method in abstract class override in concrete");
    }

    // @ Override no need for static methods not overriden
    public static void absStaticMethod() {// error
        System.out.println("this is static method in abstract class override in concrete");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        ConcreteClass obj1 = new ConcreteClass();
        obj1.interAbsMethod1();
        obj1.interAbsMethod2();
        obj1.interAbsMethod3();
        obj1.absMethod1();
        obj1.absInstanceMethod();
        AbstractAbstract.absStaticMethod();
        ConcreteClass.absStaticMethod();
        obj1.concreteInstanceMethod();
        ConcreteClass.concreteStaticMethod();
        AbstractInterface.interAbsStatic();
        obj1.interAbsDefault();
    }
}
