import java.util.*;

class StrCharCount {
    public static void main(String[] args) {
        int c = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = s.nextLine();
        for (int i = 0; i < str.length(); i++) {
            c = 1;
            if (str.charAt(i) == ' ') {
                continue;
            } else {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        c = c + 1;
                        str = str.substring(0, j) + " " + str.substring(j + 1);
                    }
                }
                System.out.println(str.charAt(i) + " " + c);
            }
        }
        /*
         * for (int i = 0; i < str.length(); i++) {
         * c = 1;
         * for (int j = i; j < str.length(); j++) {
         * if (str.charAt(j) == str.charAt(i)) {
         * c += 1;
         * String a = "" + str.charAt(j);
         * String newstr = str.replaceFirst(a, " ");
         * str = newstr;
         * //System.out.println(str.charAt(i) + " " + c);
         * }
         * }
         * System.out.println(str.charAt(i) + " " + c);
         * }
         */
        s.close();
    }
}