import java.util.Arrays;

public class Id53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int maxsum = nums[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));//6
        System.out.println(maxSubArray(new int[]{1}));//1
        System.out.println(maxSubArray(new int[]{5, 4, -1, 7, 8}));//23
    }
}
