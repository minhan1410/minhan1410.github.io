import java.util.ArrayList;
import java.util.List;

public class Id118_Pascals_Triangle {
    public static List<List<Integer>> generateCopy(int numRows) {
//        0 ms	35.5 MB
        List<List<Integer>> pascal = new ArrayList<>();

        for(int row = 0; row < numRows; row++) {
            pascal.add(new ArrayList<Integer>());
            for(int col = 0; col <= row; col++) {
                if(col == 0 || col == row) pascal.get(row).add(1);
                else pascal.get(row).add(pascal.get(row-1).get(col-1) + pascal.get(row-1).get(col));
            }
        }

        return pascal;
    }
    public static List<List<Integer>> generate(int numRows) {
//        0 ms	36.8 MB
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            List<Integer> odd = new ArrayList<Integer>();

            int count = 0;
            if (i >= 2) {
                odd = result.get(result.size() - 1);
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    arrayList.add(1);
                } else {
                    if (count < odd.size()) {
                        arrayList.add(odd.get(count++) + odd.get(count));
                    }
                }
            }
            result.add(arrayList);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
