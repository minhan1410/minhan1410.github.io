import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hackathon1 {
    public boolean isTriangle(double a, double b, double c) {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        }
        return false;
    }

    public void Bai1(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b)
                System.out.println("==> Day la tam giac vuong");
            else if (a == b && b == c)
                System.out.println("==> Day la tam giac deu");
            else if (a == b || a == c || b == c)
                System.out.println("==> Day la tam giac can");
            else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
                System.out.println("==> Day la tam giac tu");
            else
                System.out.println("==> Day la tam giac nhon");
        } else {
            System.out.println("==> Khong phai tam giac");
        }
    }

    public int Bai2(List<String> list) {
        int lengthList = list.size();
        List<String> tranDau = new ArrayList<String>();

        for (int i = 0; i < lengthList; i++) {
            for (int j = i + 1; j < lengthList; j++) {
                tranDau.add(list.get(i) + " - " + list.get(j));
            }
        }

        int lengthTran = tranDau.size();
        List<String> cap = new ArrayList<String>();

        for (int i = 0; i < lengthTran; i++) {
            String[] strA = tranDau.get(i).split(" - ");
            for (int j = i + 1; j < lengthTran; j++) {
                String[] strB = tranDau.get(j).split(" - ");
                if (strA[0].equals(strB[0]) || strA[1].equals(strB[1]) || strA[1].equals(strB[0])) {
                    continue;
                } else {
                    cap.add("(" + tranDau.get(i) + ")  --VS--  (" + tranDau.get(j) + ")");
                }
            }
        }
        cap.forEach(i -> System.out.printf("%s\n", i));

        return cap.size();
    }

    public String camelCase(String st) {
        st = st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp = st.split(" ");

        st = "";
        for (int i = 0; i < temp.length; i++) {
            st += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                st += " ";
        }
        return st;
    }

    public void Bai3(List<String> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            list.set(i, camelCase(list.get(i)));
        }

        list.forEach(i -> System.out.println(i));
    }

    public void Bai4() {
        Scanner scanner = new Scanner(System.in);
        String sdt, mk;
        int choose;

        while (true) {
            System.out.println("1: Dang ki");
            System.out.println("2: Dang nhap");
            System.out.println("0 : Thoát");

            System.out.print("Chon: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Dang ki tai khoan:");
                    System.out.print("Nhap so dt: ");
                    sdt = scanner.next();
                    if (Validation.validateMobile(sdt)) {
                        System.out.print("Mat khau: ");
                        mk = scanner.next();
                        if (User.DangKi(sdt, mk)) {
                            System.out.println("dang ki thanh cong");
                        } else {
                            System.out.println("dang ki that bai");
                        }
                    } else {
                        System.out.println("So dt k hop le");
                    }
                    break;
                case 2:
                    System.out.println("Dang nhap tai khoan:");
                    System.out.print("Nhap so dt: ");
                    sdt = scanner.next();
                    System.out.print("Mat khau: ");
                    mk = scanner.next();
                    if (User.DangNhap(sdt, mk)) {
                        System.out.println("Dang nhap thanh cong:");
                        System.out.println("Tao tai khoan ngan hang moi:");
                        System.out.print("Nhap so tk cua ban: ");
                        String stk = scanner.next();
                        if (Validation.validateSTK(stk)) {
                            System.out.print("Nhap so du trong tai khoan: ");
                            double sodu = scanner.nextDouble();
                            InternetBanking internetBanking = new VPBank(stk, sodu);

                            while (true) {
                                menu();
                                System.out.print("Chon: ");
                                choose = scanner.nextInt();
                                switch (choose) {
                                    case 1:
                                        System.out.println("Số dư: ");
                                        System.out.println(internetBanking.InSoDu());
                                        break;
                                    case 2:
                                        internetBanking.ChuyenTien();
                                        break;
                                    case 3:
                                        System.out.println("Lịch sử giao dịch: ");
                                        internetBanking.LichSu();
                                        break;
                                    case 0:
                                        System.exit(0);
                                        break;
                                    default:
                                        System.out.println("Không có lựa chọn này");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("So tai khoan k hop le");
                        }

                    } else {
                        System.out.println("Dang nhap that bai:");
                    }
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }

    }

    public void menu() {
        System.out.println("Lựa chọn của bạn: ");
        System.out.println("1 : Xem số dư tài khoản");
        System.out.println("2 : Chuyển khoản");
        System.out.println("3 : Xem lịch sử giao dịch");

        System.out.println("0 : Thoát");
    }
}
