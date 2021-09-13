public class Main {
    public static void main(String[] args) {
        loopAString();

        System.out.println("Các số từ 0 -> 50: ");
        loopNumber();

        System.out.println("\nCác số từ 50 -> 0: ");
        loopNumberReversed();

        System.out.println("\nCác số chẵn từ 0 -> 50 :");
        evenNumber();
    }

    //Lặp chuỗi "Hello Java" 10 lần
    static void loopAString(){
        for (int i = 0; i < 10; i++){ //Khởi tạo biến i = 0, bước này chỉ thực hiện 1 lần, điều kiện lặp là i < 10
            System.out.println("Hello Java");
        }
    }

    //In ra các số từ 0 -> 50
    static void loopNumber(){
        for (int i = 0; i <= 50; i++){
            System.out.print(i+"\t");
        }
    }

    //In các số từ 50 -> 0
    static void loopNumberReversed(){
        for (int i = 50; i >= 0; i--){ //Khởi tạo biến i = 50, điều kiện lặp là i >= 0, sau mỗi lần lặp giảm i 1 đơn vị
            System.out.print(i +"\t");
        }
    }

    //In các số chẵn từ 0 -> 50
    static void evenNumber(){
        int sum = 0;
        for (int i = 0; i <= 50; i++){ //Sử dụng vòng lặp để lặp từ 0 -> 50
            if (i % 2 == 0){ //kiểm tra điều kiện i chia hết cho 2
                System.out.print(i + "\t"); //Điều kiện đúng in i ra màn hình
                sum = sum + i;
            }
        }
        System.out.println("\nTong cac số chẵn : "+sum);
    }
}
