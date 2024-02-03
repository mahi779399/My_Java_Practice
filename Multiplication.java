public class Multiplication {
    public static int multipli(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x + (multipli(x, y - 1));
        }

    }

    public static void main(String[] args) {

        // int b = 5;
        // int multi=0;
        // //Multiplication of two numbers using loops
        // for (int i=0 ;i<b; i++){
        // multi+=a;
        // }
        // System.out.println("After multiplication using loops: "+multi);
        int c = 15;
        int d = 5;
        System.out.println("After multiplication using recursion: " + multipli(c, d));
    }
}
