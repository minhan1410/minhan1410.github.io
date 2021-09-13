public class Main {
    public static void main(String[] args) {
        loopString();

//        System.out.println("các số từ 0 -> 50: ");
//        loopNumber();
//
//        System.out.println("\nCác số từ 50 -> 0: ");
//        loopNumberReversed();
//
//        System.out.println("\nĐIều kiện lặp sai: ");
//        wrongCondition(); //Vẫn được thực hiện câu lệnh 1 lần
    }

    //In chuỗi Hello Java 10 lần
    static void loopString(){
        int i =0;
        do {
            System.out.println("Hello Java");
            i+=1;
        }while(i < 10);
    }

    //In các số từ 0 -> 50
    static void loopNumber(){
        int i = 0;
        do {
            System.out.print(i + "\t");
            i++;
        }while(i <= 50);
    }

    //In các số từ 50 -> 0
    static void loopNumberReversed(){
        int i = 50;
        do {
            System.out.print(i + "\t");
            i--;
        }while(i >= 0);
    }

    //Khi điều kiện lặp sai
    static void wrongCondition(){
        int i = 3;
        do {
            System.out.println("KHối lệnh này vẫn được thực hiện 1 lần");
        }while(i == 5);
    }

}
