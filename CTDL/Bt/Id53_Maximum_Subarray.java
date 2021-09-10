import java.util.Arrays;

public class Id53_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int []clone = nums.clone();
        Arrays.sort(clone);
        int max =0,length = nums.length;
        for (int i = 0; i < length; i++) {
            int sum = 0;
            if (nums[i]==clone[length-1]){

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));//6
        System.out.println(maxSubArray(new int[]{1}));//1
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));//23
    }
}
