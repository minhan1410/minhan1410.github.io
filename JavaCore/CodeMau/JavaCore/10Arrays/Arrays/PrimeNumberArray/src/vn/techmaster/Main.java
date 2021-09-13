package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng: ");
        int size = scanner.nextInt();

        int array[] = new int[size];
        createArray(array);
        System.out.println("Mảng vừa nhập là: ");
        show(array);

        System.out.println("\nCác số nguyên tố có trong mảng là: ");
        PrimeNumber primeNumber = new PrimeNumber();
        int sum = 0;
        for (int i = 0; i < size; i++){
            if(primeNumber.isPrime(array[i])){
                System.out.print(array[i] + "\t");
                sum += array[i];
            }
        }
        System.out.println("\nTổng các số nguyên tố: " + sum);

        update(array);


    }

    static int[] createArray(int [] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.printf("Nhập phần tử thứ %d: ", i);
            array[i] = scanner.nextInt();
        }
        return array;

    }

    static void show(int [] array){
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + "\t");
//        }

        for (int j: array) {
            System.out.println(j);
        }
    }
    static void update(int [] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí cần sửa: ");
        int k = scanner.nextInt();
        if(k > 0 && k < array.length){
            System.out.println("Nhập giá trị mới: ");
            int x = scanner.nextInt();
            array[k] = x;
            System.out.println("Mảng sau khi sửa lại là: ");
            show(array);
        }else{
            System.out.println("Không có vị trí này");
        }
    }

}
