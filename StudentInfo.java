public class StudentInfo {
    public void studentInformation(Student student1) {
        System.out.println("**********Student information**********");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student rollnum: " + student1.getRollNum());
        System.out.println("Student section: " + student1.getSection());
        System.out.println("Student branch: " + student1.getBranch());
        System.out.println("Student clg: " + student1.getClg());
        int[] marks = student1.getMarks();
        System.out.print("Student Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("**********Student information**********");
    }
}
