package vn.techmaster;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        arrayDemo();

//        MultidimensionalArray multidimensionalArray = new MultidimensionalArray();
//        Scanner scanner = new Scanner(System.in);
//        //Khai báo số hàng và số cột
//        System.out.println("Nhap so hang va so cot: ");
//        int n = scanner.nextInt();
//
//        //Khởi tạo và cấp phát bộ nhớ cho mảng
//        int A[][] = new int[n][n];
//        int B[][] = new int[n][n];
//
//        System.out.println("Nhap mang A");
//        multidimensionalArray.nhapMang(n, A);
//
//        System.out.println("Nhap mang B");
//        multidimensionalArray.nhapMang(n, B);
//
//        System.out.print("Mang A sau khi nhap la: ");
//        multidimensionalArray.xuatMang(n, A);
//
//        System.out.println("\nMang B sau khi nhap la: ");
//        multidimensionalArray.xuatMang(n, B);
//
//        //Cộng hai ma trận vuông A và B
//        //khởi tạo mảng C là tổng của hai mảng A và B
//        int C[][] = new int[n][n];
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j < n; j++){
//                C[i][j] = A[i][j] + B[i][j];
//            }
//        }
//        System.out.println("\nMang sau khi cong la: ");
//        multidimensionalArray.xuatMang(n, C);
//
//        System.out.println("\nMa tran chuyen vi cua A la: ");
//        multidimensionalArray.maTranChuyenVi(n, A);
//        multidimensionalArray.xuatMang(n, A);
//
//        System.out.println("\nMa tran chuyen vi cua B la: ");
//        multidimensionalArray.maTranChuyenVi(n, B);
//        multidimensionalArray.xuatMang(n, B);
//
//        multidimensionalArray.tongPhanTuChiaHet5(A, n);
    }

    public static void arrayDemo(){
        int row = 2;
        int column = 4;
        int[][] myNumbers = new int[row][column];
        myNumbers[0][0] = 1;
        myNumbers[0][1] = 2;
        myNumbers[0][2] = 3;
        myNumbers[0][3] = 4;
        myNumbers[1][0] = 5;
        myNumbers[1][1] = 6;
        myNumbers[1][2] = 7;
        myNumbers[1][3] = 8;

        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7, 8} };

        System.out.println("Mảng nhiều chiều: ");
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                System.out.print(myNumbers[i][j] + "\t");
            }
            System.out.println();
        }
        int x = myNumbers[0][3];
        System.out.println("Phần tử ở vị trí 0-3 là: "+x);
    }
}
