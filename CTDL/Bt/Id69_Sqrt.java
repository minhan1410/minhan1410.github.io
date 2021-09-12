public class Id69_Sqrt {
    public static int mySqrt(int x) {
//        1 ms	35.9 MB
        if (x < 2) return x;
        long r = x;
        while (r * r > x)
            r = (r + x / r) / 2;
        return (int) r;
//        https://en.wikipedia.org/wiki/Integer_square_root#Algorithm_using_Newton's_method
    }

    public static int mySqrt1(int x) {
//        1 ms	36 MB
        if (x < 2) return x;

        int star = 0, end = x / 2;
        while (star <= end) {
            int mid = star + (end - star) / 2;
            long pow = (long) mid * mid;

            if (pow == x) {
                return mid;
            } else if (pow > x) {
                end = mid - 1;
            } else {
                star = mid + 1;
            }
        }
        return star - 1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(0));//0
        System.out.println(mySqrt(1));//1
        System.out.println(mySqrt(2));//1
        System.out.println(mySqrt(3));//1
        System.out.println(mySqrt(4));//2
        System.out.println(mySqrt(5));//2
        System.out.println(mySqrt(6));//2
        System.out.println(mySqrt(7));//2
        System.out.println(mySqrt(8));//2
        System.out.println(mySqrt(9));//2
        System.out.println(mySqrt(16));//4
        System.out.println(mySqrt(25));//5
        System.out.println(mySqrt(23));//4
        System.out.println(mySqrt(2147395599));//46339
    }
}
