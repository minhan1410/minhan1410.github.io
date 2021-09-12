public class Id941_Valid_Mountain_Array {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{ 0, 3, 2, 1}));
    }

    public static boolean validMountainArray(int[] arr) {
        int i = 1;
        if (arr.length < 3){
            return false;
        }

        while (i < arr.length && arr[i] > arr[i - 1]) {
            i += 1;
        }

        if (i == 1 || i == arr.length) {
            return false;
        }

        while (i < arr.length && arr[i] < arr[i - 1]) {
            i += 1;
        }
        return i == arr.length;
    }
}
