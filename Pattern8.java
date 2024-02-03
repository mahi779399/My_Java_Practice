import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int a = i;
            for (int j = 1; j < (i * 2); j++) {
                if (j<=i) {
                    System.out.print(a--);
                    if(j==i){
                        a++;
                    }
                }
                if(j>i) {
                    System.out.print(++a);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
