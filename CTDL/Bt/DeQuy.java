public class DeQuy {
    public static void main(String[] args) {
        // System.out.println("Giai thua: " + GiaiThua(7));

        // long s = System.currentTimeMillis();
        // System.out.println(Fibonacci(45));
        // long f = System.currentTimeMillis();
        // System.out.println("1) " + (f - s));

        // s = System.currentTimeMillis();
        // System.out.println(Fibonacci1(45));
        // f = System.currentTimeMillis();
        // System.out.println("2) " + (f - s));

        // System.out.println(Pow(5, 7));

        // PrintArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0);

        // System.out.println(PrintArray1(new int[] { 11, 12, 13, 14, 15, 16, 17, 18,
        // 19, 20 }, 0));

        // System.out.println(Ucln(3, 2));

        // System.out.println(Bcnn(3, 4));
        // ThapHaNoi('A', 'B', 'C', 3);
        // System.out.println("So lan chay (2^n -1) = " + (Math.pow(2, 3) - 1));

        // System.out.println(find(-2, new int[] { 1, 2, 5, 4 }, 0));
        // System.out.println(sumArray(new int[] { 1, 2, 5, 4, 3 }, 0));
        // System.out.println(sumArray(new int[] { 1, 2, 5, 4, 3, 6, 7, 8, 9, 10 }, 2,
        // 111));
        int[][] arr = new int[][] { { 9,7 }, 
                                    { 2,4}};

        // System.out.println(arr[1].length);
        travel(arr, 0, 0);
    }

    public static int GiaiThua(int n) {
        if (n == 1) {
            return 1;
        }
        return n * GiaiThua(n - 1);
    }

    public static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    // Đệ quy có nhớ
    static int F[] = new int[1000];

    public static int Fibonacci1(int n) {
        if (F[n] != 0) {
            return F[n];
        }
        if (n == 1 || n == 2) {
            F[n] = 1;
            return 1;
        }
        F[n] = Fibonacci(n - 1) + Fibonacci(n - 2);
        return F[n];
    }

    public static int Sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + Sum(n - 1);
    }

    public static int Pow(int a, int n) {
        if (n == 1) {
            return a;
        }
        return a * Pow(a, n - 1);
    }

    public static void PrintArray(int[] nums, int i) {
        if (i == nums.length) {
            return;
        }
        System.out.print(nums[i] + ", ");
        PrintArray(nums, i + 1);
    }

    public static String PrintArray1(int[] nums, int i) {
        if (i == nums.length - 1) {
            return nums[nums.length - 1] + ".\n";
        }

        return nums[i] + ", " + PrintArray1(nums, i + 1);
    }

    public static int Ucln(int a, int b) {
        if (b == 0)
            return a;
        return Ucln(b, a % b);
    }

    public static int Bcnn(int a, int b) {
        return a * b / Ucln(a, b);
    }

    public static void ThapHaNoi(char a, char b, char c, int length) {
        if (length == 1) {
            System.out.println("==> " + a + " -> " + c);
            return;
        }
        ThapHaNoi(a, c, b, length - 1);
        ThapHaNoi(a, b, c, 1);
        ThapHaNoi(b, a, c, length - 1);
    }

    // -------------------------------------------------------------------------

    // BTVN
    public static int find(int x, int arr[], int i) {
        if (i == arr.length) {
            return -1;
        }

        if (x == arr[i]) {
            return i;
        }

        return find(x, arr, i + 1);
    }

    // -------------------------------------------------------------------------

    public static int sumArray(int arr[], int i) {
        if (i > arr.length) {
            return -1;
        }

        if (i == arr.length - 1) {
            return arr[i];
        }
        return arr[i] + sumArray(arr, i + 1);
    }

    public static int sumArray(int[] arr, int starIndex, int endIndex) {
        if (endIndex > arr.length) {
            return -1;
        }
        if (starIndex == endIndex - 1) {
            return arr[starIndex];
        }
        return arr[starIndex] + sumArray(arr, starIndex + 1, endIndex);
    }

    public static void travel(int[][] arr, int i, int j) {
        System.out.print(arr[i][j] + ", ");
        
        if (j < arr[0].length-1) {
            travel(arr, i, j + 1);
        }

        if (j == arr[0].length -1) {
            if (i == arr.length - 1) {
                return;
            }
            System.out.println();
            travel(arr, i + 1, 0);
        }
    }
}
