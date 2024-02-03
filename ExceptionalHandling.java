public class ExceptionalHandling {
    public static void main(String[] args){
        //Arithmetic Exception
        //NullPoint Exception
        /*try{
            System.out.println("Try block");
            System.out.println("Null point Exception");
            String s=null;
            System.out.println(s.length());
            System.out.println("Arithmetic Exception");
            int num1 = 5 / 0;
        }
        catch(Exception e){
            System.out.println("Catch block");
            System.out.println(e);
        }
        finally{
            System.out.println("Finally block");
        }*/
        //Number format exception
        //Array out of bounds exception
        try{
            System.out.println("Number format exception");
            int[] arr={1,2,3};
            System.out.println(arr[4]);
            String ss="abc";  
            int i=Integer.parseInt(ss);
        }
        catch(NumberFormatException e){
            System.out.println("Catch block");
            System.out.println(e);    
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Catch block");
            System.out.println(e);    
        }
        System.out.println("After exception");
        /*try{
            String sss="mahi";
            System.out.println(sss.substring(2, 5));
        }
        finally{
            System.out.println("Inside Finally Block");
        }
        System.out.println("After exception with no catch");*/
        
    }
}
