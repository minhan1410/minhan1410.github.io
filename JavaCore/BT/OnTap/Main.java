public class Main {
    public static void main(String[] args) {
        StringUtil s = new StringUtil();

        System.out.println("\n+) isContain:");
        System.out.println(s.isContain("", "") + " (So sanh vs ham co san) " + "".contains(""));
        System.out.println(s.isContain("", "123") + " (So sanh vs ham co san) " + "".contains("123"));
        System.out.println(s.isContain("1", "2") + " (So sanh vs ham co san) " + "1".contains("2"));
        System.out.println(s.isContain("1110", "112") + " (So sanh vs ham co san) " + "1110".contains("112"));
        System.out.println(s.isContain("111", "11") + " (So sanh vs ham co san) " + "111".contains("11"));
        System.out.println(s.isContain("111", "110") + " (So sanh vs ham co san) " + "111".contains("110"));
        System.out.println(s.isContain("00111", "11") + " (So sanh vs ham co san) " + "00111".contains("11"));
        System.out.println(s.isContain("0011122", "11") + " (So sanh vs ham co san) " + "0011122".contains("11"));
        System.out.println(s.isContain("Ánh", "An") + " (So sanh vs ham co san) " + "Ánh".contains("An"));
        System.out.println(s.isContain("An", "Ánh") + " (So sanh vs ham co san) " + "An".contains("Ánh"));
        System.out.println(s.isContain("Nhóm java04 thầy Cường", "thầy Cường") + " (So sanh vs ham co san) "
                + "Nhóm java04 thầy Cường".contains("thầy Cường"));
        System.out.println(s.isContain("thầy Cường", "Nhóm java04 thầy Cường") + " (So sanh vs ham co san) "
                + "thầy Cường".contains("Nhóm java04 thầy Cường"));

        System.out.println("\n+) reverse:");
        System.out.println(s.reverse("Hello"));
        System.out.println(s.reverse("Nhóm java04 thầy Cường"));

        System.out.println("\n+) find:");
        System.out.println(s.find("", "") + " (So sanh vs ham co san) " + "".indexOf(""));
        System.out.println(s.find("", "123") + " (So sanh vs ham co san) " + "".indexOf("123"));
        System.out.println(s.find("1", "2") + " (So sanh vs ham co san) " + "1".indexOf("2"));
        System.out.println(s.find("1110", "112") + " (So sanh vs ham co san) " + "1110".indexOf("112"));
        System.out.println(s.find("111", "11") + " (So sanh vs ham co san) " + "111".indexOf("11"));
        System.out.println(s.find("111", "110") + " (So sanh vs ham co san) " + "111".indexOf("110"));
        System.out.println(s.find("00111", "11") + " (So sanh vs ham co san) " + "00111".indexOf("11"));
        System.out.println(s.find("0011122", "11") + " (So sanh vs ham co san) " + "0011122".indexOf("11"));
        System.out.println(s.find("Ánh", "An") + " (So sanh vs ham co san) " + "Ánh".indexOf("An"));
        System.out.println(s.find("An", "Ánh") + " (So sanh vs ham co san) " + "An".indexOf("Ánh"));
        System.out.println(s.find("Nhóm java04 thầy Cường", "thầy Cường") + " (So sanh vs ham co san) "
                + "Nhóm java04 thầy Cường".indexOf("thầy Cường"));
        System.out.println(s.find("thầy Cường", "Nhóm java04 thầy Cường") + " (So sanh vs ham co san) "
                + "thầy Cường".indexOf("Nhóm java04 thầy Cường"));

        System.out.println("\n+) camelCase:");
        System.out.println(s.camelCase("Nhóm java04 thầy Cường"));
        System.out.println(s.camelCase("Upper case ký tự đầu tiên của từ"));

        System.out.println("\n+) longestWord:");
        System.out.println(s.longestWord("Không có gì quý hơn độc lập tự do"));
        System.out.println(s.longestWord("Nhóm,++. java04 thầy Cường"));

        System.out.println("\n+) countWords:");
        System.out.println(s.countWords("Một con mèo, hai con chó, chó đuổi mèo"));
        System.out.println(s.countWords(
                "Dân trí Chủ tịch TPHCM dự báo có thể tiếp tục ghi nhận các ổ dịch rải rác, các chùm ca bệnh cộng đồng trong những ngày tới; đồng thời nhấn mạnh nguy cơ dịch loang trong khu công nghiệp."));

    }
}
