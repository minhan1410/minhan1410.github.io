public class ID136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[] { 4, 1, 2, 1, 2 }));
    }

    public static int singleNumber(int[] nums) {
        int v = 0;
        for (int i = 0; i < nums.length; i++) {
            v ^= nums[i];
        }
        return v;
    }

    public static int singleNumber1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i];
            }
            count = 0;
        }
        return -1;
    }
}
