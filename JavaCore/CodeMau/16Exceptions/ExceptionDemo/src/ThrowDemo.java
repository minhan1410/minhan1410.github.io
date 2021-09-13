import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    // Ví dụ: Kiểm tra tuổi, nếu tuổi nhỏ hơn 18, ném ra ngoại lệ thông báo chưa đủ
    // tuồi bầu cử
    public static void validate() {
        try {
            int age = inputAge();
            if (age < 18)
                throw new ArithmeticException("Bạn chưa đủ tuổi để tham gia bầu cử");
            else
                System.out.println("Bạn đã đủ tuổi bầu cử");

        } catch (InputMismatchException e) {
            System.out.println("Tuổi nhập vào chưa hợp lệ");
        }

    }

    public static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        return age;
    }
}
