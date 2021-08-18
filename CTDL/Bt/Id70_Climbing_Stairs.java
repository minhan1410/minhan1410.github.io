import java.util.HashMap;
import java.util.Map;

public class Id70_Climbing_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(8) == climbStairs1(8));
    }

    public static int climbStairs1(int n) {
        if (n == 1 || n == 2)
            return n;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(1, 1);
        map.put(2, 2);

        for (int i = 3; i <= n; i++) {
            map.put(i, map.get(i - 1) + map.get(i - 2));
        }

        return map.get(n);
    }
}
