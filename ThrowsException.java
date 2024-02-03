import java.io.IOException;

public class ThrowsException {
    void A() throws IOException{
        // try{throw new IOException("This is IOException");}
        // catch(IOException e){System.out.println("Caught in A() : "+e);}
        throw new IOException("This is IOException");
    }
    void B() throws IOException{
        A();
        // try{A();}
        // catch(IOException e){System.out.println("Caught in B() : "+e);}
    }
    void C() throws IOException{
        B();
        // try{B();}
        // catch(IOException e){System.out.println("Caught in C() : "+e);}
    }
    public static void main(String[] args) throws IOException {
        ThrowsException obj1=new ThrowsException();
        obj1.C();
        // try{obj1.C();}
        // catch(IOException e){System.out.println("Caught in main : "+e);}
        System.out.println("after exception");
    }
}
