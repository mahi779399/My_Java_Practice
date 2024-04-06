import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListExample1 {
    public static void main(String[] args) {
        List<String> arrL=Arrays.asList("hai5","hai6");
        // ArrayList<String> obj1=new ArrayList<String> (arrL);
        ArrayList<String> obj1=new ArrayList<String> ();
        obj1.add("hai");
        obj1.add("hai1");
        obj1.add("hai2");
        obj1.add("hai3");
        obj1.add(2,"hai4");
        obj1.addAll(arrL);
        System.out.println(obj1.contains("hai3"));
        System.out.println(obj1.get(obj1.size()-1));
        System.out.println(obj1);
        obj1.set(2,"sss");
        System.out.println(obj1.size());
        for(String s:obj1){
            System.out.print(s+" ");
        }
        obj1.forEach(ss -> System.out.println("**"+ss+"**"));
        
    }
}
