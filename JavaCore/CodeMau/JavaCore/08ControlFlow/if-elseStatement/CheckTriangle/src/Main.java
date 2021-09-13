import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        int sideA = scanner.nextInt();

        System.out.print("Nhập cạnh b: ");
        int sideB = scanner.nextInt();

        System.out.print("Nhập cạnh c: ");
        int sideC = scanner.nextInt();

        if(sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA){
            System.out.println("ba cạnh trên là ba cạnh của tam giác");
        }else{
            System.out.println("Ba cạnh trên không phải ba cạnh của tam giác");
        }

        scanner.close();

    }
}
