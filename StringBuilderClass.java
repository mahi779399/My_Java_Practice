public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Mahendr");
        System.out.println(sb.capacity());
        sb.append(" Kumar");
        System.out.println(sb.capacity());
        sb.append("1234567890");
        System.out.println(sb.capacity());
        sb.append("111");
        System.out.println(sb.capacity());
        sb.append("1111234567890123456789012345");
        System.out.println(sb.capacity());
        StringBuffer sb1=new StringBuffer(10);
        sb1.append("Mahendra Kumar");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        StringBuffer sb2=new StringBuffer("Hai");
        StringBuffer sb3=new StringBuffer("hey");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        sb3.append(sb2);
        System.out.println(sb3);
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        sb3.insert(3," this ");
        sb3.append(" "+true);
        int i='a';
        sb3.append(" "+i);
        sb3.replace(4,8,"what");
        sb3.delete(4,9);
        System.out.println(sb3.charAt(2));
        sb3.setCharAt(2, 'i');
        sb3.deleteCharAt(2);
        sb3.reverse();
        sb3.reverse();
        System.out.println(sb3.codePointAt(1));
        System.out.println(sb3.indexOf("Hai"));
        System.out.println(sb3.indexOf("Hai",4));
        System.out.println(sb3.lastIndexOf("e",4));
        System.out.println(sb3);
        sb3.setLength(5);
        System.out.println(sb3.capacity());
        System.out.println(sb3);
    }
}
