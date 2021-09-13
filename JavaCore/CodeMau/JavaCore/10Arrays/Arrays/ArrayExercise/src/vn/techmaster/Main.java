package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Bài 1
        IntegerArray integerArray = new IntegerArray();
        System.out.println("Nhập kích thước mảng: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        integerArray.createArray(arr);

        System.out.println("Mảng sau khi nhập là: ");
        integerArray.show(arr);

        int max = integerArray.findMax(arr);
        System.out.println("\nPhần tử lớn nhất trong mảng là: " + max);
        integerArray.indexMax(arr, max);

        int max2 = integerArray.findMax2(arr);
        System.out.println("\nPhần tử lớn thứ 2 trong mảng là: " + max2);
        integerArray.indexMax2(arr, max2);

        int min = integerArray.findMin(arr);
        System.out.println("\nPhần tử nhỏ nhất trong mảng là: " + min);
        integerArray.indexMin(arr, min);

        //Bài 2
//        StringArray stringArray = new StringArray();
//        System.out.println("Nhập kích thước mảng: ");
//        int sizeString = scanner.nextInt();
//        String[] array = new String[sizeString];
//        stringArray.createArray(array);
//
//        System.out.println("Mảng vừa nhập là: ");
//        stringArray.show(array);
//
//        int count = stringArray.countString(array);
//        System.out.println("Số lần từ java xuất hiện trong mảng là: " + count);
//
//        System.out.print("Nhập chuỗi bất kỳ: ");
//        scanner.nextLine();
//        String str = scanner.nextLine();
//        stringArray.indexString(array, str);



    }
}
