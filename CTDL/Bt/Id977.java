import java.util.Arrays;

public class Id977 {
    public static void main(String[] args) {
        for (int i : sortedSquares(new int[] { -4, -1, 0, 3, 10 })) {
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
        return nums;
    }
}
