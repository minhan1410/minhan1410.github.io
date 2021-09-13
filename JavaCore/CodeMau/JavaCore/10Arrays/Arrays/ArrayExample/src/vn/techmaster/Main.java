package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerArray integerArray = new IntegerArray();
        System.out.print("Nhập số phần tử cho mảng: ");
        int size = sc.nextInt();
        int intArray[] = new int[size];

        integerArray.createArray(intArray);
        System.out.println("Mảng vừa nhập là: ");
        integerArray.show(intArray);
        System.out.println();

        //Dùng phương thức lenght để lấy kích thước mảng
        System.out.println("Kích thước mảng là: " + intArray.length);

        System.out.println("Phần tử có index = 2: " + intArray[2]);

        System.out.println("Tổng các phần tử có trong mảng là: " + integerArray.sumElement(intArray));

        System.out.println("Các phần tử là số chẵn trong mảng là: ");
        integerArray.evenElement(intArray);

        integerArray.ascSort(intArray);
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        integerArray.show(intArray);

        integerArray.desSort(intArray);
        System.out.println("Mảng sau khi sắp xếp giảm dần là: ");
        integerArray.show(intArray);


        //stringArray();
    }

    static void stringArray(){
        //Mảng string

        String strArray[] = new String [5];
        //hoặc String strArray[] = {"Java", "HTML", "PHP", "Python", "C++"};
        strArray[0] = "Java";
        strArray[1] = "HTML";
        strArray[2] = "PHP";
        strArray[3] = "Python";
        strArray[4] = "C++";

        System.out.println("Mảng xâu: ");
        for (int i = 0; i < strArray.length; i++){
            System.out.printf("Phần tử thứ %d: %s\n", i, strArray[i]);
        }

        System.out.println("Phần tử ở có index = 3 là: " +strArray[3]);
    }

    static void integerArray(){
        //Mảng số nguyên
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int size = sc.nextInt();
        int intArray[] = new int[size];  //Khởi tạo mảng intArray gồm các số nguyên, có kích thước bằng 5
//        intArray[0] = 4;  //Gán phần tử ở index  0 = 4
//        intArray[1] = 2;
//        intArray[2] = 9;
//        intArray[3] = 7;
//        intArray[4] = 6;
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Nhập phần tử ở vị trí "+i);
            intArray[i] = sc.nextInt();
        }

        System.out.println("Số phần tử trong mảng là: " +intArray.length);
        show(intArray);

        intArray[1] = 0;   //Sửa phần tử có index = 1
        System.out.println("Mảng sau khi sửa là: ");
        show(intArray);
    }

    static void show(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Phần tử thứ %d: %d\n", i, arr[i]);
        }
    }
}
