public class Id509_Fibonacci_Number {
    public static void main(String[] args) {
        System.out.println(fib(1));
    }

    // public static int fib(int n) {
    // if (n == 0) {
    // return 0;
    // }

    // if (n == 1) {
    // return 1;
    // }

    // return fib(n - 1) + fib(n - 2);
    // }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int result[] = new int[n + 1];
        result[0] = 0;
        result[1] = 1;

        for (int i = 2; i <= n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result[n];
    }

}
