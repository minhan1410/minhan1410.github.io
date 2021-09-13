package vn.techmaster;

import java.util.Scanner;
import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {
//        String name = inputName();
//        System.out.println("Tên vừa nhập là: " + name);

        String id = inputId();
        System.out.println("Mã nhân viên vừa nhập là: " +id);
    }

    public static String inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();

        while(containsDigit(name)){
            System.out.println("Vui long nhập lại tên: ");
            name = sc.nextLine();
        }
        return standardized(name);
    }

    public static boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }

        return containsDigit;
    }

    public static String standardized(String name){
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        String [] array = name.split(" ");
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < array.length; i++){
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(' ');
        }
        return output.toString().trim();
    }

    public static String inputId(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        String id = sc.nextLine();

        if (id.matches("NV\\d{7}")) {//Kiểm tra bằng regex
            return id;
        }
        else {
            return "Id sai";
        }
    }
}
