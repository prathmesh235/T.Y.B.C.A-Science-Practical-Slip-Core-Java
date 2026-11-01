class Slip25Q1 {
    public static void main(String[] args) {

        int n = Integer.valueOf(args[0]);
        int rev = 0;

        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        System.out.println("Reverse Number = " + rev);
    }
}