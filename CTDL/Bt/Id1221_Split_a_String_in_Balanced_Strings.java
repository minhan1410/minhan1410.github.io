public class Id1221_Split_a_String_in_Balanced_Strings {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL")); // 4
        System.out.println(balancedStringSplit("RLLLLRRRLR")); // 3
        System.out.println(balancedStringSplit("LLLLRRRR")); // 1
        System.out.println(balancedStringSplit("RLRRRLLRLL")); // 2
    }

    public static int balancedStringSplit(String s) {
        // 0 ms 38.5 MB
        if (s.length() < 2) {
            return 0;
        }

        int count = 0, countR = 0, countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                countR++;
            } else {
                countL++;
            }

            if (countR == countL) {
                count++;
                countR = countL = 0;
            }
        }

        return count;
    }
}
