import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    // public static BigInteger GiaiThua(int n) {
    //     BigInteger tich = new BigInteger("1");
    //     if (n == 0 || n == 1) {
    //         return tich;
    //     }
    //     for (int i = n; i >= 2; i--) {
    //         tich = tich.multiply(new BigInteger(i + ""));
    //     }
    //     return tich;
    // }

    // public static BigInteger ToHop(int n, int k) {
    //     return GiaiThua(n).divide(GiaiThua(k).multiply(GiaiThua(n - k)));
    // }

    // public static int LengNumber(String number) {
    //     number = number.replace("-", "");
    //     return number.length();
    // }

    // public static String ReverseNumber(String number) {
    //     number = number.replace("-", "");
    //     while (number.charAt(0) == '0') {
    //         number = number.replaceFirst("0", "");
    //     }

    //     String s = "";
    //     for (int i = number.length() - 1; i >= 0; i--) {
    //         s += number.charAt(i);
    //     }

    //     while (s.charAt(0) == '0') {
    //         s = s.replaceFirst("0", "");
    //     }
    //     return s;
    // }

    // public static String CheckChinhPhuong(long number) {
    //     long sqrt = (long) (Math.sqrt(number));
    //     if (number == Math.pow(sqrt, 2)) {
    //         return "YES";
    //     }
    //     return "NO";
    // }

    // public static String ChuyenNhiPhan(int t) {
    //     Scanner scanner = new Scanner(System.in);
    //     int dem = 0;
    //     long n;
    //     String s = "";
    //     while (dem < t) {
    //         n = scanner.nextLong();
    //         s += Long.toBinaryString(n) + "\n";
    //         dem++;
    //     }
    //     return s;
    // }

    // public static void HPT(double a, double b, double c, double d, double e, double f) {
    //     double D = a * e - b * d;
    //     double Dx = c * e - b * f;
    //     double Dy = a * f - c * d;

    //     if (D == 0) {
    //         if (Dx == Dy && Dx == 0) {
    //             System.out.println("VOSONGHIEM");
    //         } else {
    //             System.out.println("VONGHIEM");
    //         }
    //     } else {
    //         double x = Dx / D, y = Dy / D;
    //         if (x == 0) {
    //             System.out.print("0.00 ");
    //             System.out.printf("%.2f", y);
    //         } else if (y == 0) {
    //             System.out.printf("%.2f ", x);
    //             System.out.print("0.00");
    //         } else {
    //             System.out.printf("%.2f  %.2f", x, y);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Arrays.sort(a);
        int sum = a[0][0];
        for (int i = 0; i < m-1; ) {
            for (int j = 0; j < n-1; ) {
                if(i==0){
                    if(Math.max(a[i][j+1], a[i+1][j+1])==a[i][j+1]){
                        j=j+1;
                    } else{
                        i=i+1; j=j+1;
                    }
                }else if(i==m-1){
                    if(Math.max(a[i][j+1], a[i-1][j+1])==a[i][j+1]){
                        j=j+1;
                    } else{
                        i=i-1; j=j+1;
                    }
                }else{
                    if(Math.max(a[i][j+1], a[i-1][j+1])==a[i][j+1]){
                        if(Math.max(a[i][j+1], a[i+1][j+1])==a[i][j+1]){
                            j=j+1;
                        } else{
                            i=i+1; j=j+1;
                        }
                    } else{
                        if(Math.max(a[i-1][j+1], a[i+1][j+1])==a[i-1][j+1]){
                            i=i-1; j=j+1;
                        } else{
                            i=i+1; j=j+1;
                        }
                    }
                }
                sum+=a[i][j];
            }
        }

        System.out.println("==> "+sum);
    }
}
/*
5 7
9 -2 6 2 1 3 4
0 -1 6 7 1 3 3
8 -2 8 2 5 3 2
1 -1 6 2 1 6 1
7 -2 6 2 1 3 7
 
3 4 0 1 2 3 4 5 6 7 8 9 10 11
 */