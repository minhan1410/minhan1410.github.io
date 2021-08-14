import java.util.HashMap;
import java.util.Map;

public class Id1_Two_Sum {
    public static void main(String[] args) {
        for (int i : twoSum(new int[] { 3, 3 }, 6)) {
            System.out.print(i + ", ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] kq = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                kq[0] = map.get(target - nums[i]);
                kq[1] = i;
                return kq;
            }
            map.put(nums[i], i);
        }
        return kq;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] kq = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == target - nums[j]) {
                    kq[0] = i;
                    kq[1] = j;
                }
            }
        }
        return kq;
    }
}