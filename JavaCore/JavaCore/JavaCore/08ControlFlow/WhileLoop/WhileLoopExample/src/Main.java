public class Main {
    public static void main(String[] args) {
        loopString();
        System.out.println("các số từ 0 -> 50: ");
        loopNumber();

        System.out.println("\nCác số từ 50 -> 0: ");
        loopNumberReversed();

        endlessLoop();
    }

    //In chuỗi Hello Java 10 lần
    static void loopString(){
        int i =0;
        while(i<10){
            System.out.println("Hello Java");
            i+=1;
        }
    }

    //In các số từ 0 -> 50

    static void loopNumber(){
        int i = 0;
        while(i <= 50){
            System.out.print(i + "\t");
            i++;
        }
    }

    //In các số từ 50 -> 0
    static void loopNumberReversed(){
        int i = 50;
        while(i >= 0){
            System.out.print(i + "\t");
            i--;
        }
    }


    //Vòng lặp vô tận
    static void endlessLoop(){
        boolean check = true;
        while(check){
            System.out.println("Hello!!!");
            check = false;
        }
    }
}
