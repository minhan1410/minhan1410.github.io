package vn.techmaster;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputPassworld {
    public void passwordvalidation(){
        Scanner scanner = new Scanner(System.in);

        String password;
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$.!%*?&])[A-Za-z\\d@$.!%*?&]{10,}$";

        boolean check = false;
        while (!check){
            System.out.println("Nhập mật khẩu: ");
            password = scanner.nextLine();
            if (password.length() < 10){
                System.out.println("Mật khẩu yếu");
                check = false;
            }
            if (Pattern.matches(pattern, password)){
                System.out.println("Nhập mật khẩu thành công");
                check = true;
            }else{
                System.out.println("Mật khẩu chưa đủ mạnh");
                check = false;
            }
        }



    }
}
