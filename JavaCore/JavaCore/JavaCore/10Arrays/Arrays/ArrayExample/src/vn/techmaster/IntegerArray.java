package vn.techmaster;

import java.util.Scanner;

public class IntegerArray {
    Scanner sc = new Scanner(System.in);

    //Nhập phần tử cho mảng
    public void createArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print("Nhập phần tử ở vị trí "+i+": ");
            arr[i] = sc.nextInt();
        }
    }

    //in mảng
    public void show(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    //Tính tổng các phần tử có trong mảng

    public int sumElement(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; //sum = sum + arr[i]
        }
        return sum;
    }

    //in ra màn hình các số chắn và tính tổng các số đó

    public void evenElement(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + "\t");
                sum += arr[i]; //sum = sum + arr[i]
            }
        }
        System.out.println("\nTổng các phần tử là số chẵn là: "+sum);
    }

    //Sắp xếp mảng theo thứ tự tăng dần
    public void ascSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    //Sắp xếp mảng theo thứ tự giảm dần
    public void desSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
