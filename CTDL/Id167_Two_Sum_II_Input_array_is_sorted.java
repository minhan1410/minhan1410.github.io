import java.util.Arrays;

public class Id167_Two_Sum_II_Input_array_is_sorted {
    /*public static int[] twoSum(int[] numbers, int target) {
//        1 ms	39.1 MB
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int search = Arrays.binarySearch(numbers,i+1,numbers.length, target-numbers[i]);
            if(search >= 0){
                result[0] = i+1;
                result[1] = search+1;
                return result;
            }
        }
        return result;
    }*/

    public static int[] twoSum(int[] numbers, int target) {
//        0 ms	39 MB
        int[] result = new int[2];
        int s = 0, f = numbers.length - 1;

        while (s < f) {
            int sum = numbers[s] + numbers[f];
            if (sum == target) {
                result[0] = s + 1;
                result[1] = f + 1;
                return result;
            } else if (sum > target) {
                f--;
            } else {
                s++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1)));
        System.out.println(Arrays.toString(twoSum(new int[]{5, 25, 75}, 100)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)));
    }
}
