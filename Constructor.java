public class Constructor {
    static Constructor strObj;

    public static void main(String[] args) {
        // someThing();
        Constructor2.doSomeThing();
        // Constructor t = new Constructor();
        strObj = new Constructor();
        someThing();
        System.out.println(strObj.everyThing());
        Constructor2 t1 = new Constructor2("maahi ", 21);
        t1.someThingDo();
        t1.doEveryThing();
        strObj.thingThing();
    }

    private static void someThing() {
        // Constructor t2 = new Constructor();
        strObj.thingThing();
        System.out.println("something");
    }

    private void thingThing() {
        System.out.println("thingthing");
    }

    private String everyThing() {
        someThing();
        thingThing();
        return "everything";
    }
}