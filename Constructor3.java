public class Constructor3 {
    /*
     * // By default constructor is there for every class if we creat one it called
     * as
     * // no parameterized constructor
     * public Constructor3() {
     * this("Mahendra");
     * System.out.
     * println("This is a No parameterised constructor, works at the time of obj creation"
     * );
     * // if we give parameters it is called as Parameterised constructor
     * }
     * 
     * public Constructor3(String name) {
     * System.out.println("this is parameterised constructor with parameter name: "
     * + name);
     * }
     * 
     * public static void main(String[] args) {
     * new Constructor3();
     * System.out.println("this line is after object creation");
     * }
     */
    private String name;
    private int age;

    public Constructor3(String name1, int age1) {
        this.name = name1;
        this.age = age1;
        System.out.println("constructor for obj2 :" + this.name + " " + this.age);
    }

    public Constructor3(Constructor3 obj2) {
        this.name = obj2.name;
        this.age = obj2.age;
        System.out.println("Copy constructor for obj3 copied from obj2: " + this.name + " " + this.age);
    }

    public static void main(String[] args) {
        Constructor3 obj2 = new Constructor3("Mahendra", 22);
        Constructor3 obj3 = new Constructor3(obj2);
    }
}
