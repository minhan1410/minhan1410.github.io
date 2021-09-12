import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Id506_Relative_Ranks {
    public static String[] findRelativeRanks(int[] score) {
        // 7 ms 52.6 MB
        int arr[] = score.clone();
        Arrays.sort(arr);

        Map<Integer, String> map = new HashMap<Integer, String>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                map.put(arr[i], "Gold Medal");
            } else if (i == length - 2) {
                map.put(arr[i], "Silver Medal");
            } else if (i == length - 3) {
                map.put(arr[i], "Bronze Medal");
            } else {
                map.put(arr[i], String.valueOf(length - i));
            }
        }

        String result[] = new String[length];
        for (int i = 0; i < length; i++) {
            result[i] = map.get(score[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[] { 5, 4, 3, 2, 1 })));
        System.out.println(Arrays.toString(findRelativeRanks(new int[] { 10, 3, 8, 9, 4 })));
    }
}
