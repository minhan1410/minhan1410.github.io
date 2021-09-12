import java.util.Arrays;

public class Id1051_Height_Checker {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[] { 1, 2, 3, 4, 5}));
    }

    public static int heightChecker(int[] heights) {
        int arr[] = heights.clone();
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(heights[i]!=arr[i]) {
                count++;
            }
        }
        return count;
    }
}
