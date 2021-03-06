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
     * ("00111","11") -> T case8: ("0011122","11") -> T case9: ("001121","111") -> F
     * 
     */

    public boolean isContain(String strA, String strB) {
        int lengthA = strA.length();
        int lengthB = strB.length();

        if (lengthA < lengthB) {
            return false;
        }

        int starA = 0;
        int starB = 0;
        int dem = 0;

        if (lengthA >= lengthB) {
            while (starA < lengthA && starB < lengthB) {
                if (strB.charAt(starB) != strA.charAt(starA)) {
                    starA++;
                    dem = 0;
                } else {
                    starB++;
                    starA++;
                    dem++;
                }
            }
        }

        return (dem == lengthB);

        // C2: dung regex
        // Pattern pattern = Pattern.compile(strB);
        // Matcher matcher = pattern.matcher(strA);
        // matcher.find();

        // C3: chia chuoi A ra thanh cac chuoi con
        // String a1 = "";
        // int lengthB = strB.length();
        // int lengthA = strA.length();

        // if (lengthA < lengthB) {
        //     return false;
        // }
        // if (lengthA == 0 && lengthB == 0) {
        //     return true;
        // }

        // for (int i = 0; i < lengthA; i++) {
        //     if (strA.charAt(i) == strB.charAt(0)) {
        //         if (lengthA >= i + lengthB) {
        //             a1 = strA.substring(i, i + lengthB);
        //             if (!a1.equals(strB)) {
        //                 i += lengthB - 1;
        //             } else {
        //                 return true;
        //             }
        //         } else {
        //             return false;
        //         }
        //     }
        // }
        // return false;

        // C4: VietAnh
        // final int length = strB.length();
        // if (length == 0)
        //     return true;

        // final char firstLo = Character.toLowerCase(strB.charAt(0));
        // final char firstUp = Character.toUpperCase(strB.charAt(0));

        // for (int i = strA.length() - length; i >= 0; i--) {
        //     final char ch = strA.charAt(i);
        //     if (ch != firstLo && ch != firstUp)
        //         continue;

        //     if (strA.regionMatches(true, i, strB, 0, length))
        //         return true;
        // }

        // return false;
    }

    public boolean isContain3(String strA, String strB){
        String a1 = "";
        int lengthB = strB.length();
        int lengthA = strA.length();

        if (lengthA < lengthB) {
            return false;
        }
        if (lengthA == 0 && lengthB == 0) {
            return true;
        }

        for (int i = 0; i < lengthA; i++) {
            if (strA.charAt(i) == strB.charAt(0)) {
                if (lengthA >= i + lengthB) {
                    a1 = strA.substring(i, i + lengthB);
                    if (!a1.equals(strB)) {
                        i += lengthB - 1;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean isContain4(String strA, String strB) {
        final int length = strB.length();
        if (length == 0)
            return true;

        final char firstLo = Character.toLowerCase(strB.charAt(0));
        final char firstUp = Character.toUpperCase(strB.charAt(0));

        for (int i = strA.length() - length; i >= 0; i--) {
            final char ch = strA.charAt(i);
            if (ch != firstLo && ch != firstUp)
                continue;

            if (strA.regionMatches(true, i, strB, 0, length))
                return true;
        }

        return false;
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
        // if (!isContain(strA, strB)) {
        // return -1;
        // }

        // int starA = 0;
        // while (starA < strA.length()) {
        // if (strB.charAt(0) != strA.charAt(starA)) {
        // starA++;
        // } else {
        // return starA;
        // }
        // }
        // return 0;

        int lengthB = strB.length();
        int lengthA = strA.length();
        String a1 = "";

        if (lengthA < lengthB) {
            return -1;
        }
        if (lengthA == 0 && lengthB == 0) {
            return 0;
        }

        for (int i = 0; i < lengthA; i++) {
            if (strA.charAt(i) == strB.charAt(0)) {
                if (lengthA >= i + lengthB) {
                    a1 = strA.substring(i, i + lengthB);
                    if (!a1.equals(strB)) {
                        i += lengthB - 1;
                    } else {
                        return i;
                    }
                } else {
                    return -1;
                }
            }
        }
        return -1;

        // C2:
        // try {
        // Pattern pattern = Pattern.compile(strB);
        // Matcher matcher = pattern.matcher(strA);
        // //
        // https: //
        // stackoverflow.com/questions/22633951/java-regex-throwing-exception-for-no-match-found-when-pattern-found-in-line
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