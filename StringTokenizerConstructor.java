import java.util.StringTokenizer;

public class StringTokenizerConstructor {
    public static void main(String[] args) {
        // defalut constructor no delimiter and no delimiter flag
        String s = "this is me";
        StringTokenizer obj = new StringTokenizer(s);
        System.out.println("------------");
        while (obj.hasMoreTokens()) {
            System.out.println(obj.nextToken());
        }
        System.out.println("------------");
        // constructor with delimiter and no delimiter flag
        String s1 = "this,is,me,only,me";
        StringTokenizer obj1 = new StringTokenizer(s1, ",");
        System.out.println("------------");
        while (obj1.hasMoreTokens()) {
            System.out.println(obj1.nextToken());
        }
        System.out.println("------------");
        // constructor with delimiter and delimiter flag
        String s2 = "this,is,me,only,me";
        StringTokenizer obj2 = new StringTokenizer(s2, ",", true);
        System.out.println("------------");
        while (obj2.hasMoreTokens()) {
            System.out.println(obj2.nextToken());
        }
        System.out.println("------------");
        // constructor with delimiter, delimiter flag and custom delimiter
        String s3 = "this,;is,me,;only,me";
        StringTokenizer obj3 = new StringTokenizer(s3, ",;", true);// this is doubt
        System.out.println("------------");
        while (obj3.hasMoreTokens()) {
            System.out.println(obj3.nextToken());
        }
        System.out.println("------------");
    }
}
