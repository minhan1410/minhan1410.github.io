import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu;
        int chon;
        while (true) {
            System.out.println("\n\t\tMenu\n1) Kiem tra Email\n2) Tu van suc khoe\n3) In cac so nguyen to");
            System.out.print("Chon: ");
            menu = scanner.next();
            if (menu.equals("q")) {
                break;
            } else {
                chon = Integer.parseInt(menu);
                if (chon >= 1 || chon <= 3) {
                    if (chon == 1) {
                        Doan.DoanEmail();
                    } else if (chon == 2) {
                        Doan.TuVanSucKhoe();
                    } else {
                        NewMath math = new NewMath(); // Lấy từ bài trc
                        System.out.print("\tIn SNT\nBn muon in bn so ng to: ");
                        int n = scanner.nextInt();
                        System.out.println(math.ChuoiSNT(n));
                    }
                }
            }
        }

        // while khác vòng lặp for ở điểm nào?
        // while không pt trc số lần lặp
        // for pt trc số lần lặp
        // continue để làm gì?
        // chạy tiếp sang lần lặp tiếp theo bỏ wa các câu lệnh dưới nó
        // break để làm gì?
        // thoát ra khỏi vòng lặp
    }
}
