@FunctionalInterface
interface FunctionalInter {
    void show();
}

// class FunctionalClass implements FunctionalInter {
// public void show() {
// System.out.println("this is show method in functional class from interface");
// }
// }

public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) {
        FunctionalInter obj = new FunctionalInter() {
            public void show() {
                System.out.println("this is show method in functional class from interface");
            }
        };
        obj.show();
    }
}
