package vn.techmaster;

import java.util.Scanner;

public class IntegerArray {

    public void createArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i);
            array[i] = scanner.nextInt();
        }
    }

    public void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public void indexMax(int[] array, int max) {
        System.out.println("Vị trí của phần tử lớn nhất là: ");
        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                System.out.print(i + "\t");
            }
        }
    }

    public int findMax2(int[] array) {
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < findMax(array) && array[i] > max2 ) {
                max2 = array[i];

            }
        }
        return max2;
    }

    public void indexMax2(int[] array, int max2) {
        System.out.println("Vị trí của phần tử lớn thứ 2 là: ");
        for (int i = 0; i < array.length; i++) {
            if (max2 == array[i]) {
                System.out.print(i + "\t");
            }
        }
    }

    public int findMin(int array[]){
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public void indexMin(int array[], int min){
        System.out.println("Vị trí phần tử nhỏ nhất trong mảng là: ");
        for (int i = 0; i < array.length; i++){
            if(min == array[i]){
                System.out.print(i + "\t");
            }
        }
    }

}
