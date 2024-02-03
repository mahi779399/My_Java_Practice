public class Student {

    private String name;
    private String rollNum;
    private char section;
    private String branch;;
    private String clg;
    private int[] marks;

    public void setName(String studentName) {
        this.name = studentName;
    }

    public String getName() {
        return name;
    }

    public void setSection(char studentSection) {
        this.section = studentSection;
    }

    public char getSection() {
        return section;
    }

    public void setBranch(String studentBranch) {
        this.branch = studentBranch;
    }

    public String getBranch() {
        return branch;
    }

    public void setClg(String studentClg) {
        this.clg = studentClg;
    }

    public String getClg() {
        return clg;
    }

    public void setRollNum(String studentRollNum) {
        this.rollNum = studentRollNum;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setMarks(int[] studentMarks) {
        this.marks = studentMarks;
    }

    public int[] getMarks() {
        return marks;
    }
}