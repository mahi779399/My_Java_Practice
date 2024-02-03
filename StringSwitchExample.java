public class StringSwitchExample {
    public static void main(String[] args) {
        String dayOfWeek = "Sunday";

        String result=switch (dayOfWeek) {
            case "Monday" -> "It's Monday.";
            case "Tuesday" -> "It's Tuesday.";
            case "Wednesday" -> "It's Wednesday.";
            case "Thursday" -> "It's Thursday.";
            case "Friday" -> "It's Friday.";
            case "Saturday ", "Sunday" -> "It's the weekend.";
            default -> "Invalid day.";
        };
        System.out.println(result);
    }
}
