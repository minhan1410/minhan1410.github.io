import java.time.LocalDate;

public class LocalDateExample {
    public static void methodInLocalDate(){
        //Khởi tạo ngày hiện tại
        LocalDate toDay = LocalDate.now();  //Phương thức now() để lấy ngày hiện tại
        System.out.println("Hôm nay: "+toDay);

        //Khởi tạo ngày 02/02/2021
        LocalDate localDate = LocalDate.of(2021,2,2); //Dùng of() để truyền vào ngày tháng năm
        System.out.println("Ngày nào đấy: "+localDate);

        LocalDate localDate1 = LocalDate.of(2021, Month.FEBRUARY, 2); //Tháng không còn là kiểu int giống như bên trên
        System.out.println("Vẫn là ngày nào đấy: "+localDate1);

        //Ngày hôm nay ở Hồ Chí Minh
        LocalDate toDayInHCM = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println("Ngày hôm nay ở Hồ Chí Minh: "+toDayInHCM);
        System.out.println("-----------------");

        //Lấy ngày, tháng, năm từ LocalDate
        //Lấy ngày với getDay()
        System.out.println("Ngày hôm nay tính theo tuần: "+toDay.getDayOfWeek());
        System.out.println("Ngày hôm nay tính theo tháng: "+toDay.getDayOfMonth());
        System.out.println("Ngày hôm nay tính theo năm: "+toDay.getDayOfYear());
        System.out.println("-----------------");

        //Lấy tháng với getMonth()
        System.out.println("Tháng này là tháng: "+toDay.getMonth());
        System.out.println("Vẫn là tháng này: "+toDay.getMonthValue());
        System.out.println("-----------------");

        //Lấy năm với getYear()
        System.out.println("Năm nay là năm: "+toDay.getYear());
        System.out.println("-----------------");

        //Cộng trừ ngày, tháng, năm
        //Sử dụng plus()
        System.out.println("Thêm một ngày: "+toDay.plusDays(1));
        System.out.println("Thêm một tuần: "+toDay.plusWeeks(1));
        System.out.println("Thêm một tháng: "+toDay.plusMonths(1));
        System.out.println("Thêm một năm: "+toDay.plusYears(1));
        System.out.println("-----------------");

        //Sử dụng minus()
        System.out.println("Trừ 5 ngày: "+toDay.minusDays(5));
        System.out.println("Trừ 5 tuần: "+toDay.minusWeeks(5));
        System.out.println("Trừ 5 tháng: "+toDay.minusMonths(5));
        System.out.println("Trừ 5 năm: "+toDay.minusYears(5));
        System.out.println("-----------------");

        //So sánh ngày
        //Sử dụng isEqual()
        System.out.println(localDate.isEqual(toDay));
        System.out.println(localDate.isEqual(localDate1));
        System.out.println("-----------------");

        //Sử dụng isAfter()
        System.out.println(localDate.isAfter(toDay));
        System.out.println(toDay.isAfter(localDate));
        System.out.println("-----------------");

        //Sử dụng isBefore()
        System.out.println(localDate.isBefore(toDay));
        System.out.println(toDay.isBefore(localDate));
        System.out.println("-----------------");

        //Sử dụng compareTo()
        System.out.println(toDay.compareTo(localDate));
        System.out.println(localDate.compareTo(toDay));
        System.out.println(localDate.compareTo(localDate1));
    }
    
}
