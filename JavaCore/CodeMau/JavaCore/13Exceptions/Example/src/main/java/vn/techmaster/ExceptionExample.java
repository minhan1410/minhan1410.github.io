package vn.techmaster;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {

    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public int setAge() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int age = scanner.nextInt();
        //KHông xử lý exception tại đây
        if (age <= 0) throw new IOException("tuổi không được nhỏ hơn hoặc bằng 0.");
        return age;
    }
}
