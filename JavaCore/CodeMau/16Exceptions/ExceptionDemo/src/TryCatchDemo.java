import java.util.Scanner;

public class TryCatchDemo {
    public static void demoTryCatch() {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Không thể chia 1 số cho 0. " + e.getMessage());
        }
    }

    public static void demoTryFinally() {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } finally {
            System.out.println("Khối lệnh này luôn được thực thi!!!");
        }
    }

    public static void demoTryCatchFinally() {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Không thể chia 1 số cho 0. " + e.getMessage());
        } finally {
            System.out.println("Khối lệnh này luôn được thực thi!!!");
        }
    }

    //try catch lồng  nhau: Khi có khối try-catch lồng trong một khối try khác
    //SỬ dụng khi tình huống có thể phát sinh trong đó một phần của khối có thể gây ra lỗi 
    //và bản thân toàn bộ khối có thể gây ra lỗi khác.
    //Trong trường hợp này, các exception cần được xử lý lồng nhau 
    public static void nestedTrycatch() {
        try {
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");

        } catch (Exception e) {
            System.out.println("handeled");
        }

        System.out.println("normal flow..");

    }

    //Sử dụng nhiều khối catch
    public static void multiCatchBlock() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;

        while(!check) {
            try {
                System.out.println("Nhập tử số: ");
                int numerator = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập mẫu số: ");
                int denominator = Integer.parseInt(scanner.nextLine());
    
                int result = numerator/denominator;
                System.out.println(result);
                check = true;
    
            }catch (ArithmeticException ex1){
                System.out.println("Không thể chia một số cho 0");
    
            }catch (NumberFormatException ex2){
                System.out.println("Vui lòng nhập số");
            }
        }
        
    }

}
