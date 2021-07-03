public class Main {
    public static void main(String[] args) {
        StringUtil s = new StringUtil();

        // System.out.println("\n+) isContain:");
        // System.out.println(s.isContain("", "") + " (So sanh vs ham co san) " + "".contains(""));
        // System.out.println(s.isContain("", "123") + " (So sanh vs ham co san) " + "".contains("123"));
        // System.out.println(s.isContain("1", "2") + " (So sanh vs ham co san) " + "1".contains("2"));
        // System.out.println(s.isContain("1110", "112") + " (So sanh vs ham co san) " + "1110".contains("112"));
        // System.out.println(s.isContain("111", "11") + " (So sanh vs ham co san) " + "111".contains("11"));
        // System.out.println(s.isContain("111", "110") + " (So sanh vs ham co san) " + "111".contains("110"));
        // System.out.println(s.isContain("00111", "11") + " (So sanh vs ham co san) " + "00111".contains("11"));
        // System.out.println(s.isContain("0011122", "11") + " (So sanh vs ham co san) " + "0011122".contains("11"));
        // System.out.println(s.isContain("001121","111") + " (So sanh vs ham co san) " + "001121".contains("111"));
        // System.out.println(s.isContain("Ánh", "An") + " (So sanh vs ham co san) " + "Ánh".contains("An"));
        // System.out.println(s.isContain("An", "Ánh") + " (So sanh vs ham co san) " + "An".contains("Ánh"));
        // System.out.println(s.isContain("Nhóm java04 thầy Cường", "thầy Cường") + " (So sanh vs ham co san) "
        //         + "Nhóm java04 thầy Cường".contains("thầy Cường"));
        // System.out.println(s.isContain("thầy Cường", "Nhóm java04 thầy Cường") + " (So sanh vs ham co san) "
        //         + "thầy Cường".contains("Nhóm java04 thầy Cường"));

        // System.out.println("\n+) reverse:");
        // System.out.println(s.reverse("Hello"));
        // System.out.println(s.reverse("Nhóm java04 thầy Cường"));

        // System.out.println("\n+) find:");
        // System.out.println(s.find("", "") + " (So sanh vs ham co san) " + "".indexOf(""));
        // System.out.println(s.find("", "123") + " (So sanh vs ham co san) " + "".indexOf("123"));
        // System.out.println(s.find("1", "2") + " (So sanh vs ham co san) " + "1".indexOf("2"));
        // System.out.println(s.find("1110", "112") + " (So sanh vs ham co san) " + "1110".indexOf("112"));
        // System.out.println(s.find("111", "11") + " (So sanh vs ham co san) " + "111".indexOf("11"));
        // System.out.println(s.find("111", "110") + " (So sanh vs ham co san) " + "111".indexOf("110"));
        // System.out.println(s.find("00111", "11") + " (So sanh vs ham co san) " + "00111".indexOf("11"));
        // System.out.println(s.find("0011122", "11") + " (So sanh vs ham co san) " + "0011122".indexOf("11"));
        // System.out.println(s.find("001121","111") + " (So sanh vs ham co san) " + "001121".indexOf("111"));
        // System.out.println(s.find("Ánh", "An") + " (So sanh vs ham co san) " + "Ánh".indexOf("An"));
        // System.out.println(s.find("An", "Ánh") + " (So sanh vs ham co san) " + "An".indexOf("Ánh"));
        // System.out.println(s.find("Nhóm java04 thầy Cường", "thầy Cường") + " (So sanh vs ham co san) "
        //         + "Nhóm java04 thầy Cường".indexOf("thầy Cường"));
        // System.out.println(s.find("thầy Cường", "Nhóm java04 thầy Cường") + " (So sanh vs ham co san) "
        //         + "thầy Cường".indexOf("Nhóm java04 thầy Cường"));

        // System.out.println("\n+) camelCase:");
        // System.out.println(s.camelCase("Nhóm java04 thầy Cường"));
        // System.out.println(s.camelCase("Upper case ký tự đầu tiên của từ"));

        // System.out.println("\n+) longestWord:");
        // System.out.println(s.longestWord("Không có gì quý hơn độc lập tự do"));
        // System.out.println(s.longestWord("Nhóm,++. java04 thầy Cường"));

        // System.out.println("\n+) countWords:");
        // System.out.println(s.countWords("Một con mèo, hai con chó, chó đuổi mèo"));
        // System.out.println(s.countWords(
        //         "Dân trí Chủ tịch TPHCM dự báo có thể tiếp tục ghi nhận các ổ dịch rải rác, các chùm ca bệnh cộng đồng trong những ngày tới; đồng thời nhấn mạnh nguy cơ dịch loang trong khu công nghiệp."));


        // long start1 = System.currentTimeMillis();
        // System.out.println(s.isContain("", ""));
        // System.out.println(s.isContain("", "123"));
        // System.out.println(s.isContain("1", "2"));
        // System.out.println(s.isContain("1110", "112"));
        // System.out.println(s.isContain("111", "11"));
        // System.out.println(s.isContain("111", "110"));
        // System.out.println(s.isContain("00111", "11"));
        // System.out.println(s.isContain("0011122", "11"));
        // System.out.println(s.isContain("001121","111"));
        // System.out.println(s.isContain("Ánh", "An"));
        // System.out.println(s.isContain("An", "Ánh"));
        // System.out.println(s.isContain("Nhóm java04 thầy Cường", "java04 thầy Cường"));
        // System.out.println(s.isContain("thầy Cường", "Nhóm java04 thầy Cường"));
        // long end1 = System.currentTimeMillis();
        // long c1= end1-start1;

        // System.out.println();

        // long start2 = System.currentTimeMillis();
        // System.out.println(s.isContain3("", ""));
        // System.out.println(s.isContain3("", "123"));
        // System.out.println(s.isContain3("1", "2"));
        // System.out.println(s.isContain3("1110", "112"));
        // System.out.println(s.isContain3("111", "11"));
        // System.out.println(s.isContain3("111", "110"));
        // System.out.println(s.isContain3("00111", "11"));
        // System.out.println(s.isContain3("0011122", "11"));
        // System.out.println(s.isContain3("001121","111"));
        // System.out.println(s.isContain3("Ánh", "An"));
        // System.out.println(s.isContain3("An", "Ánh"));
        // System.out.println(s.isContain3("Nhóm java04 thầy Cường", "java04 thầy Cường"));
        // System.out.println(s.isContain3("thầy Cường", "Nhóm java04 thầy Cường"));
        // long end2 = System.currentTimeMillis();
        // long c2= end2-start2;

        // System.out.println();

        // long start3 = System.currentTimeMillis();
        // System.out.println(s.isContain4("", ""));
        // System.out.println(s.isContain4("", "123"));
        // System.out.println(s.isContain4("1", "2"));
        // System.out.println(s.isContain4("1110", "112"));
        // System.out.println(s.isContain4("111", "11"));
        // System.out.println(s.isContain4("111", "110"));
        // System.out.println(s.isContain4("00111", "11"));
        // System.out.println(s.isContain4("0011122", "11"));
        // System.out.println(s.isContain4("001121","111"));
        // System.out.println(s.isContain4("Ánh", "An"));
        // System.out.println(s.isContain4("An", "Ánh"));
        // System.out.println(s.isContain4("Nhóm java04 thầy Cường", "java04 thầy Cường"));
        // System.out.println(s.isContain4("thầy Cường", "Nhóm java04 thầy Cường"));
        // long end3 = System.currentTimeMillis();
        // long c3= end3-start3;

        // System.out.println(c1+" - " + c2+" - " + c3);
    }
}
