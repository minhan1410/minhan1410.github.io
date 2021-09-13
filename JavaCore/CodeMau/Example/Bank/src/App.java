import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ValidateAcount validate = new ValidateAcount();
        Controller controller = new Controller();

        boolean isCheck = false;
        while (!isCheck) {
            System.out.println("Nhập số điện thoại: ");
            String mobile = sc.nextLine();

            System.out.println("Nhập mật khẩu: ");
            String passworld = sc.nextLine();

            isCheck = validate.checkAcount(mobile, passworld);
        }

        while (true) {
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Số dư: ");
                    long balance = controller.getBalanceNumber();
                    System.out.println(Controller.formatMoney(balance));
                    break;
                case 2:
                    controller.actionTransfer();
                    break;
                case 3:
                    System.out.println("Lịch sử giao dịch: ");
                    controller.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;

            }
        }
    
    }

    public static void menu() {
        System.out.println("Lựa chọn của bạn: ");
        System.out.println("1 : Xem số dư tài khoản");
        System.out.println("2 : Chuyển khoản");
        System.out.println("3 : Xem lịch sử giao dịch");
        System.out.println("0 : Thoát");
    }

}
