package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        //Bài 1
//        StringsHandling stringsHandling = new StringsHandling();
//        String str =  "You Only Live Once. But if You do it right. once is Enough";
//        System.out.println("Chuỗi ban đầu: ");
//        System.out.println(str);
//
//        int count = stringsHandling.countWords(str);
//        System.out.println("ký tự viết in hoa trong chuỗi là: " +count);
//
//        String output = stringsHandling.capitalFirstCharacter(str);
//        System.out.println("Chuỗi sau khi viết in hoa ký tự đầu tiên: ");
//        System.out.println(output);
//
//        output = stringsHandling.stringNormalization(str);
//        System.out.println("Chuỗi sau khi chuẩn hoá là: ");
//        System.out.println(output);

        //Bài 2
//        InputPassworld inputPassworld = new InputPassworld();
//        inputPassworld.passwordvalidation();

        //Bài 3
        CheckMonth checkMonth = new CheckMonth();
        int month = checkMonth.inputMonth();
        checkMonth.dayInMonth(month);
    }
}
