public class LocalInnerClass {
    public void localMethod1() {
        System.out.println("this is local method");
        int a = 10;
        class LocalClass {
            public void localMethodInnner() {
                System.out.println("this is local method in inner inner class: " + a);
            }
        }
        LocalClass obj1 = new LocalClass();
        obj1.localMethodInnner();
        for (int i = 1; i < 3; i++) {
            System.out.println("this is for in local method");
            // int b = i;
            final int c = i;
            class LocalClass2 {
                public void localMethodFor() {
                    System.out.println("this is local method in inner in for: " + c);
                }
            }
            LocalClass2 obj3 = new LocalClass2();
            obj3.localMethodFor();
            if(true){
            int d=20;
            class LocalClass3{
                public void localMethodIf() {
                    System.out.println("this is local method in inner in if: " + d);
                }
            }
            LocalClass3 obj4=new LocalClass3();
            obj4.localMethodIf();
            obj3.localMethodFor();
        }
        }
        // if(true){
        //     int d=20;
        //     class LocalClass3{
        //         public void localMethodIf() {
        //             System.out.println("this is local method in inner in if: " + d);
        //         }
        //     }
        //     LocalClass3 obj4=new LocalClass3();
        //     obj4.localMethodIf();
        // }
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.localMethod1();
    }
}
