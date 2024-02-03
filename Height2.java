public class Height2 {
    public static void main(String[] args) {
        int[] a = { 12, 19, 14, 5, 17, 2, 13, 18, 1 };
        // int x = 0;
        // int y = 0;
        // for (int i = 1; i < a.length; i++) {
        // int j = a[i];
        // if (j > x) {
        // y = x;
        // x = j;
        // } else if (j < x & y < j) {
        // y = j;
        // }
        // }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i = 1; i < a.length; i++) {
            int j = a[i];
            if (j > x) {
                z = y;
                y = x;
                x = j;
            } else {
                if (y < j) {
                    z = y;
                    y = j;
                } else {
                    if (j > z) {
                        z = j;
                    }
                }
            }
        }
        System.out.println("Second largest in an array: " + x + " " + y + " " + z);
    }
}
