import java.util.HashMap;
import java.util.Map;

public class Id13_Roman_to_Integer {
    public static int romanToInt1(String s) {
        // 7 ms 39.5 MB
        int result = 0;

        if (s.contains("IV")) {
            result += 4;
            s = s.replace("IV", "");
        }
        if (s.contains("IX")) {
            result += 9;
            s = s.replace("IX", "");
        }
        if (s.contains("XL")) {
            result += 40;
            s = s.replace("XL", "");
        }
        if (s.contains("XC")) {
            result += 90;
            s = s.replace("XC", "");
        }
        if (s.contains("CD")) {
            result += 400;
            s = s.replace("CD", "");
        }
        if (s.contains("CM")) {
            result += 900;
            s = s.replace("CM", "");
        }

        if (s != "") {
            Map<Character, Integer> map = new HashMap<Character, Integer>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
            map.put(' ', 0);

            int length = s.length();
            if (length % 2 != 0) {
                s += " ";
            }

            for (int i = 0; i < length; i += 2) {
                result += map.get(s.charAt(i)) + map.get(s.charAt(i + 1));
            }
        }

        return result;
    }

    public static int romanToInt2(String s) {
        // 7 ms 42.4 MB
        int result = 0;

        if (s.indexOf("IV") != -1) {
            result += 4;
            s = s.replace("IV", "");
        }
        if (s.indexOf("IX") != -1) {
            result += 9;
            s = s.replace("IX", "");
        }
        if (s.indexOf("XL") != -1) {
            result += 40;
            s = s.replace("XL", "");
        }
        if (s.indexOf("XC") != -1) {
            result += 90;
            s = s.replace("XC", "");
        }
        if (s.indexOf("CD") != -1) {
            result += 400;
            s = s.replace("CD", "");
        }
        if (s.indexOf("CM") != -1) {
            result += 900;
            s = s.replace("CM", "");
        }

        if (s != "") {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                case 'I': {
                    result += 1;
                    break;
                }
                case 'V': {
                    result += 5;
                    break;
                }
                case 'X': {
                    result += 10;
                    break;
                }
                case 'L': {
                    result += 50;
                    break;
                }
                case 'C': {
                    result += 100;
                    break;
                }
                case 'D': {
                    result += 500;
                    break;
                }
                case 'M': {
                    result += 1000;
                    break;
                }
                }
            }
        }

        return result;
    }

    public static int romanToInt3(String s) {
        // 3 ms 39.1 MB
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case 'I':
                if ((i != s.length() - 1) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                    result = result - 1;
                else
                    result = result + 1;

                break;
            case 'V':
                result = result + 5;
                break;
            case 'X':
                if ((i != s.length() - 1) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                    result = result - 10;
                else
                    result = result + 10;
                break;
            case 'L':
                result = result + 50;
                break;
            case 'C':
                if ((i != s.length() - 1) && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                    result = result - 100;
                else
                    result = result + 100;
                break;
            case 'D':
                result = result + 500;
                break;
            case 'M':
                result = result + 1000;
                break;

            }
        }
        return result;
    }

    public static int romanToInt(String s) {
        // copy 2 ms 38.8 MB
        int a = 0, n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
            case 'I':
                n = 1;
                break;
            case 'V':
                n = 5;
                break;
            case 'X':
                n = 10;
                break;
            case 'L':
                n = 50;
                break;
            case 'C':
                n = 100;
                break;
            case 'D':
                n = 500;
                break;
            case 'M':
                n = 1000;
                break;
            }
            if (4 * n < a)
                a -= n;
            else
                a += n;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("IV"));// 4
        System.out.println(romanToInt("IX"));// 9
        System.out.println(romanToInt("LVIII"));// 58
        System.out.println(romanToInt("MCMXCIV"));// 1994
        System.out.println(romanToInt("DCXXI"));// 621
    }
}
