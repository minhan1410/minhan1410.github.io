public class Id1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static String freqAlphabets(String s) {
        // 4 ms 39.1 MB
        int index = 0;

        while (index != -1) {
            index = s.indexOf('#');
            if (index != -1) {
                String k = s.substring(index - 2, index);
                int ascii = Integer.parseInt(k) + 96;

                s = s.replace(k + "#", String.valueOf((char) (ascii)));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int ascii = Integer.parseInt(String.valueOf(ch)) + 96;
                s = s.replace(ch, (char) (ascii));
            }
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12").equals("jkab"));
        System.out.println(freqAlphabets("1326#").equals("acz"));
        System.out.println(freqAlphabets("25#").equals("y"));
        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#")
                .equals("abcdefghijklmnopqrstuvwxyz"));
    }
}
