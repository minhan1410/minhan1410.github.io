import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can them: ");
        int num = sc.nextInt();

        ArrayList<ShoolBook> listBooks = new ArrayList<>();
        for(int i = 0; i < num; i++){
            ShoolBook shoolBook = new ShoolBook();
            shoolBook.input();

            listBooks.add(shoolBook);
    
        }
        
        System.out.println("Danh sach : ");
        for (ShoolBook shoolBook : listBooks) {
            System.out.println(shoolBook);
        }
    }
}
