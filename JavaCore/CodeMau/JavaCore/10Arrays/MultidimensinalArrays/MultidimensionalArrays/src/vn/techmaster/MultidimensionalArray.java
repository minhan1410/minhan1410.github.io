package vn.techmaster;

import java.util.Scanner;

public class MultidimensionalArray {



    //Phương thức nhập mảng
    public void nhapMang( int n, int arr[][]){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < n; i ++){
            for(int j = 0 ; j < n; j++){
                System.out.printf("Nhap phan tu vi tri arr[%d][%d]: ", i,j);
                arr[i][j] = scanner.nextInt();
            }
        }

    }


    //Phương thức xuất mảng
    public void xuatMang(int n, int arr[][]){
        for(int i = 0; i < n ; i++){
            System.out.println("");
            for(int j = 0 ; j < n; j ++){
                System.out.print(arr[i][j]+"\t");
            }
        }
    }

    //Phương thức tìm ma trận chuyển vị
    public void maTranChuyenVi(int n , int arr[][]){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }


    //Phương thức tính tổng các phần tử chia hết 5
    public void tongPhanTuChiaHet5(int arr[][], int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] % 5 == 0){
                    sum += arr[i][j]; // sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("\nTong cac phan tu chia het 5 la: "+sum);
    }
}
