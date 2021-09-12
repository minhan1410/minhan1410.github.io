import java.util.HashSet;
import java.util.Set;

public class Id1346_Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] { 10, 2, 5, 3}));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : arr) {
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
