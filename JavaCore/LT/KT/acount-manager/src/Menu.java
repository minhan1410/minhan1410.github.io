public class Menu {

    public static void mainMenu() {
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.print("Lựa chọn của bạn là: ");
    }

    public static void wrongPassword() {
        System.out.println("Sai password");
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.print("Lựa chọn của bạn là: ");
    }

    public static void login(){
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Thay đổi username\n2 - Thay đổi email\n3 - Thay đổi mật khẩu\n4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng xuất)\n0 - Thoát chương trình");
        System.out.print("Lựa chọn của bạn là: ");
    }
}
