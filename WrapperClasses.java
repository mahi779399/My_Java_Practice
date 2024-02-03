public class WrapperClasses {
    public static void main(String[] args) {
        // Unboxing
        // Integer i = new Integer(10); //depricated
        Integer i = 10;
        int a = i;
        int b = i.intValue();
        Integer j = 20;
        Float e = 20.03f;
        System.out.println(e.floatValue());
        System.out.println(a + "  " + b + "  " + i + "  " + j);
        // Autoboxing
        int c = 10;
        Integer k = c;
        Integer l = Integer.valueOf(c);
        System.out.println(c + "  " + k + "  " + l);
        System.out.println(i.getClass().getSimpleName());
        // System.out.println(a.getClass().getSimpleName());
        /* cant invoke getclass on premitive,cause not a class */
        Byte g = 10;
        System.out.println(g.MAX_VALUE);
        System.out.println(g.MIN_VALUE);
        System.out.println(g.SIZE);
        System.out.println(g.TYPE);
        System.out.println(g.BYTES);
        System.out.println(0b0101);
        Integer x = 0b0101;
        Integer y = 012;
        Integer z = 0xa12;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(30e3f);
        System.out.println(30e3);
        Integer aa = new Integer("123");// depricated from java 9
        System.out.println(aa + 10);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));
        Long ss = 102910l;  
        Integer sss = ss.intValue();
        Integer hh = 65;
        Character hhh = (char) hh.intValue();
    }
}
