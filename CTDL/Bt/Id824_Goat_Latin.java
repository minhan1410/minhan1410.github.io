public class Id824_Goat_Latin {
    public static String toGoatLatin(String sentence) {
        // 4 ms 37.6 MB
        StringBuilder sb = new StringBuilder();
        String str[] = sentence.split("\\s");
        int index = 1;

        for (String string : str) {
            char ch = string.charAt(0);
            char c= Character.toLowerCase(ch);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                sb.append(string);
                sb.append("ma");
            }else{
                sb.append(string.substring(1));
                sb.append(ch);
                sb.append("ma");
            }

            for(int i = 1; i <= index; i++){
                sb.append("a");
            }

            if(index != str.length ){
                sb.append(" ");
            }
            index++;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin").equals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog").equals(
                "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"));
    }
}
