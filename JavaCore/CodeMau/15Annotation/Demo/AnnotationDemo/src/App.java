import java.util.Date;

public class App {
    
    public static void main(String[] args) throws Exception {
        Student student = new Student("Hoàng", 30, "Hà Nội");
        student.display();

        
        student.show(); //Vì trước phương thức show có đặt annotation @Deprecated nên xuất hiện cảnh báo
        
        

        
    }
    //hãy thử thêm annotation @SuppressWarnings({"deprecation"})
    public void getDate(){
        Date date = new Date();
        date.setMonth(7); //Phương thức setMonth trong class Date xuất hiện từ SDK  1.1
        //Hãy xem chi tiết phương thức này trong class bạn sẽ thấy có xuất hiện @Deprecated
        //@Deprecated Đánh dấu rằng phương thức này không nên sử dụng nữa và nó có thể sẽ bị gỡ bỏ trong tương lai
    }
}
