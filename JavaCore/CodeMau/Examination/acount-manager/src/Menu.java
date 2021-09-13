public class Menu {

    public static void mainMenu(){
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginFail(){
        System.out.println("Sai password, bạn muốn thực hiện: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void loginSuccess(){
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    
}
