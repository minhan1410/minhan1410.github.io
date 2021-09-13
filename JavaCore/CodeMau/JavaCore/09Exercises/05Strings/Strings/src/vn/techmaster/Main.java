package vn.techmaster;


public class Main {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void main(String[] args) {
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println(str);

        countChars(str);
        System.out.println("Số từ có trong chuỗi là: "+countWords(str));

    }


    //Phương thức để đếm và in ra index của ký tự o
    static void countChars(String str){
        int count = 0;  //Khởi tạo biến count để đếm số lần ký tự 'o' xuất hiện
        for(int i = 0; i < str.length(); i++) {  //Tạo vòng lặp để duyệt các ký tự
            if(str.charAt(i) == 'o'){   //kiểm tra ký tự ở vị trí i có là 'o'
                System.out.println("Index của chữ  o: " + i);  //in ra màn hình index của ký tự 'o'
                count++;  //tăng biến đếm
            }
        }
        System.out.println("Số lần ký tự o xuất hiện là: "+count);
    }

    //Phương thức để đếm số từ trong chuỗi
    static int countWords(String str){
        if (str.isEmpty()){   //Kiểm tra xem chuỗi có rỗng hay không
            return -1;
        }
        int count = 0;  //KHởi tạo biến count để đếm số từ
        boolean notCounted = true;  //KHởi tạo biến notCounted có giá trị true
        for (int i = 0; i <str.length(); i++){    //Tạo vòng lặp để duyệt các ký tự

            if (str.charAt(i) != SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE) {
                //Nếu các ký tự không phải là khoảng trắng, tab hay xuống dòng
                if (notCounted){  //nếu notCounted = true
                    count++;      //Tăng đếm
                    notCounted = false;   //Gán notCounted = false
                }
            }else{
                notCounted = true;   //Gán notCounted = true
            }
        }
        return count;  //Trả về kết quả
    }
}
