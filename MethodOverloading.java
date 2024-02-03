public class MethodOverloading {
    // public int add(int a, int b){
    // System.out.println("2 arguments: ");
    // return a+b;
    // }
    // public int add(int a, int b,int c){
    // System.out.println("3 arguments: ");
    // return a+b+c;
    // }
    // public int add(int a, int b,int c, int d){
    // System.out.println("4 arguments: ");
    // return a+b+c+d;
    // }
    public int add(int... a) {
        System.out.println("Indefined arguments: ");
        int c = 0;
        for (int i : a) {
            c += i;
        }
        return c;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
        System.out.println(m.add(10, 20, 30, 40));
        System.out.println(m.add(10, 20, 30, 40, 50, 50, 70));
        main("hey");
    }

    public static void main(String ab) {
        System.out.println("haai");
    }
}
