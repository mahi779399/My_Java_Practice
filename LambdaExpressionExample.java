@FunctionalInterface
interface LambdaInterface {
    // void lambdaInterfaceMethod();
    // void lambdaInterfaceMethod(int i, int j);
    int lambdaInterfaceMethod(int i, int j);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // LambdaInterface obj = () -> System.out.println("this is lambda single
        // statement");
        // LambdaInterface obj1 = () -> {
        // System.out.println("this is lambda multi lines with {}");
        // int a = 10;
        // int b = 20;
        // System.out.println(a + b);
        // };
        // obj.lambdaInterfaceMethod();
        // obj1.lambdaInterfaceMethod();
        // LambdaInterface obj2 = (a, b) -> System.out.println("this is lambda with
        // parameters :" + (a + b));
        // obj2.lambdaInterfaceMethod(10, 20);
        // LambdaInterface obj3 = (a, b) -> a + b;
        LambdaInterface obj3 = (a, b) -> {
            System.out.println("haai");
            return a+b;
        };
        System.out.println(obj3.lambdaInterfaceMethod(10, 20));
    }
}
