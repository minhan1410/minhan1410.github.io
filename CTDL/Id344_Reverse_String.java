public class Id344_Reverse_String {
    public static void main(String[] args) {
        char ch[] = new char[] { 'h', 'e', 'l', 'l', 'o' };
        reverseString(ch);
        for (char c : ch) {
            System.out.print(c + ", ");
        }
    }

    // public static void swap(char[] a, int start, int end) {
    //     if (start < end) {
    //         char t = a[start];
    //         a[start] = a[end];
    //         a[end] = t;

    //         swap(a, start + 1, end - 1);
    //     }
    // }

    // public static void reverseString(char[] s) {
    //     swap(s, 0, s.length - 1);
    // }

    public static void reverseString(char[] s) {
        int length = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            char t= s[i];
            s[i]=s[length-i];
            s[length-i]=t;
        }
    }
}
