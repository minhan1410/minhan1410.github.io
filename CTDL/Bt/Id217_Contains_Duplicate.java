import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Id217_Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
        System.out.println(containsDuplicate1(new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 }));
    }

    public static boolean containsDuplicate1(int[] nums) {
        // 6 ms	44.9 MB
        Set<Integer> set = new HashSet<Integer>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        // 3 ms	42.1 MB
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}