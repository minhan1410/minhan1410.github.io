import java.util.Arrays;
import java.util.HashMap;

public class Id1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        // 4 ms 39.1 MB
        int result[] = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j]) {
                        count++;
                    }
                }
                map.put(nums[i], count);
            }
            result[i] = map.get(nums[i]);
        }

        return result;
    }

    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        // copy 0 ms 38.8 MB
        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        // 2 <= nums.length <= 500
        // 0 <= nums[i] <= 100

        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 0;
            } else {
                nums[i] = arr[nums[i] - 1];
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 }))); // 4,0,1,1,3
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 6, 5, 4, 8 }))); // 2,1,0,3
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[] { 7, 7, 7, 7 }))); // 0,0,0,0
    }
}
