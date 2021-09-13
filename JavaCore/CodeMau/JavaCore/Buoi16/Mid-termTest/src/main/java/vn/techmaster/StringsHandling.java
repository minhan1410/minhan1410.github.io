package vn.techmaster;

public class StringsHandling {
    //Đến số ký tự in hoa
    public int countWords(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }

    public String capitalFirstCharacter(String str){
        StringBuilder output = new StringBuilder();
        str.trim();
        String array[] = str.split("\\s+");
        for(int i = 0; i < array.length; i++){
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(' ');
        }
        return output.toString().trim();
    }

    public String stringNormalization(String str){
        StringBuilder output = new StringBuilder();
        str.trim();
        str = str.toLowerCase();
        String array[] = str.split("\\. ");
        for(int i = 0; i <array.length; i++){
            array[i].trim();
            String temp = String.valueOf(array[i].charAt(0));
            output.append(temp.toUpperCase() + array[i].substring(1));
            output.append(". ");

        }
        //String s = output.toString().trim();
        //return s.substring(0, s.length() - 1);
        return output.toString().trim();
    }
}
