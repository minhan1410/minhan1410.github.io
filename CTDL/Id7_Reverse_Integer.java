public class Id7_Reverse_Integer {
    public static int reverse1(int x) {
        // 2 ms 36 MB
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        try {
            boolean flag = false;
            if (x < 0) {
                x *= -1;
                flag = true;
            }
            StringBuilder number = new StringBuilder(Integer.toString(x));
            number.reverse();
            if (flag) {
                number.insert(0, '-');
            }
            return Integer.parseInt(number.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int reverse(int x) {
        // copy 1 ms 36.1 MB
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));// 321
        System.out.println(reverse(-123));// -321
        System.out.println(reverse(120));// 21
        System.out.println(reverse(0));// 0
        System.out.println(reverse(Integer.MIN_VALUE));// 0
        System.out.println(reverse(Integer.MAX_VALUE));// 0
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-1534236469));
    }
}