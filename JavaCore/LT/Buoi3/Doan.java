import java.util.Scanner;

public class Doan {
    static Scanner scanner = new Scanner(System.in);

    public static void DoanEmail() {
        String email;
        while (true) {
            System.out.println("\tCheck email(Nhan q de thoat)");
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (email.equals("q")) {
                break;
            }

            if (email.length() > "@gmail.com".length() && email.contains("@gmail.com")
                    || email.contains("@email.com")) {
                System.out.println(email + " - chinh xac");
            } else {
                System.out.println(email + " - email sai");
            }
        }
    }

    public static void TuVanSucKhoe() {
        Math math = new Math(); // Lấy từ bài trc
        while (true) {
            System.out.println("\tTu van suc khoe(chieu cao=q or can nang=q thi thoat)");
            System.out.print("Nhap chieu cao: ");
            String cCao = scanner.next();
            System.out.print("Nhap can nang: ");
            String cNang = scanner.next();
            if (cCao.equals("q") || cNang.equals("q")) {
                break;
            }
            System.out.println(math.bmiRating(Float.parseFloat(cCao), Float.parseFloat(cNang)));
        }

    }
}
