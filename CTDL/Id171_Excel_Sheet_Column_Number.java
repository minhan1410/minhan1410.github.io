public class Id171_Excel_Sheet_Column_Number {
    /*public static int titleToNumber(String columnTitle) {
//    2 ms	39.6 MB
        int result = 0, length = columnTitle.length();
        for (int i = 0; i < length; i++) {
//            System.out.println(i+" - "+columnTitle.charAt(length-i-1));
            result += Math.pow(26, i) * (columnTitle.charAt(length - i - 1) - 'A' + 1);
        }
        return result;
    }*/

    public static int titleToNumber(String columnTitle) {
//    1 ms	39 MB
        int result = 0, length = columnTitle.length();
        for (int i = 0; i < length; i++) {
            result *= 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("Z"));
        System.out.println(titleToNumber("AA"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("AZ"));
        System.out.println(titleToNumber("ZY"));
        System.out.println(titleToNumber("AAA"));
        System.out.println(titleToNumber("FXSHRXW"));
    }
}
