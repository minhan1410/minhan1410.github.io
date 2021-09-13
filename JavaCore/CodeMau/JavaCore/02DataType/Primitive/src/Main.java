public class Main {
    public static void main(String[] args) {
        //Kiểu số nguyên
        byte byteNumber = 127;  //Miền giá trị từ -128 -> 127
        short shortNumber = 1000; //Miền giá trị từ -32768  -> 32767
        int intNumber = 20; //Miền giá trị từ -2^31  -> 2^31 - 1
        long longNumber = 2000000000L; //Miền giá trị -2^63 ->  2^63 - 1

        //Kiểu số thực (Kiểu số chấm động)
        float floatNumber = 5.7f; //Kiểu float phải thêm vĩ ngữ f đằng sau
        double doubleNumber = 5.7d; //Kiểu double có thể có vĩ ngữ d đằng sau hoặc không
        double doubleNum = 35.5;   //Vì double là kiểu mặc định cho kiểu số thực nên có thể viết gọn hơn

        //Kiểu ký tự (char)
        char a = 'a'; //Kiểu ký tự thông thường được đặt trong dấu nháy đơn
        char ch = '5';
        char chA = 65; //c == A
        //char d = '65';  Lỗi, chỉ biểu diễn 1 ký tự

        //Kiểu luận lý (boolean)
        boolean isTrue = true;
        boolean isFalse = false;
    }
}
