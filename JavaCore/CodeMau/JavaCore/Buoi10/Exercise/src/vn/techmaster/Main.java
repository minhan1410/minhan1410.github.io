package vn.techmaster;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        //Câu 1
        String strA = "Anh yêu em hơn yêu java";
        String strB = "java";

        if (m.compareString(strA, strB)){
            System.out.println("Chuỗi A chứa chuỗi B");
        }else {
            System.out.println("Chuỗi A không chứa chuỗi B");
        }

        //Câu 2
        String str = "aaa bb c hh n e c";
        System.out.println("Chuỗi ban đầu: " + str);
        System.out.println("Chuỗi sau khi loại bỏ chùng lặp: " + m.removeDuplicate(str));

        //Câu 3
        String email = "ngoc@techmaster.vn";
        if (m.validateEmail(email)){
            System.out.println(email + " hợp lệ");
        }else {
            System.out.println(email + " không hợp lệ");
        }
    }

    public  boolean compareString(String str1, String str2){
        if (str1.contains(str2)){
            return true;
        }else {
            return false;
        }
    }

    public String removeDuplicate(String str){
        String output = new String();
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i) +"    "+output.indexOf(str.charAt(i)));
            if(output.indexOf(str.charAt(i)) < 0){
                output = output + str.charAt(i);
            }
        }
        return output;
    }

    public boolean validateEmail(String email){
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        boolean isCheck = email.matches(EMAIL_REGEX);
        return isCheck;
    }
}
