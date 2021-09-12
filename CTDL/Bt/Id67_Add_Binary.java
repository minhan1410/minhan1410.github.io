public class Id67_Add_Binary {
    public static String addBinary(String a, String b) {
//        1 ms	38.9 MB
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int t = 0;
        while (i >= 0 || j >= 0) {
            int sum = t;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            t = sum / 2;
        }

        if (t != 0) sb.append(t);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
//        System.out.println('1'-'0'+'9'-'0');
        System.out.println(addBinary("11", "1")); //100
        System.out.println(addBinary("1010", "1011")); //10101
        System.out.println(addBinary("1111", "1111")); //11110
    }
}
