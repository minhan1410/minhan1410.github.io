public class Id724_Find_Pivot_Index {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int []{ 1, 7, 3, 6, 5, 6}));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum+= i;
        }

        int left = 0,right = 0;
        for (int i = 0; i < nums.length; i++) {
            right = sum - left - nums[i];
            if(right == left) {
                return i;
            }
            left += nums[i]; 
        }

        return -1;
    }
}
