import java.util.*;

class Sumdigits {
    public static void main(String[] args) {
        int r = 0, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int x = s.nextInt();
        while (x != 0) {
            r = x % 10;
            sum += r;
            x = x / 10;
            if (x == 0) {
                if (0 <= sum && sum <= 9) {
                    System.out.println(sum);
                    break;
                }
                else
                {
                    x = sum;
                    System.out.println(x+" "+sum);
                    sum=0;
                }
            }
        }
        s.close();
    }}