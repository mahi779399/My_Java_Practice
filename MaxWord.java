
//11.To find max length word in a given string
import java.util.*;

class MaxWord {
    public static void main(String[] args) {
        int h=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter str: ");
        String s1 = s.nextLine();
        String[] arr = s1.split(" ");
        for(String i:arr){
            if((i.length())>h){
                h=i.length();
            }
        }
        System.out.println(h);
        s.close();
    }
}