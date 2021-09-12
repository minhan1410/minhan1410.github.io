import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("####,###,###");
        Map<Long, String> map = new LinkedHashMap<Long, String>();

        long start = System.currentTimeMillis();
        fibArray(50);
        long end = System.currentTimeMillis();
        map.put(end - start, "fibArray");

        start = System.currentTimeMillis();
        fibRecursive(50);
        end = System.currentTimeMillis();
        map.put(end - start, "fibRecursive");

        start = System.currentTimeMillis();
        fib(50);
        end = System.currentTimeMillis();
        map.put(end - start, "fib");

        map.forEach((k, v) -> System.out.println(formatter.format(k) + "s - " + v));
    }

    public static int fibArray(int n) {
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

    public static int fibRecursive(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static int fib(int n) {
        int F0 = 0, F1 = 1, Fn = 0, i = 2;
        while (i <= n) {
            Fn = F0 + F1;
            F0 = F1;
            F1 = Fn;
            i++;
        }
        return Fn;
    }
}
