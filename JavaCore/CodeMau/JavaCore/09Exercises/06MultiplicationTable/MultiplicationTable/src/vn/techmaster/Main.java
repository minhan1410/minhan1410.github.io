package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){  //chạy i từ 1 đến 9
            for (int j = 1; j < 10; j++){  //Chạy j từ 1 đến 9
                System.out.printf("%d * %d = %d\n", i, j, (i*j));
            }
            System.out.println();
        }
    }
}
