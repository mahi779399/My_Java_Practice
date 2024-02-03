public class LocInsStat {
    // static LocInsStat obj1;
    int instanceVar = 20;
    static int staticVar = 30;

    public void instanceMethod() {
        int instanceLocalVar = 40;
        System.out.println(instanceLocalVar);
        instanceVar = instanceLocalVar;
        System.out.println(instanceVar);
        staticVar = instanceLocalVar;
        System.out.println(staticVar);
        System.out.println("instance method");
    }

    public void instanceMethod2() {
        int instanceLocalVar2 = 70;
        System.out.println(instanceLocalVar2);
        instanceVar = instanceLocalVar2;
        System.out.println(instanceVar);
        staticVar = instanceLocalVar2;
        System.out.println(staticVar);
        System.out.println("instance method  2");
    }

    public static void staticMethod() {
        int staticLocalVar = 50;
        System.out.println(staticLocalVar);
        staticVar = staticLocalVar;
        System.out.println(staticVar);
        LocInsStat obj1 = new LocInsStat();
        obj1.instanceVar = staticLocalVar;
        System.out.println(obj1.instanceVar);
        System.out.println("static method");
    }

    public static void main(String[] args) {
        int mainLocal = 10;
        staticVar = mainLocal;
        System.out.println(mainLocal);
        System.out.println(staticVar);
        // obj1 = new LocInsStat();
        LocInsStat obj1 = new LocInsStat();
        obj1.instanceVar = mainLocal;
        System.out.println(obj1.instanceVar);
        // staticMethod();
        obj1.instanceMethod();
        obj1.instanceMethod2();
    }
}
