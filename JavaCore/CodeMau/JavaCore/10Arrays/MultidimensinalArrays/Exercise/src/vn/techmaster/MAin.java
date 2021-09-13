package vn.techmaster;

import java.util.Scanner;

public class MAin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng và số cột của ma trận: ");
        int row = scanner.nextInt();
        int col = row;
        int array[][] = new int [row][col];
        for (int i = 0; i < row; i++){
            for(int j = 0 ; j < col; j++){
                System.out.printf("Nhập phần tử thứ %d-%d: ", i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        show(array);

        System.out.println("Đường chéo chính: ");
        diagonalLine(array);

        sortRowTwo(array);
        System.out.println("Mảng sau khi sắp xếp hàng 2: ");
        show(array);


    }

    static void show(int array[][]){
        for (int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void diagonalLine(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if(i == j){
                    System.out.print(array[i][j] + "\t");
                    sum += array[i][j];
                }
            }

        }

        System.out.println("\nTổng các phần tử đường chéo chính là: " + sum);
    }

    static void sortRowTwo(int a[][]){
        for(int i = 0; i < a.length - 1;i++) {
            for (int j = i + 1; j < a[i].length; j++) {
                if (a[1][i] > a[1][j]) {
                    int tg = a[1][i];
                    a[1][i] = a[1][j];
                    a[1][j] = tg;
                }
            }
        }
    }
}
