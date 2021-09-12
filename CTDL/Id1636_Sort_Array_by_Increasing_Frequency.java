import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Id1636_Sort_Array_by_Increasing_Frequency {
    public static int[] frequencySort(int[] nums) {
        // 11 ms 39.2 MB
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // Arrays.stream(nums).forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
        for (int i : nums) {
            // if (!map.containsKey(i)) {
            //     map.put(i, 1);
            // } else {
            //     map.put(i, map.get(i) + 1);
            // }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return Arrays.stream(nums).boxed().sorted((a, b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
                .mapToInt(m -> m).toArray();

        // .stream(nums): iterates through the nums array

        // .boxed(): converts each int to Integer object, this is because .sorted() can only operate on objects

        // .sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
        // if frequency of two numbers are not the same, sort by ascending frequency. If frequencies are the same, sort by decending numeric value

        // .mapToInt(n -> n): converts Integer to int

        // .toArray(): returns array
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frequencySort(new int[] { 1, 1, 2, 2, 2, 3 })));// [3,1,1,2,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[] { 2, 3, 1, 3, 2 })));// [1,3,3,2,2]
        System.out.println(Arrays.toString(frequencySort(new int[] { -1, 1, -6, 4, 5, -6, 1, 4, 1 })));// [5,-1,4,4,-6,-6,1,1,1]
    }
}