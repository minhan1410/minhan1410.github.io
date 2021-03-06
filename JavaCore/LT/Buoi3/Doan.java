import java.util.Scanner;
import java.util.regex.Pattern;

public class Doan {
    static Scanner scanner = new Scanner(System.in);

    public static void DoanEmail() {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        String email;
        while (true) {
            System.out.println("\tCheck email(Nhan q de thoat)");
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            if (email.equals("q")) {
                break;
            }

            if (Pattern.matches(EMAIL_PATTERN, email)) {
                System.out.println(email + " - chinh xac");
            } else {
                System.out.println(email + " - email sai");
            }
        }
    }

    public static void TuVanSucKhoe() {
        NewMath math = new NewMath(); // Lấy từ bài trc
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
