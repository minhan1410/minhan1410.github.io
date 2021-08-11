public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearchRecursive(new int[] { 1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72 }, 19, 0, 10));
    }

    public static int binarySearchFor(int[] arr, int key) {
        int left = 0, right = arr.length - 1, m = 0;

        if (key == arr[left]) {
            return left;
        }

        if (key == arr[right]) {
            return right;
        }

        while (left <= right) {
            m = (left + right) / 2;
            if (key > arr[m]) {
                left = m + 1;
            } else {
                right = m - 1;
            }

            if (key == arr[m]) {
                return m;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int key, int left, int right) {
        if (left <= right) {
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
