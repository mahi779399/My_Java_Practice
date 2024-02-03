public class StringExample {
    public static void main(String args[]) {
        String s = "Hello ap";
        String s1 = "Bye Bye Vcp";
        String s2 = s.concat(s1);
        String v = "Hello";
        System.out.println(s);
        System.out.println(s + s1);
        System.out.println(v.hashCode());
        System.out.println(v + " " + v.hashCode());
        System.out.println(s + " " + s.hashCode());
        System.out.println(s2.length());
        System.out.println(s2.charAt(4));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

    }
}