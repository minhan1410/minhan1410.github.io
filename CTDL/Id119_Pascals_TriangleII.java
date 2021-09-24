import java.util.ArrayList;
import java.util.List;

public class Id119_Pascals_TriangleII {
    public static List<Integer> getRowCopy(int rowIndex) {
//        0 ms
        List<Integer> row = new ArrayList<>() {{add(1);}};

        for (int k = 1; k <= rowIndex; k++) {
            row.add((int) ((row.get(row.size() - 1) * (long) (rowIndex - k + 1)) / k));
        }

        return row;
    }

    public static List<Integer> getRow(int rowIndex) {
//        1 ms	36.6 MB
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        pascal.add(List.of(1));
        pascal.add(List.of(1, 1));

        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> arrayList = new ArrayList<>();
            List<Integer> odd = pascal.get(i - 1);
            int count = 0;

            for (int j = 1; j <= i + 1; j++) {
                if (j == 1 || j == i + 1) {
                    arrayList.add(1);
                } else {
                    if (count < odd.size()) {
                        arrayList.add(odd.get(count++) + odd.get(count));
                    }
                }
            }
            pascal.add(arrayList);
        }
        return pascal.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRowCopy(4));
    }
}
