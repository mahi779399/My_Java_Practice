import java.util.*;

class GoodDice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if ((x + y) > 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        s.close();
    }
}