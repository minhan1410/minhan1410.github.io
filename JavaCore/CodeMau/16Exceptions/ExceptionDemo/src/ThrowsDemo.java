import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {
    //Tại đây không sử dụng try catch để xử lý mà ta sẽ đẩy trách nhiệm cho phương thức khác
    public static int inputAge() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();

        if(age <= 0) throw new IOException("Tuổi không được nhỏ hơn 0");
        return age;
    }

    public static void getAge() {
        try{
            int age = inputAge();
            System.out.println("Tuổi đã nhập: " + age);
        }catch(IOException e){
            System.out.println("Tuổi vừa nhập không hợp lệ");
        }
    }

    
    
}
