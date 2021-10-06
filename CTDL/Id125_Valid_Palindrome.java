public class Id125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
//        27 ms	44.3 MB
        s = s.toLowerCase().replaceAll("(?i)[^a-z0-9]", "");
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
//    1ms
    public boolean isPalindrome(String s) {
        int n = s.length();
        for(int i = 0, j = n-1; i < j;) {
            if(!isAlphaNum(s.charAt(i))) i++;
            else if(!isAlphaNum(s.charAt(j))) j--;
            else if(toLower(s.charAt(i)) != toLower(s.charAt(j))) return false;
            else{
                i++;
                j--;
            }
        }

        return true;
    }

    private boolean isAlphaNum(char c) {
        if(c >= 'a' && c <= 'z') return true;
        if(c >= 'A' && c <= 'Z') return true;
        if(c >= '0' && c <= '9') return true;

        return false;
    }

    private char toLower(char c) {
        if(c >= 'A' && c <= 'Z') return (char)(c - 'A' + 'a');
        return c;
    }*/

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //t
        System.out.println(isPalindrome("race a car")); //f
        System.out.println(isPalindrome("ab_a")); //T
        System.out.println(isPalindrome("0P")); //f
        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram.")); //t
    }
}

