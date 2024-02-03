
//Stone-Paper-Scissor
import java.util.*;

class StonePaperScissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter TOMs choice: ");
        String ch1 = s.next();
        System.out.println("Enter JERRYs choice: ");
        String ch2 = s.next();
        if ((ch1 == "Stone" && ch2 == "Scissor") || (ch1 == "Scissor" && ch2 == "Paper")
                || (ch1 == "Paper" && ch2 == "Stone")) {
            System.out.println("TOM");
        } else if (ch1.equals(ch2)) {
            System.out.println("Share it!");
        } else {
            System.out.println("JERRY");
        }
        s.close();
    }
}