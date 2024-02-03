class WordRev {
    public static void main(String[] args) {
        String name = "Padma Sudha Lakshmi Ramyasri";
        String[] names = name.split(" ");
        String rev = "";
        for (int i = 0; i < names.length; i++) {
            String test = names[i];
            for (int j = test.length() - 1; j >= 0; j--) {
                rev += test.charAt(j);
            }
            rev += " ";
        }
        System.out.println(rev);
    }
}