public class Id50 {
    public static void main(String[] args) {
        // System.out.println(myPow(0.00001,2147483647));
        System.out.println(myPow(0.5, 2));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
        return x * myPow(x, n - 1);
    }
}