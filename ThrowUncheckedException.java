public class ThrowUncheckedException {
    public static void throw1(int age){
        if(age<=18){
            System.out.println("below age");
        }
        else{
            throw new ArithmeticException("out of age exception");//unchecked no need to throws
            //checked need to throws
        }
        System.out.println("method after exception");
    }
    public static void main(String[] args) {
        try{
            throw1(19);
        }
        catch(Exception e){
            System.out.println("Caught Exception: "+e);
            System.out.println("Caught Exception: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("after throw exception");
    }
}
