public class StringSwitchExample2 {
    public static void main(String[] args) {
        int dayOfWeek = 9;

        switch (dayOfWeek) {
            case 1: {
                System.out.println("It's Monday.");
                break;
            }

            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wednesday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            // case 5:
            // System.out.println("It's Friday.");
            // break;
            case 5, 6, 7:
                System.out.println("It's the weekend.");
                break;
        }
    }
}
