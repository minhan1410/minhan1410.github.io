import java.util.Stack;

public class Id20_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));// t
        System.out.println(isValid("()[]{}"));// t
        System.out.println(isValid("(]"));// f
        System.out.println(isValid("([)]"));// f
        System.out.println(isValid("{[]}"));// t
        System.out.println(isValid("]"));// f
        System.out.println(isValid("1]"));// f
        System.out.println(isValid("(])"));// f
        System.out.println(isValid("{[[[[]]]]"));// f
    }

    public static boolean isValid(String s) {
        // 1 ms 37.1 MB
        Stack<Character> openBrackets = new Stack<Character>();
        for (Character ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                openBrackets.push(ch);
            } else if (openBrackets.isEmpty()) {
                return false;
            } else {
                char open = openBrackets.peek();
                if (ch == ')' || ch == '}' || ch == ']') {
                    if (open == '(' && ch == ')' || open == '{' && ch == '}' || open == '[' && ch == ']') {
                        openBrackets.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
