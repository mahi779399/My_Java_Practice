class Pattern4 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(i);

            }
            System.out.println();
        }
    }
}