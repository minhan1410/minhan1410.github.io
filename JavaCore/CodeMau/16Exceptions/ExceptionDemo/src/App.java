import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TryCatchDemo.demoTryCatch();
        // TryCatchDemo.demoTryFinally();
        // TryCatchDemo.demoTryCatchFinally();
        //TryCatchDemo.nestedTrycatch();
        //TryCatchDemo.multiCatchBlock();

        ThrowDemo.validate();

        ThrowsDemo.getAge();

        //Custom exception
        try {
            int age = inputAge();
            System.out.println("Tuổi đã nhập: " + age);
        } catch (AgeCheckingException e) {
            System.out.println(e.getMessage());
        }
        //ArrayDemo.createArray();
    }


    static int inputAge() throws AgeCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingException("tuổi không được nhỏ hơn 0.");
        } catch (InputMismatchException e) {
            throw new AgeCheckingException("tuổi phải là một số.");
        }
        return age;
    }
}
