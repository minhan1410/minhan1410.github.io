public class Id50 {
    public static void main(String[] args) {
        // System.out.println(myPow(0.00001, 2147483647));
        // System.out.println(myPow(0.5, 2));
        // System.out.println(myPow(0.8,20));

        System.out.println(myPow(2.00000,- 2147483648));
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double result = myPow(x, n / 2);
        if (n % 2 == 0) {
            // x^4 = x^2 * x^2
            return result * result;
        }
        // x^5 = x^2 * x^2 * x
        return x * result * result;
    }
}