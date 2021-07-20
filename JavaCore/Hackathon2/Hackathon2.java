import java.util.Scanner;

public class Hackathon2 {
    Scanner scanner = new Scanner(System.in);

    private boolean CheckSnt(int number) {
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void Bai1() {
        String chon;
        String str;
        try {
            do {
                System.out.print("Nhập số muốn kt: ");
                str = scanner.next();
                int number = Integer.parseInt(str);
                System.out.println(CheckSnt(number));
                System.out.print("Bạn có muốn chạy tiếp không (-)thoát nhập 'x' or 'q')\nChọn: ");
                chon = scanner.next();
            } while (!(chon.equals("x") || chon.equals("q")));
        } catch (NumberFormatException e) {
            System.err.println("Bạn không nhập vào số vui lòng nhập lại");
        }
    }

    public void Bai2() {
        EmployeeManager em = new EmployeeManager();
        while (true) {
            System.out.print("1) Show\n2) show nam or nu\n3 add\n4 filter\n0 thoat\n chon: ");
            int chon = scanner.nextInt();
            if (chon == 1) {
                em.Show();
            } else if (chon == 2) {
                System.out.println("1. Nam\n2. Nu");
                int chon1 = scanner.nextInt();
                if (chon1 == 1) {
                    em.Show(GioiTinh.M);
                } else {
                    em.Show(GioiTinh.F);
                }
            } else if (chon == 4) {
                System.out.print("Nhap id: ");
                Long id = scanner.nextLong();
                em.FilterId(id);
            } else if (chon == 3) {
                scanner.nextLine();
                Employee v = new Employee();
                System.out.print("Nhap name: ");
                String name = scanner.nextLine();
                v.setName(name);
                System.out.println("Ngày sinh: ");
                String date = scanner.next();
                v.setBirthday(date);
                System.out.println("Giới tính: \n");
                System.out.print("1) Nam\n 2) Nu\n Chon: ");
                int gender = scanner.nextInt();
                if (gender == 1) {
                    v.setGioiTinh(GioiTinh.M);
                } else {
                    v.setGioiTinh(GioiTinh.F);
                }
                System.out.println("Quê quán: ");
                String address = scanner.next();
                v.setAddress(address);
                System.out.println("Sdt: ");
                String sdt = scanner.next();
                v.setPhoneNumber(sdt);
                System.out.println("Email: ");
                String email = scanner.next();
                v.setPhoneNumber(email);

                em.Add(v);
            } else{
                break;
            }
        }
    }
}
