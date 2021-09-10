public class Id28_Implement_strStr {
    public static int strStr(String haystack, String needle) {
        // 294 ms 39.5 MB
        if (needle.isEmpty())
            return 0;
        if ((haystack.isEmpty() && !needle.isEmpty()) || (haystack.length() < needle.length()))
            return -1;

        int needleLength = needle.length(), haystackLength = haystack.length();

        for (int i = 0; i < haystackLength; i++) {
            if (i + needleLength <= haystackLength) {
                String s = haystack.substring(i, i + needleLength);
                if (s.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int strStr1(String haystack, String needle) {
        // 328 ms	38.8 MB
        return haystack.indexOf(needle);
    }

    public static int strStrCopy(String haystack, String needle) {
        // 1 ms 38.7 MB
        if (needle.isEmpty())
            return 0;

        int nLength = needle.length(), hLength = haystack.length();
        char front = needle.charAt(nLength - 1);

        for (int i = nLength - 1, j = 0; i < hLength; i++, j++) {
            if (haystack.charAt(i) == front) {
                int k = j;
                int length = Math.min(j + nLength, hLength);
                for (int l = 0; k < length; k++, l++) {
                    if (haystack.charAt(k) != needle.charAt(l))
                        break;
                }
                if (k >= length)
                    return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));// 2
        System.out.println(strStr("hello", "lb"));// -1
        System.out.println(strStr("aaaaa", "bba"));// -1
        System.out.println(strStr("", ""));// 0
        System.out.println(strStr("", "a"));// -1
        System.out.println(strStr("aa", "aaa"));// -1
        System.out.println(strStr("mississippi", "issip"));// 4
        System.out.println(strStr("a", "a"));// 0
    }
}
