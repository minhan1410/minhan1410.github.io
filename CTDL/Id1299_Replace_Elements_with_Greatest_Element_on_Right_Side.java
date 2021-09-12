import java.util.Arrays;

public class Id1299_Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[] { 17, 18, 5, 4, 6, 1 })));
    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int max = 0, t = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            t = arr[i];
            if (i == arr.length - 1) {
                arr[i] = -1;
            }else{
                arr[i] = max;
            }
            max = Math.max(max, t);
        }

        return arr;
    }

    // 151 ms
    public static int[] replaceElements1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            if (i + 1 == arr.length) {
                max = -1;
            } else {
                for (int j = i + 1; j < arr.length; j++) {
                    max = Math.max(max, arr[j]);
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
