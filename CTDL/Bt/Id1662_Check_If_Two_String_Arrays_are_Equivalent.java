public class Id1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static void main(String[] args) {
        String []word1 = new String[]{"ab", "c"}, word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();

        for (String string : word1) {
            s1.append(string);
        }

        for (String word : word2) {
            s2.append(word);
        }

        return s1.toString().equals(s2.toString());
    }
}

// 485
// 977
// 26
