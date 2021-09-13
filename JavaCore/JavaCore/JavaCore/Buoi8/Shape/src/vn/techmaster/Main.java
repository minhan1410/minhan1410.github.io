package vn.techmaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        //Vẽ hình tam giác
        int height;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("height = ");
            height = sc.nextInt();
        }while(height <= 0);
        shape.drawTriangle(height);

        //Vẽ hình chữ nhật
        int length, width;
        do {
            System.out.print("length= ");
            length = sc.nextInt();
        }while(length <= 0);

        do {
            System.out.print("width = ");
            width = sc.nextInt();
        }while(width <= 0);
        shape.drawRectangle(width,length);

    }
}
