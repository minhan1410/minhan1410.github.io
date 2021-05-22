import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class DoanGioiTinh {
    public void guessName() {
        ArrayList<String> manNames = new ArrayList<>();

        manNames.add("Cường");
        manNames.add("Dũng");
        manNames.add("Thắng");
        manNames.add("Kiên");
        manNames.add("Long");
        manNames.add("Trung");
        manNames.add("Thành");
        manNames.add("Quân");

        List<String> womanNames = List.of("Hoa", " Lan", " Hương", " Hằng", " Thuỷ", " Dung");
        List<String> neutralNames = List.of("Bình", " Thanh", " Linh");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
            String name = input.nextLine();
            if (name.equals("q")) {
                break;
            } else {
                // Kiểm tra nếu tên nằm trong danh sách tên của Nam
                for (String s : manNames) {
                    if (s.equals(name)) {
                        System.out.println("Nam giới");
                        break;
                    }
                }
                // Kiểm tra nếu tên nằm trong danh sách tên của Nữ
                for (String s : womanNames) {
                    if (s.equals(name)) {
                        System.out.println("Nữ giới");
                        break;
                    }
                }

                // Kiểm tra nếu tên nằm trong danh sách tên không rõ Nam hay Nữ
                for (String s : neutralNames) {
                    if (s.equals(name)) {
                        System.out.println("Giới tính của bạn là gì?");
                        String gender = input.nextLine();
                        System.out.println(name + " có giới tính là " + gender);
                        break;
                    }
                }
            }
        }
        input.close();
    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        int so = (int) (Math.random() * 100);
        int duDoan;
        while (true) {
            System.out.print("Nhap vao 1 so: ");
            duDoan = scanner.nextInt();
            if (duDoan > so) {
                System.out.println("So nhap vao lon");
            } else if (duDoan == so) {
                System.out.println("Wa gioi");
                so = (int) (Math.random() * 100);
            } else {
                System.out.println("So nhap vao nho");
            }
        }
    }
}
