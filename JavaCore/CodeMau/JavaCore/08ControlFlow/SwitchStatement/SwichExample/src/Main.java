public class Main {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2: //Khi switch chạy xuống case 2, nó thỏa mãn giá trị  của case bằng giá trị của number
                System.out.println("Two"); //thực thi khối lệnh trong case 2
                break;  //Gặp lệnh break, lập tức thoát khỏi lệnh switch
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Không có số này");
                break;

        }

    }
}
