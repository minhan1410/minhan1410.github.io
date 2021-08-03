public class Id88 {
    public static void main(String[] args) {
        int []nums1 =new int[] {1,2,3,0,0,0}, nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i+", ");
        }
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0)// Ca i va j deu hop le
            {
                // Tim phan tu lon hon nhet vao mang nums1
                if (nums1[i] >= nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            } else if (i >= 0)// Chi co i hop le
            {
                nums1[k--] = nums1[i--];
            } else // Chi co j hop le
            {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
