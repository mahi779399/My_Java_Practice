import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Good Afternoon, How are you?", " ");
        System.out.println(st);
        System.out.println("Tokens count : " + st.countTokens());

        String tokens[] = new String[st.countTokens()];
        // System.out.println(tokens.getClass().getSimpleName());
        int c = 0;
        while (st.hasMoreTokens()) {
            // System.out.println(st.nextToken());
            tokens[c] = st.nextToken();
            // System.out.println("Token No - " + c + " : " +
            // tokens[c].getClass().getSimpleName());
            System.out.println("Token No - " + c + " : " + tokens[c]);
            c++;
        }
        // System.out.println(Arrays.toString(tokens));
        System.out.println("Tokens count :" + st.countTokens());

        StringTokenizer stobject = new StringTokenizer("Good Afternoon, 'How are' you?", " ");
        System.out.println("Tokens count : " + stobject.countTokens());

        Object tokensobject[] = new Object[stobject.countTokens()];
        // System.out.println(tokensobject.getClass().getSimpleName());
        int d = 0;
        while (stobject.hasMoreElements()) {
            // System.out.println(st.nextElement());
            tokensobject[d] = stobject.nextElement();
            // System.out.println("Token No - " + d + " : " +
            // tokensobject[d].getClass().getSimpleName());
            System.out.println("Token No - " + d + " : " + tokensobject[d]);
            d++;
        }
        StringTokenizer st1 = new StringTokenizer("good., mor,ning., guys., hai., there", ".");
        System.out.println("Tokens count : " + st1.countTokens());
        // String tokenst1[] = new String[st.countTokens()];
        int e = 1;
        while (st1.hasMoreTokens()) {
            System.out.println(e + "   " + st1.nextToken(","));
            e++;
        }
    }
}
