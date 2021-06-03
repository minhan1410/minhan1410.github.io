import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.*;

public class StringUtil {
    /*
     * Hãy viết hàm isContain để kiểm tra strA có chứa strB không mà không hàm có
     * sẵn trong String
     * 
     * case1: ("","") -> T case2: ("","123") -> F case3: ("1","2") -> F case4:
     * ("1110","112") -> F case5: ("111","11") -> T case6: ("111","110") -> F case7:
     * ("00111","11") -> T case8: ("0011122","11") -> T
     * 
     */

    public boolean isContain(String strA, String strB) {
        if (strA.length() < strB.length()) {
            return false;
        }

        boolean flag = true;
        int starA = 0;
        int starB = 0;

        if (strA.length() >= strB.length()) {
            while (starA < strA.length() && starB < strB.length()) {
                if (strB.charAt(starB) != strA.charAt(starA)) {
                    flag = false;
                    starA++;
                } else {
                    starB++;
                    starA++;
                    flag = true;
                }
            }
        }

        return flag;

        // C2:
        // Pattern pattern = Pattern.compile(strB);
        // Matcher matcher = pattern.matcher(strA);
        // matcher.find();
    }

    /*
     * Nghịch đảo một chuỗi: Hello -> olleH
     */
    public String reverse(String str) {
        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    /*
     * trả về vị trí mà strB được tìm thấy trong strA -1: không tìm thấy >= 0: là vị
     * trí tìm thấy
     * 
     */
    public int find(String strA, String strB) {
        if (!isContain(strA, strB)) {
            return -1;
        }

        int starA = 0;

        while (starA < strA.length()) {
            if (strB.charAt(0) != strA.charAt(starA)) {
                starA++;
            } else {
                return starA;
            }
        }
        return 0;

        // C2:
        // try {
        // Pattern pattern = Pattern.compile(strB);
        // Matcher matcher = pattern.matcher(strA);
        // //
        // https://stackoverflow.com/questions/22633951/java-regex-throwing-exception-for-no-match-found-when-pattern-found-in-line
        // matcher.find();
        // return matcher.start();
        // } catch (IllegalStateException e) {
        // return -1;
        // }
    }

    /*
     * Upper case ký tự đầu tiên của từ
     */
    public String camelCase(String input) {
        String str[] = input.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(0) >= 97 && str[i].charAt(0) <= 122) {
                str[i] = str[i].replace(str[i].charAt(0), (char) (str[i].charAt(0) - 32));
            }
        }

        input = "";
        for (String i : str) {
            input += i + " ";
        }

        return input;
    }

    /*
     * "Không có gì quý hơn độc lập tự do" Từ dài nhất là "Không"
     */
    public String longestWord(String input) {
        input = input.replaceAll("[\\-\\+\\.\\^:,!@#\\$%&\\*_=\\?]", "");
        String str[] = input.split(" ");
        int pos = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[pos].length() < str[i].length()) {
                // max = str[i].length();
                pos = i;
            }
        }
        return str[pos];
    }

    /*
     * Đếm số lần tự lặp lại
     */

    /*
     * "Một con mèo, hai con chó, chó đuổi mèo" Một: 1 con: 2 mèo: 2 hai: 1 chó: 2
     * đuổi: 1
     */
    public Map<String, Integer> countWords(String input) {
        input = input.replaceAll("[\\-\\+\\.\\^:,!@#\\$%&\\*_=\\?]", "");

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String str[] = input.split(" ");
        int count;
        for (int i = 0; i < str.length; i++) {
            count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (!map.containsKey(str[i])) {
                map.put(str[i], count);
            }
        }
        return map;
    }
}