public class Main {
    public static void main(String[] args) {
        //Chuyển đổi kiểu ngầm định

        int intNumber = 5;
        long longNumber = intNumber; //Chuyển đổi biến intNumber có kiểu int thành biến longNumber có kiểu long
        double doubleNumber = intNumber;  //Chuyển đổi biến intNumber có kiểu int thành biến doubleNumber có kiểu double
        System.out.println("Kiểu int: " +intNumber);
        System.out.println("Kiểu long: " +longNumber);
        System.out.println("Kiểu double: " +doubleNumber);

        //Chuyển đổi kiểu tường minh

        double doubleNum = 5.6;
        long longNum = (long) doubleNum;
        int intNum = (int) doubleNum; //Chuyển đổi biến i có kiểu dữ liệu là double sang j có kiểu int
        System.out.println("Kiểu double: " +doubleNum);
        System.out.println("Kiểu long: " +longNum);
        System.out.println("Kiểu int: " +intNum);
    }
}
