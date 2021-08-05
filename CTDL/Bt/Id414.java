import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Id414 {
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[] { 3, 2, 1 }));
    }

    public static int thirdMax1(int[] nums) {
        // 5 ms
        Set<Integer> set = new HashSet<Integer>();

        for (Integer integer : nums) {
            set.add(integer);
        }

        Integer[] arr = new Integer[set.size()];
        arr = set.toArray(arr);

        Arrays.sort(arr, Collections.reverseOrder());

        if (arr.length < 3) {
            return arr[0];
        }
        return arr[2];
    }

    public static int thirdMax(int[] nums) {
        // 2 ms
        Arrays.sort(nums);

        int trung = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[trung]) {
                nums[++trung] = nums[i];
            }
        }

        if (trung < 2) {
            return nums[trung];
        }
        return nums[trung - 2];
    }
}
