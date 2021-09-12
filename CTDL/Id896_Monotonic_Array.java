public class Id896_Monotonic_Array {
    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[] { 1, 2, 2, 3 }));// true
        System.out.println(isMonotonic(new int[] { 6, 5, 4, 4 }));// true
        System.out.println(isMonotonic(new int[] { 1, 3, 2 }));// false
        System.out.println(isMonotonic(new int[] { 1, 2, 4, 5 }));// true
        System.out.println(isMonotonic(new int[] { 1, 1, 1 }));// true
        System.out.println(isMonotonic(new int[] { 1, 1, 0 }));// true
        System.out.println(isMonotonic(new int[] { 1, 1, 2 }));// true
    }

    public static boolean isMonotonic(int[] nums) {
        // 2 ms 114.6 MB
        int length = nums.length;
        boolean flag = nums[0] < nums[length - 1];

        for (int i = 0; i < length - 1; i++) {
            if (flag) {
                if (nums[i] > nums[i + 1])
                    return false;
            } else {
                if (nums[i] < nums[i + 1])
                    return false;
            }
        }

        return true;
    }

    public static boolean isMonotonic1(int[] nums) {
        // 6 ms 114.8 MB
        boolean increase = true, decrease = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                increase = false;
            if (nums[i] < nums[i + 1])
                decrease = false;
        }
        return increase || decrease;
    }
}
