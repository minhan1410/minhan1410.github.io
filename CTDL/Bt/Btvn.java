import java.util.Arrays;
import java.util.Scanner;

public class Btvn {
    public static int binarySearchWhile(int[] arr, int key) {
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

    public static int binarySearchWhile(String[] arr, String key) {
        int left = 0, right = arr.length - 1, m = 0;

        if (key.equals(arr[left])) {
            return left;
        }

        if (key.equals(arr[right])) {
            return right;
        }

        while (left <= right) {
            m = (left + right) / 2;
            if (key.compareTo(arr[m]) > 0) {
                left = m + 1;
            } else {
                right = m - 1;
            }

            if (key.equals(arr[m])) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] stt = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        String[] name = new String[] { "Bui Giang Son", "Lê Văn Phú", "Dương Văn Thắng", "Nguyễn Công Khanh",
                "Nguyễn Quang Tùng", "Chử Văn Long", "Lê Văn Tốt", "Nguyễn Thành Trung", "Hoàng Trọng Khoa",
                "Nguyễn Minh An", "Nguyễn Việt Anh" };

        System.out.println("Nhap stt in ra ten");
        System.out.print("Nhap stt can tim: ");

        int n = scanner.nextInt();
        int v = binarySearchWhile(stt, n);

        if (v == -1) {
            System.out.println("K tim thay");
        } else {
            System.out.println("Ten can tim la: " + name[v]);
        }

        System.out.println("\nNhap ten in stt");
        System.out.println("stt: " + stt[binarySearchWhile(name, "Nguyễn Minh An")]);

        System.out.println("\nArrays name: "+name[Arrays.binarySearch(stt, 10)]);
    }
}
