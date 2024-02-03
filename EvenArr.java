
// 10 to creat an arr using words at even positions in a str
import java.util.*;

class EvenArr {
    public static void main(String[] args) {
        String n = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Str: ");
        String s1 = s.nextLine();
        String[] arr = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                n = n + arr[i] + " ";
            }
        }
        String[] evenarr = n.split(" ");
        System.out.println(Arrays.toString(evenarr));
        s.close();
    }
}