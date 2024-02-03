import java.lang.Character;

public class Password {
    public static void main(String[] args) {
        String password = "Pmkumar@2001";
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                System.out.println(password.charAt(i));
            }
        }
    }
}
