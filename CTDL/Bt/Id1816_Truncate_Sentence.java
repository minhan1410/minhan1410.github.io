public class Id1816_Truncate_Sentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));// "Hello how are you"
        System.out.println(truncateSentence("What is the solution to this problem", 4));// "What is the solution"
        System.out.println(truncateSentence("chopper is not a tanuki", 5));// "chopper is not a tanuki"
    }

    public static String truncateSentence1(String s, int k) {
        // 7 ms 39.5 MB
        StringBuffer sb = new StringBuffer();
        String[] str = s.split("\\s");

        for (int i = 0; i < k; i++) {
            sb.append(str[i]);
            if (i != k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String truncateSentence(String s, int k) {
        int count = 0;
        s += " ";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
            if (count == k)
                return s.substring(0, i);
        }
        return "";
    }
}
