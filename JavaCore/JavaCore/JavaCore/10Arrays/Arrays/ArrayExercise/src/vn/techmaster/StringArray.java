package vn.techmaster;

import java.util.Scanner;

public class StringArray {

    public void createArray(String[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.printf("Nhập phần tử thứ %d: ", i);
            array[i] = scanner.nextLine();
        }
    }

    public void show(String [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public int countString(String [] array){
        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i].toLowerCase().contains("java")){
                count++;
            }
        }
        return count;
    }

    public void indexString(String [] array, String str){
        System.out.println("Vị trí xuất hiện chuỗi " + str +" là: ");
        for (int i = 0; i < array.length; i++){
            if (array[i].toLowerCase().contains(str.toLowerCase())){
                System.out.print(i + "\t");
            }
        }
    }
}
