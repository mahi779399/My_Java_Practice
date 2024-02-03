//package javapractice;

public class Constructor2 {
    private String name2;
    private int age2;

    Constructor2(String name, int age) {
        this.name2 = name;
        this.age2 = age;
    }

    public static void doSomeThing() {

        System.out.println("dosomething");
    }

    public void doEveryThing() {
        someThingDo();
        System.out.println("doeverything");
    }

    public void someThingDo() {
        System.out.println(name2 + age2);
    }
}
