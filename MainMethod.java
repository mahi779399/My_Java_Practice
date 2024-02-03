public class MainMethod {
    public static void main(String args) {
        System.out.println("this is main method with string args  " + args);
    }

    public static void main(int args) {
        System.out.println("this is main method with int args  " + args);
    }

    public static void mainmain() {
        String[] a = { "hai", "haai" };
        System.out.println("this is main main");
        main(a);
    }

    // Main method overloading is possible but main with String[] args is considered
    // by JVM
    public static void main(String[] args) {
        System.out.println("this is main method with string[] args");
        main("haai");
        main(350);
        if (args[0].equals("Mahendra")) {
            mainmain();
        } else {
            System.out.println(args[0]);
        }
    }
    // Main method overriding is not possible it will get Ambiguity
    /*
     * public static void main(String[] args){
     * System.out.println("This is main method overriding");
     * }
     */
}


