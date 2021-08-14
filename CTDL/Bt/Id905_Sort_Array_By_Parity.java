public class Id905_Sort_Array_By_Parity {
    public static void main(String[] args) {
        for (int i : sortArrayByParity(new int[] { 1,2,1,2,1,1 })) {
            System.out.print(i + ", ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            if (nums[j] % 2 != 0) {
                j--;
            }
            if (nums[i] % 2 == 0) {
                i++;
            }
        }

        return nums;
    }
}
