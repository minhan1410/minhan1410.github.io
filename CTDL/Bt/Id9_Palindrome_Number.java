public class Id9_Palindrome_Number {
    public static boolean isPalindrome1(int x) {
        // 9 ms 38.8 MB
        String s = Integer.toString(x);
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString().equals(s);
    }

    public static boolean isPalindrome(int x) {
        // 6 ms, faster than 99.96%
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int result = 0;
        while (x > result) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result == x || x == result / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));// t
        System.out.println(isPalindrome(-121));// f
        System.out.println(isPalindrome(10));// f
        System.out.println(isPalindrome(-101));// f
        System.out.println(isPalindrome(0));
    }
}
