import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileClassWriter {
    public static void main(String[] args) throws IOException {
        File f=new File("Sample.txt");
        FileWriter fw=new FileWriter(f,true);
        fw.write("\nthis is line one....");
        fw.write(65);
        fw.write("this is 2nd line",7,8);
        System.out.println(fw.toString());
        System.out.println(fw.getEncoding());

        BufferedWriter bw=new BufferedWriter(fw);
        bw.newLine();
        bw.write("this is line3...");
        bw.flush();
        bw.close();
        fw.close();
        FileReader fr=new FileReader(f);
        // System.out.println(fr.markSupported());
        // int d=fr.read();
        // while(d!=(-1)){
        //     char c=(char)d;
        //     System.out.print(c);
        //     d=fr.read();
        // }
        // fr.close();

        BufferedReader br=new BufferedReader(fr);
        System.out.println(br.readLine());
        br.mark(10);
        System.out.println(fr.markSupported());
        br.close();

        // Scanner sc=new Scanner(f);
        // while(sc.hasNextLine()){
        //     System.out.println(sc.nextLine());
        // }
        // sc.close();
    }
}
