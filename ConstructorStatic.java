public class ConstructorStatic {
    private String name1;

    ConstructorStatic(String name) {
        this.name1 = name;
        System.out.println(name1);
    }

    public static void main(String[] args) {
        ConstructorStatic strObj1 = new ConstructorStatic("mahi");
        System.out.println(strObj1.name1);
        doStatic();
        strObj1.doInstance();
    }

    public static void doStatic() {
        ConstructorStatic strObj2 = new ConstructorStatic("siri");
        System.out.println("doStatic " + strObj2.name1);
    }

    public void doInstance() {
        System.out.println("doInstance" + name1);
    }
}
