public class Id704_Binary_Search {
    public static void main(String[] args) {
        System.out.println(search(new int[] { -1, 0, 3, 5, 9, 12 }, 2));
    }

    public static int search(int[] nums, int target) {
        return binarySearchRecursive(nums, target, 0, nums.length - 1);
    }

    public static int binarySearchRecursive(int[] arr, int key, int left, int right) {
        if(left <= right){
            int m = (left + right) / 2;
            if (key > arr[m]) {
                return binarySearchRecursive(arr, key, m + 1, right);
            }
            if (key < arr[m]) {
                return binarySearchRecursive(arr, key, left, m - 1);
            }
            if (key == arr[m]) {
                return m;
            }
        }
        return -1;
    }
}
