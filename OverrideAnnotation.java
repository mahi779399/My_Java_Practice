class OverrideParent {
    public void display() {
        System.out.println("this is parent display()");
    }

    public void display(int a) {
        System.out.println("this is parent display(int) " + a);
    }
}

public class OverrideAnnotation extends OverrideParent {
    @Override
    public void display() {
        System.out.println("this is child display()");
    }

    @Override
    public void display(int a) {
        System.out.println("this is child display(int) " + a);
    }

    public static void main(String[] args) {
        OverrideAnnotation obj = new OverrideAnnotation();
        obj.display(10);
        obj.display();
    }
}