public class ConstantPool {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("s1==s2 : " + (s1 == s2));
        System.out.println("s1 equals s2 : " + (s1.equals(s2)));
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println("s3==s4 : " + (s3 == s4));
        System.out.println("s3 equals s4 : " + (s3.equals(s4)));
        String s5 = "Hey hai";
        String s6 = new String("Hey hai");
        System.out.println("s5==s6 : " + (s5 == s6));
        System.out.println("s5 equals s6 : " + (s5.equals(s6)));
        String s7 = "Hello ";
        String s8 = "world!";
        String s9 = s7 + s8;
        System.out.println("s9=='Hello world!': " + (s9 == "Hello world!"));
        System.out.println("s9 equals 'Hello world!': " + (s9.equals("Hello world!")));
        String s10 = "Hello world!";
        System.out.println("s9==s10 : " + (s9 == s10));
        System.out.println("s9 equals s10 : " + (s9.equals(s10)));
    }
}
