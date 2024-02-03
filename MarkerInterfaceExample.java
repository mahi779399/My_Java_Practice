//Marker interface and Nested interface
interface Printable {
    interface Printable2 {
        void printMethod();
    }
}

// interface Printable2 {
//     void printMethod();
// }

class Printer implements Printable, Printable.Printable2 {
    public void print() {
        System.out.println("Printing...");
    }

    public void printMethod() {
        System.out.println("print method in printable 2 interface");
    }
}

public class MarkerInterfaceExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        if (printer instanceof Printable) {
            System.out.println("Printer is marked as Printable.");
            // printer.print();
            printer.printMethod();
        } else {
            System.out.println("Printer is not marked as Printable.");
        }
        printer.print();
    }
}
