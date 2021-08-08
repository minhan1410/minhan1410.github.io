public class Id50_Pow {
    public static void main(String[] args) {
        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(0.5, -2));
        System.out.println(myPow(0.8, 20));
        System.out.println(myPow(2.00000, -2147483648));

        System.out.println();

        System.out.println(myPow1(0.00001, 2147483647));
        System.out.println(myPow1(0.5, -2));
        System.out.println(myPow1(0.8, 20));
        System.out.println(myPow1(2.00000, -2147483648));

    }

    public static double myPow1(double x, int n) {
        // Cách cô ngọc
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / x * myPow1(1 / x, -(n + 1));
        }
        if (n == 2) {
            return x * x;
        }
        if (n % 2 == 0) {
            return myPow1(myPow1(x, n / 2), 2);
        }
        return x * myPow1(myPow1(x, n / 2), 2);
    }

    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            // xử lý âm và trường hợp Infinite or NaN vì -(2^31) <= interger <= (2^31)-1
            return 1 / x * myPow(1 / x, -(n + 1));
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