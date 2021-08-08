import java.util.Arrays;
// import java.util.Collections;

public class Id977_Combinations {
    public static void main(String[] args) {
        for (int i : sortedSquaresBubbleSort(new int[] { -4, -1, 0, 3, 10 })) {
            System.out.print(i + ", ");
        }
    }

    public static int[] sortedSquares1(int[] nums) {
        nums = Arrays.stream(nums).map(i -> i * i).toArray();
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares2(int[] nums) {
        return Arrays.stream(nums).map(i -> i * i).sorted().toArray();
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        // Arrays.sort(nums, Collections.reverseOrder());   
        return nums;
    }

    public static int[] sortedSquaresBubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]>nums[j]){
                    int t=nums[j];
                    nums[j]= nums[i];
                    nums[i]= t;
                }
            }
        }

        return nums;
    }
}
