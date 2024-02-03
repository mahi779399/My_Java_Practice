import java.util.Scanner;

public class Test2 extends StudentMarksConsole {

    public static void main(String[] args) {
        Student student1 = new Student();
        StudentInfo studentInfo1 = new StudentInfo();
        StudentMarksConsole test = new Test2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter student name: ");
        String studentName = sc.nextLine();
        student1.setName(studentName);
        System.out.println("Please enter student rollnum: ");
        String studentRollNum = sc.nextLine();
        student1.setRollNum(studentRollNum);
        System.out.println("Please enter student section: ");
        char studentSection = sc.next().charAt(0);
        student1.setSection(studentSection);
        System.out.println("Please enter student branch: ");
        sc.nextLine();
        String studentBranch = sc.nextLine();
        student1.setBranch(studentBranch);
        System.out.println("Please enter student clg: ");
        String studentClg = sc.nextLine();
        student1.setClg(studentClg);
        int[] studentMarks = test.studentmarksConsoleOut();
        student1.setMarks(studentMarks);
        studentInfo1.studentInformation(student1);
        sc.close();
    }
}
