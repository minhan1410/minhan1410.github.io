import java.util.ArrayList;
import java.util.Arrays;

public class Id852_Peak_Index_in_a_Mountain_Array {
    public static int peakIndexInMountainArray1(int[] arr) {
        // 4 ms 38.8 MB
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        }
        Arrays.sort(arr);
        return list.indexOf(Integer.valueOf(arr[arr.length - 1]));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        // 0 ms 39.3 MB
        int index = 0;
        for (int i = index+1; i < arr.length; i++) {
            if(arr[index]<arr[i]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] { 0, 1, 0 }));// 1
        System.out.println(peakIndexInMountainArray(new int[] { 0, 2, 1, 0 }));// 1
        System.out.println(peakIndexInMountainArray(new int[] { 0, 10, 5, 2 }));// 1
        System.out.println(peakIndexInMountainArray(new int[] { 3, 4, 5, 1 }));// 2
        System.out.println(peakIndexInMountainArray(new int[] { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 }));// 2
    }
}
