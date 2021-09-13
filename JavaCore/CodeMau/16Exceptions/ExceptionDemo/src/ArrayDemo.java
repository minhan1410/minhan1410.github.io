import java.util.InputMismatchException;
import java.util.Scanner;


/* Giả sử ta có một mảng với số phần tử nhập vào từ bàn phím
Công việc của người dùng là nhập số phần tử
Tuy nhiên người dùng có thể nhập sai ví dụ:
Nhập số nhỏ hơn 0, nhập chữ
Như vậy sẽ sảy ra ngoại lệ 
Cần xử lý ngoại lệ đó như sau*/ 
public class ArrayDemo {
    public static void createArray(){
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        //Sử dụng vòng lặp while để kiểm tra với điều kiện size <= 0. 
        //Nếu người dùng nhập kích thước nhỏ hơn hoặc bằng 0 sẽ phải nhập lại
        while(size <= 0){
            boolean check = false;
            while(!check){ //Vòng lặp while này để lặp khi nhảy vào khối catch
                try {
                    System.out.println("Nhập số lượng phần tử trong mảng: ");
                    size = Integer.parseInt(scanner.nextLine());
                    check = true;
                } catch (NumberFormatException e) {  // Ngoại lệ này sảy ra khi tiến hành ép sai kiểu
                    System.out.println("Nhập sai rồi, vui lòng nhập lại!");
                }
            }
            
            
        }
        


    }
    
}
