
//7.to modify strin form of change odd woreds to uppercase and reverse even word
import java.util.*;

class UpperRev {
    public static void main(String[] args) {
        String last = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s1 = s.nextLine();
        String[] arr = s1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                last = last + (arr[i].toUpperCase()) + " ";
                // String upper = arr[i].toUpperCase();
                // last = last + upper + " ";
            } else {
                String rev = "";
                for (int j = 0; j < arr[i].length(); j++) {
                    rev = arr[i].charAt(j) + rev;
                }
                last = last + rev + " ";
            }
        }
        System.out.println(last);
        s.close();
    }
}
