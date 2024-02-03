
public class UserDefinedException  extends Exception{
    //RuntimeException for runtime exceptions, default jav versions no changes seen
    /*public UserDefinedException(String message){
        super(message);
    }*/
    public UserDefinedException(Throwable cause){
        super(cause);
    }
    /*public UserDefinedException(String message,Throwable cause){
        super(message,cause);
    }*/
    public static void main(String[] args) {
        try{
            // throw new UserDefinedException("this is user defined exception(compile time)");
            // throw new UserDefinedException();
            throw new UserDefinedException(new ArithmeticException("divided by zero"));
            // throw new UserDefinedException("this is user exception",new ArithmeticException("divided by zero"));
        }
        catch(UserDefinedException e){
            System.out.println(e);
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
            Throwable t=e.getCause();
            if(t!=null){
                System.out.println(e.getClass().getSimpleName()+ " : "+e.getMessage());
                System.out.println(t.getClass().getSimpleName()+ " : "+t.getMessage());
            }else{
                System.out.println("no cause");
            }
            t.printStackTrace();
        }
    }
}
