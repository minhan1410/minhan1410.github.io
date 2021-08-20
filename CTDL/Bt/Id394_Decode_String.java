import java.util.Stack;

public class Id394_Decode_String {
    public static void main(String[] args) {
        System.out.println(decodeString("156[a]").equals(decodeStringCopy("156[a]")));
        System.out.println(decodeString("3[a]2[bc]").equals(decodeStringCopy("3[a]2[bc]")));
        System.out.println(decodeStringCopy("3[a2[c]]").equals(decodeStringCopy("3[a2[c]]")));
        System.out.println(decodeString("2[abc]3[cd]ef").equals(decodeStringCopy("2[abc]3[cd]ef")));
        System.out.println(decodeString("abc3[cd]xyz").equals(decodeStringCopy("abc3[cd]xyz")));
    }

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<Integer>();
        Stack<String> strStack = new Stack<String>();
        StringBuilder stringBuilder = new StringBuilder();

        char ch;
        int length = s.length(), num = 0;
        for (int i = 0; i < length; i++) {
            ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                // Số
                num = ch - '0';

                while (i + 1 < length && Character.isDigit(s.charAt(i + 1))) {
                    // số có 2 chữ số trở lên
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++;
                }

                numStack.push(num);
            } else if (Character.isLetter(ch)) {
                // Chữ
                stringBuilder.append(ch);
            } else if (ch == '[') {
                strStack.push(stringBuilder.toString());
                stringBuilder = new StringBuilder();
            } else {
                int count = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());

                for (int j = 1; j <= count; j++) {
                    temp.append(stringBuilder);
                }

                stringBuilder = temp;
            }
        }
        return stringBuilder.toString();
    }

    // https://www.youtube.com/watch?v=P7iR5iweg1M&ab_channel=CSNinja-CodingMadeSimple
    public static String decodeStringCopy(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
                numStack.push(num);
            } else if (c == '[') {
                strStack.push(sb.toString());
                sb = new StringBuilder();
            } else if (c == ']') {
                int repeats = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j = 0; j < repeats; ++j) {
                    temp.append(sb);
                }
                sb = temp;
            } else
                sb.append(c);
        }
        return sb.toString();
    }

    public static String decodeString1(String s) {
        // Time Limit Exceeded
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                while (Character.isLetter(stack.peek()) && !stack.isEmpty()) {
                    // Chữ trả về true
                    stringBuilder.insert(0, stack.pop());
                }

                char ch = stack.pop();

                while (Character.isDigit(stack.peek()) && !stack.isEmpty()) {
                    // Số trả về true
                    if (ch == '[') {
                        ch = stack.pop();
                    }

                    int count = Integer.parseInt(ch + "");
                    for (int i = 1; i <= count; i++) {
                        for (char character : stringBuilder.toString().toCharArray()) {
                            stack.push(character);
                        }
                    }
                }

                stringBuilder = new StringBuilder();
            }
        }

        while (!stack.isEmpty()) {
            stringBuilder.insert(0, stack.pop());
        }

        return stringBuilder.toString();
    }
}
