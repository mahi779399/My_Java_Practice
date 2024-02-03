import java.util.*;

class Multable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = s.nextInt();
        System.out.println("Enter limit: ");
        int l = s.nextInt();
        for (int i = 1; i <= l; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
            s.close();
        }
    }
}