import java.util.Arrays;

public class AscDes {
    public static void main(String[] args) {
        String a = "Siva Shankara Vara Prasad";
        String[] s = a.split(" ");
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if ((s[i].compareTo(s[j])) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
