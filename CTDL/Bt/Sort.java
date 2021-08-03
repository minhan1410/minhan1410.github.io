public class Sort {
    public static void main(String[] args) {
        int arr[] = new int[] { 6,5,3,1,8,7,2,4 };
        InserttionSort(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    // Chen
    public static void InserttionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                    i--;
                }
            }
        }
    }

    // Noi bot
    public static void BubbleSort(int[] n) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int t = n[i];
                    n[i] = n[j];
                    n[j] = t;
                }
            }
        }
    }

    // Chon
    public static void SelectionSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int min = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[min] < n[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int t = n[i];
                n[i] = n[min];
                n[min] = t;
            }
        }
    }
}
