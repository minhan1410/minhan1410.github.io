import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String LocChuoi(String str) {
        ArrayList<String> dsDen = new ArrayList<String>();
        dsDen.add("fuck");
        dsDen.add("sex");
        dsDen.add("rape");
        dsDen.add("shit");
        dsDen.add("bitch");
        dsDen.add("damn");

        String thayThe;
        for (int i = 0; i < dsDen.size(); i++) {
            if (str.contains(dsDen.get(i))) {
                thayThe = dsDen.get(i);
                thayThe = thayThe.replace(dsDen.get(i).charAt(1), '*');
                str = str.replace(dsDen.get(i), thayThe);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = scanner.next();
        System.out.println("isPalindrome= " + isPalindrome(str));
        scanner.nextLine();

        System.out.print("Nhap chuoi: ");
        str = scanner.nextLine();
        System.out.println(LocChuoi(str));
    }
}
