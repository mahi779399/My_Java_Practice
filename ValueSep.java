import java.util.*;
//print values in a line by seperate space,extra space at the end
/*for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
}
//removes extra space, uses string
StringBuilder sb = new StringBuilder();
for (int i = 0; i < array.length; i++) {
    sb.append(array[i]);
    if (i < array.length - 1) {
        sb.append(" ");
    }
}
System.out.println(sb.toString());*/

//removes extra space without using string(easy method)
class ValueSep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of arr: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        // int[] array = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        s.close();
    }
}
