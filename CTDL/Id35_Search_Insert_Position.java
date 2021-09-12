public class Id35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target<=nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5)); //2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); //1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7)); //4
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0)); //0
        System.out.println(searchInsert(new int[]{1}, 0)); //0
        System.out.println(searchInsert(new int[]{1}, -1)); //0
    }
}
