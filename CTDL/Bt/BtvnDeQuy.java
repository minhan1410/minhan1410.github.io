public class BtvnDeQuy {
    public static void main(String[] args) {
        System.out.println(find(-2, new int[] { 1, 2, 5, 4 }, 0));
        System.out.println(find(1, new int[] { 1, 2, 5, 4 }, 0));
        System.out.println(find(2, new int[] { 1, 2, 5, 4 }, 0));
        System.out.println(find(5, new int[] { 1, 2, 5, 4 }, 0));
        System.out.println(find(4, new int[] { 1, 2, 5, 4 }, 0));
        System.out.println(find(-4, new int[] { 1, 2, 5, 4 }, 0));

    }

    public static int find(int x, int arr[], int i) {
        if (i == arr.length) {
            return -1;
        }

        if (x == arr[i]) {
            return i;
        }

        return find(x, arr, i + 1);
    }
}
