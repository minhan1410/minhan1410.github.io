public class Main {
    public static void main(String[] args) {
        Season season = Season.AUTUMN; //Tạo đối tượng season
        System.out.println(season);
        System.out.println("Giá trị đặc biệt của "+season+ " là: " +season.getValues());

        System.out.println("Tất cả các mùa trong năm: ");
        //Sử dụng vòng lặp for each và phương thức values() để lấy toàn bộ phần tử trong enum
        for (Season s: Season.values()) {
            System.out.println(s + " - "+s.getValues());
        }
    }
}
