import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;
import java.util.TreeMap;

public class MergeSort_QuickSort {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("####,###,###");
        Map<Long,String> map = new TreeMap<Long,String>();

        long start = System.nanoTime();
        Sort.BubbleSort(new int[] { 1, -6, 9, 10, 20, 10000, 1230, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143, 53,
                321, 4546, 123 });
        long finish = System.nanoTime();
        map.put(finish - start,"BubbleSort");

        start = System.nanoTime();
        Sort.InserttionSort(new int[] { 1, -6, 9, 10, 20, 10000, 1230, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143,
                53, 321, 4546, 123 });
        finish = System.nanoTime();
        map.put(finish - start, "InserttionSort");

        start = System.nanoTime();
        Sort.SelectionSort(new int[] { 1, -6, 9, 10, 20, 10000, 1230, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143,
                53, 321, 4546, 123 });
        finish = System.nanoTime();
        map.put(finish - start, "SelectionSort");

        start = System.nanoTime();
        mergeSortArray(new int[] { 1, -6, 9, 10, 20, 10000, 1230, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143, 53,
                321, 4546, 123 });
        finish = System.nanoTime();
        map.put(finish - start, "mergeSortArray");

        start = System.nanoTime();
        quickSortArray(new int[] { 1, -6, 9, 10, 20, 10000, 1230, 5, 8, 2, 4, 3, 7, 5, 6, 7, 8, 2, 31, 3, 34, 143, 53,
                321, 4546, 123 });
        finish = System.nanoTime();
        map.put(finish - start, "quickSortArray");

        map.forEach((k, v)-> System.out.println(formatter.format(k)+"s - "+v));
    }

    // ------------------------------------------------------------------------------------------------
    public static int[] mergeSortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    // Chia
    public static int[] mergeSort(int[] nums, int l, int r) {
        if (l == r) {
            return new int[] { nums[l] };
        }

        int mid = (l + r) / 2;
        int[] nums1 = mergeSort(nums, l, mid);
        int[] nums2 = mergeSort(nums, mid + 1, r);

        return merge(nums1, nums2);
    }

    // Gộp
    public static int[] merge(int[] nums1, int[] nums2) {
        int nums[] = new int[nums1.length + nums2.length];
        int i = 0, i1 = 0, i2 = 0, length = nums.length, length1 = nums1.length, length2 = nums2.length;

        while (i < length) {
            if (i1 < length1 && i2 < length2) {
                if (nums1[i1] < nums2[i2]) {
                    nums[i++] = nums1[i1++];
                } else {
                    nums[i++] = nums2[i2++];
                }
            } else {
                while (i1 < length1) {
                    nums[i++] = nums1[i1++];
                }
                while (i2 < length2) {
                    nums[i++] = nums2[i2++];
                }
            }
        }
        return nums;
    }

    // ------------------------------------------------------------------------------------------------

    public static void quickSortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public static void quickSort(int nums[], int l, int r) {
        if (l >= r) {
            return;
        }

        int pivot = partition(nums, l, r, nums[(l + r) / 2]);
        quickSort(nums, l, pivot - 1);
        quickSort(nums, pivot, r);
    }

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
                a[iL++] = a[iR];
                a[iR--] = temp;
                // iL++;
                // iR--;
            }
        }

        return iL;
    }
}