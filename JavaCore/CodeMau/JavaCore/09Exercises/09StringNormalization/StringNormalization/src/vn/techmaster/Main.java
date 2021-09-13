package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        System.out.println("Chuỗi ban đầu: \n"+str);

        str = standardize(str);

        System.out.println("Chuỗi sau khi chuẩn hóa là:\n"+str);


    }

    static String replaceSpace(String str){
        str = str.trim();  //Loại bỏ khoảng tắng ở đầu và cuối chuỗi

        str = str.replaceAll("\\s+" , " ");
        return str;
    }

    static String standardize(String str){
        str = replaceSpace(str);

        String temp[] = str.split(" "); //cắt chuỗi
        str = "";
        for(int i = 0; i < temp.length; i++){
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
}
