public class App {
    public static void main(String[] args) throws Exception {
        Season season = Season.SUMMER;
        System.out.println(season);

        //Duyệt các phần tử trong enum
        for(Season s : Season.values()){ //values() trả về một mảng gồm tất cả các hằng số enum
            System.out.println(s);
        }

        //Lấy value của MONDAY
        Day day = Day.MONDAY;
        System.out.println(day.getValue());
    }
}
