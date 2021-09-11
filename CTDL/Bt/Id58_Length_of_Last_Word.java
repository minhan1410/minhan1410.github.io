public class Id58_Length_of_Last_Word {
    public static int lengthOfLastWord1(String s) {
//        5 ms	39.3 MB
        if (s == null || s.length() == 0) return 0;
        String[] str = s.split("\\s");
        return str[str.length - 1].trim().length();
    }

    public static int lengthOfLastWord2(String s) {
//      copy  0 ms	39.1 MB
        if (s == null || s.length() == 0) return 0;

        int result = 0, n = s.length() - 1;
        int end = n, start = end;

        // iterate the s from the back
        while (end >= 0) {
            if (s.charAt(end) != ' ') {
                start = end;
                // move the start of word until it's space
                while (start >= 0 && s.charAt(start) != ' ')
                    start--;

                // the len of the word is end - start
                // e.g., abc
                // start = -1, end = 2, then len = 3
                result = end - start;
                break;
            }

            // if the char is space, skip it
            end--;
        }

        return result;
    }

    public static int lengthOfLastWord(String s) {
//        0 ms	37.5 MB
        s = s.trim();
        return s.substring(s.lastIndexOf(" ") + 1).length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));//5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));//4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));//6
    }
}
