import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhập chiều cao (m): ");
        double height = input();

        System.out.println("Nhập cân nặng (kg): "); 
        double weight = input();

        double bmi = weight / (height*height);
        System.out.printf("Chỉ số BMI của bạn là: %.2f", bmi );
    }

    public static double input() {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        double number = 0;
        while (!check) {
            try{
                number = Double.parseDouble(scanner.nextLine());
                if(number <= 0) throw new ArithmeticException();
                check = true;
            }catch(ArithmeticException e){
                System.out.println("Nhập lỗi, vui lòng nhập lại!");
            }catch(NumberFormatException e){
                System.out.println("Nhập lỗi, vui lòng nhập lại");
            }
        }

        return number;
        
        
    }
}
