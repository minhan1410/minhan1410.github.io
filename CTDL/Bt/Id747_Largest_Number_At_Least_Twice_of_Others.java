public class Id747_Largest_Number_At_Least_Twice_of_Others {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] { 3, 6, 1, 0 })); // 1
        System.out.println(dominantIndex(new int[] { 1, 2, 3, 4 })); // -1
        System.out.println(dominantIndex(new int[] { 1 })); // 0
        System.out.println(dominantIndex(new int[] { 0, 0, 0, 1 })); // 3
        System.out.println(dominantIndex(new int[] { 1, 0 })); // 0
        System.out.println(dominantIndex(new int[] { 1, 2, 16, 35, 44, 100, 27, 0 })); // 5
        System.out.println(dominantIndex(new int[] { 2, 3 })); // -1

    }

    public static int dominantIndex(int[] nums) {
        int max = -1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != max && (2 * nums[i]) > max)
                return -1;
        }

        return index;
    }
}
