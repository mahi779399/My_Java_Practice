import java.io.File;
import java.util.Scanner;
public class FileClass {
    public static void main(String[] args) {
        // File f=new File("javapractice\\Sample.txt");
        /*File f=new File("javapractice2");
        try{
            // if(f.exists()){
            //     System.out.println("The file exists");
            // }
            // else{
            //     if(f.createNewFile()){
            //         System.out.println("File is created");
            //     }
            //     else{
            //         System.out.println("Failed to create file, already exists or invalid");
            //     }
            // }
            if(f.mkdir())//f.createNewFile()
            {
                System.out.println("File is created");
                System.out.println(f.getName());
                System.out.println(f.getParent());
                System.out.println(f.getPath());
                System.out.println(f.getAbsolutePath());
                System.out.println(f.length());
                System.out.println(File.separator);
                System.out.println(File.pathSeparator);
                // System.out.println(f.setReadOnly());
                System.out.println(f.setWritable(true,true));
            }
            else{
                File ff=new File("javapra");
                System.out.println(f.renameTo(ff));
                System.out.println(f.canRead());
                System.out.println(f.canWrite());
                System.out.println(ff.delete());
                System.out.println("Failed to create file, already exists or invalid");
            }
        }
        catch( Exception e){
            System.out.println("Exception occured: "+e);
        }*/
        File f=new File("javapractice\\FileClass.java");
        try{
            Scanner sc=new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
