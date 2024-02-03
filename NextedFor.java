import java.util.Arrays;

public class NextedFor {

    public static void main(String[] args) {
        String[] name = { "Kamashi", "Meenashi", "leepash", "Maheswari", "vennala", "Sravani" };
        for (int i = 0; i <= name.length - 1; i++) {
            for (int j = i + 1; j <= name.length - 1; j++) {
                if (1 < name[i].compareTo(name[j])) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(name));
    }
}
