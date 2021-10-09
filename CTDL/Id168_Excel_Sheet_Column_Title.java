import java.util.ArrayList;
import java.util.Arrays;

public class Id168_Excel_Sheet_Column_Title {
    /*public static String convertToTitle(int columnNumber) {
//        62 ms	37.4 MB
        String result = "";
        ArrayList<Integer> count = new ArrayList<Integer>();
        if (columnNumber <= 26) {
            count.add(columnNumber);
        } else {
            int index = 0, v = 0;
            while (columnNumber > 26) {
                while (columnNumber > 26) {
                    columnNumber -= 26;
                    v++;
                }
                count.add(columnNumber);
                if (v <= 26) {
                    count.add(v);
                } else {
                    columnNumber = v;
                    v = 0;
                }
            }
        }
//        System.out.println(count + " - " + columnNumber);
        for (int i = count.size() - 1; i >= 0; i--) {
            if (count.get(i) != 0) {
                result += (char) (count.get(i) - 1 + 65);
            }
        }
        return result;
    }*/

    public static String convertToTitle(int columnNumber) {
//        0 ms	35.9 MB
        int c = columnNumber - 1;
        int a = c / 26;
        int b = c % 26;

        if (a > 0) {
            return convertToTitle(a) + getLetter(b);
        }
        return getLetter(b);
    }

    public static String getLetter(int i) {
        return String.valueOf((char) (i + 65));
    }


    public static void main(String[] args) {
        System.out.println(convertToTitle(1).equals("A")); //A
        System.out.println(convertToTitle(26).equals("Z")); //Z
        System.out.println(convertToTitle(27).equals("AA")); //AA
        System.out.println(convertToTitle(28).equals("AB")); //AB
        System.out.println(convertToTitle(52).equals("AZ")); //AZ
        System.out.println(convertToTitle(53).equals("BA")); //BA
        System.out.println(convertToTitle(78).equals("BZ")); //BZ
        System.out.println(convertToTitle(701).equals("ZY")); //ZY
        System.out.println(convertToTitle(702).equals("ZZ")); //ZZ
        System.out.println(convertToTitle(703).equals("AAA")); //AAA
        System.out.println(convertToTitle(2147483647).equals("FXSHRXW"));
    }
}
