
//2.to count num of words in a str
import java.util.*;

class StrWords {
    public static void main(String[] args) {
        int c = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s1 = s.nextLine();
        // String[] words = s1.split(" ");
        /*
         * ArrayList<String> a = new ArrayList<String>(Arrays.asList(words));
         * System.out.println(a.size());
         */
        /*
         * String a = Arrays.toString(words);
         * System.out.println(a);
         * System.out.println(a.length());//gives len of entire sentence
         */
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ' && s1.charAt(i + 1) != ' ') {
                c += 1;
            }
        }
        System.out.println(c);
        s.close();
    }
}