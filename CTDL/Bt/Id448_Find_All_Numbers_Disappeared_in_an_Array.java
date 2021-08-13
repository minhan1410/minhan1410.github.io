import java.util.ArrayList;
import java.util.List;

public class Id448_Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] { 1, 1 }));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // 5 ms
        List<Integer> result = new ArrayList<Integer>();

        int arr[] = new int[nums.length];

        for (int i : nums) {
            arr[i - 1] = 1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        // 7 ms
        List<Integer> result = new ArrayList<Integer>();
        boolean arr[] = new boolean[nums.length];

        for (int i : nums) {
            arr[i-1] = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]) {
                result.add(i+1);
            }
        }

        return result;
    }
}
