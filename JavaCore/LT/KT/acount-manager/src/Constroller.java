import java.util.List;
import java.util.Scanner;

public class Constroller {
    Scanner scanner = new Scanner(System.in);
    Repository repository = new Repository();
    List<User> users = repository.getData();
    User userOld;

    public void login() {
        // Thực hiện đăng nhập

        System.out.print("Nhap tai khoan: ");
        String username = scanner.next();

        boolean flag = true;

        for (User user : users) {
            if (user.getUsername().equals(username)) {
                // tìm thấy tk
                flag = false;
                userOld = user;

                System.out.print("Nhap mat khau: ");
                String password = Validate.validatePassword(scanner.next());

                if (user.getPassword().equals(password)) {
                    // Đăng nhập thành công

                    System.out.println("Chào mừng " + user.getUsername() + ", bạn có thể thực hiện các công việc sau:");

                    int chon;
                    while (true) {
                        Menu.login();
                        chon = scanner.nextInt();
                        if (chon == 0) {
                            System.out.println("--Bye--");
                            break;
                        } else if (chon == 1) {
                            changeUsername();
                        } else if (chon == 2) {
                            changeEmail();
                        } else if (chon == 3) {
                            changePassword();
                        } else if (chon == 4) {
                            showUser();
                            loginLogout();
                        } else {
                            System.out.println("Không có lựa chọn này");
                        }
                    }

                } else {
                    // Sai mk
                    Menu.wrongPassword();
                    int chon = scanner.nextInt();
                    if (chon == 1) {
                        login();
                    } else if (chon == 2) {
                        forgotPassword();
                    } else {
                        System.out.println("Không có lựa chọn này");
                    }
                }
            }
        }

        if (flag) {
            // k tìm thấy tk
            System.out.println("Kiểm tra lại username");
            loginLogout();
        }
    }

    public void changePassword() {
        // Thay đổi mật khẩu
        System.out.print("Nhap mat khau cu: ");
        String passwordOld = Validate.validatePassword(scanner.next());

        if (userOld.getPassword().equals(passwordOld)) {
            System.out.print("Nhap mat khau moi: ");
            String passwordNew = Validate.validatePassword(scanner.next());

            userOld.setPassword(passwordNew);
            System.out.print("Đổi mật khẩu thành công");
        } else {
            System.out.println("Mat khau cu khong dung");
        }
    }

    public void changeUsername() {
        // Thay đổi username
        System.out.print("Nhap tai khoan: ");
        String username = scanner.next();

        userOld.setUsername(username);
        System.out.println("Đổi tên thành công");
    }

    public void changeEmail() {
        // Thay đổi email
        System.out.print("Nhap email: ");
        String email = Validate.validateEmail(scanner.next());

        userOld.setEmail(email);
        System.out.print("Đổi email thành công");
    }

    public void forgotPassword() {
        // Quên mật khẩu
        System.out.print("Để cấp lại mật khẩu vui lòng nhập email của bn\nNhap email: ");
        String email = Validate.validateEmail(scanner.next());

        if (users.stream().anyMatch(i -> i.getEmail().equals(email))) {
            // changePassword();
            System.out.print("Nhap mat khau moi: ");
            String passwordNew = Validate.validatePassword(scanner.next());

            userOld.setPassword(passwordNew);
            System.out.print("Đổi mật khẩu thành công");
            loginLogout();
        } else {
            System.out.print("Email này chưa được đăng kí tài khoản.\nBạn muốn đăng ký tài khoản không(Y/N): ");
            String chon = scanner.next().charAt(0) + "";
            if (chon.toLowerCase().equals("Y".toLowerCase())) {
                createNewAccount();
            } else if (chon.toLowerCase().equals("N".toLowerCase())) {
                System.out.println("~_~");
            } else {
                System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void createNewAccount() {
        // Tạo tài khoản mới
        System.out.print("Nhap tai khoan: ");
        String username = scanner.next();

        if (!users.stream().anyMatch(i -> i.getUsername().equals(username))) {
            System.out.print("Nhap email: ");
            String email = Validate.validateEmail(scanner.next());

            if (!users.stream().anyMatch(i -> i.getEmail().equals(email))) {
                System.out.print("Nhap mat khau: ");
                String password = Validate.validatePassword(scanner.next());

                users.add(new User(username, email, password));
                System.out.println("Đã tạo tài khoản mới");
            } else {
                System.out.println("Email da ton tai");
            }
        } else {
            System.out.println("Ten tai khoan da ton tai");
        }

        loginLogout();
    }

    public void loginLogout() {
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
        case 1:
            // Đăng nhập
            login();
            break;
        case 2:
            // Đăng ký
            createNewAccount();
            break;
        default:
            break;
        }
    }

    public void showUser() {
        users.forEach(System.out::println);
    }

}
