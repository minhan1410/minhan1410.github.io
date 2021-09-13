package vn.techmaster;

public class Shape {
    public void drawTriangle(int height){
        for(int i = 1; i <= height; i++) {
            for(int j = 1; j <= height-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public void drawRectangle(int width, int length){
        for(int i = 1; i <= width; i++){
            for(int j = 1; j <= length; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }

    }
}
