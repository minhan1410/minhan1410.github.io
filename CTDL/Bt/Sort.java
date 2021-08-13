import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = new int[] { 6, 5, 3, 1, 8, 7, 2, 4 };
        quickSortArray(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    // -----------------------------------------------------------------------------------------------

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

    // -----------------------------------------------------------------------------------------------

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

    // -----------------------------------------------------------------------------------------------

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

    // -----------------------------------------------------------------------------------------------
    // Sắp xếp trộn

    // trộn
    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // a1 & a2 != Rong
                if (a1[i1] <= a2[i2]) { // a1 nho hon
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {// a2 nho hon
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {// a1 rong or a2 rong
                if (i1 < a1.length) { // a1 ok
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a2 ok
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return result;
    }

    public static int[] mergeSort(int a[], int L, int R) {
        // THDB DKD
        if (L > R)
            return new int[0];
        if (L == R) {
            int[] singleElement = { a[L] };
            return singleElement;
        }

        // Chia ra
        // System.out.println("Chia: " + L + " - " + R);
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);

        // Tron vao: a2 va a1 la cac mang da duoc sap xep
        int[] result = merge(a1, a2);
        // System.out.println("Ket Qua Merge: " + Arrays.toString(result));
        return result;
    }

    public static int[] mergeSortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    // -----------------------------------------------------------------------------------------------

    // Sắp xếp nhanh

    // Return pivot value
    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // Voi iL, di tim phan tu >= key de doi cho
            while (a[iL] < key)
                iL++;
            // voi iR, di tim phan tu <= key de doi cho
            while (a[iR] > key)
                iR--;
            // doi cho 2 phan tu dang dung khong dung vi tri
            if (iL <= iR) {
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }

        return iL;
    }

    public static void quickSort(int[] a, int L, int R) {
        // Dieu kien dung
        if (L >= R)
            return;

        // B1. Chon khoa
        int key = a[(L + R) / 2]; // 0-7: (0+7)/2 = 3

        // B2. Phan bo lai mang theo khoa
        int k = partition(a, L, R, key);
        System.out.println("L=" + L + " R=" + R + " key = " + key + " k = " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        System.out.println("=============");
        // B3. Chia doi mang => Lap lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    public static void quickSortArray(int[] a){
        quickSort(a, 0, a.length-1);
    }
}
