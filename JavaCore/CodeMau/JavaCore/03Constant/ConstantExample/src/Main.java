public class Main {
    public static void main(String[] args) {
        final double PI = 3.14;
        final int MAX = 100;
        final double GRAVITATIONAL_ACCELERATION = 9.8;
        final String MONDAY = "Monday";

        System.out.println("Pi = "+PI);
        System.out.println("Max = "+MAX);
        System.out.println("Gia tốc trọng trường = "+GRAVITATIONAL_ACCELERATION);
        System.out.println("Thứ hai: "+MONDAY);

        //Thử thay đổi giá trị của PI
        //PI = 3.15;
        //Báo lỗi
        //Exception in thread "main" java.lang.Error: Unresolved compilation problem:
        //The final local variable PI cannot be assigned. It must be blank and not using a compound assignment

        //Sử dụng các hằng ký tự đặc biệt
        //Hãy chạy thử những dòng code này
        System.out.println("Học lập trình Java");
        System.out.println("Học lập \t trình Java");
        System.out.println("Học lập \n trình Java");
        System.out.println("Học lập \r trình Java");
        System.out.println("Học lập trình \"Java\""); //Nếu không có \ thì có in được dấu " không?
        System.out.println("Học lập \f trình Java");
    }
}
