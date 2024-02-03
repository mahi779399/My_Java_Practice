import java.util.Scanner;

public abstract class StudentMarksConsole {
    public int[] studentmarksConsoleOut() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Numof Sub: ");
        int numOfSub = sc.nextInt();
        int[] studentMarks = new int[numOfSub];
        System.out.println("please enter student marks: ");
        for (int i = 0; i < numOfSub; i++) {
            int j = sc.nextInt();
            studentMarks[i] = j;
        }
        sc.close();
        return studentMarks;
    }
}
