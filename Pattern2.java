class Pattern2 {
    public static void main(String[] args) {
        int num = 5;
        int k = 2;
        for (int i = 1; i <= ((2 * num) - 1); i++) {
            if (i <= num) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 1; j <= (i - k); j++) {
                    // k = k + 2;
                    System.out.print("* ");
                }
                k = k + 2;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}