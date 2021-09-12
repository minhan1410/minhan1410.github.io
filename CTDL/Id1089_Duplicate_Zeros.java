import java.util.Arrays;

public class Id1089_Duplicate_Zeros {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(a);
        System.out.println(Arrays.toString(a));
    }

    public static void duplicateZeros(int[] a) {
        int[] b = a.clone();

        int ia = 0, ib = 0;
        while (ia < a.length && ib < a.length) {
            if (b[ib] == 0) {
                a[ia++] = 0;
            }
            if (ia < a.length) {
                a[ia++] = b[ib++];
            }
        }
    }
}
