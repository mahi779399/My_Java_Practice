class UniaryOpe {
    public static void main(String[] args) {
        int a = 10, b = 0;
        boolean c;
        c = (a < b) || 0 == (++b);
        System.out.println(a + " " + b + " " + c);
    }
} 