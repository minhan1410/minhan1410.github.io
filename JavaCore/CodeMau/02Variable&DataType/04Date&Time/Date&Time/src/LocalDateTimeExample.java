import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void methodInLocalDateTime() {
        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Ngày và giờ hiện tại: " + toDay);

        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 26, 13, 55, 36, 123);
        System.out.println("Ngày và giờ chỉ định : " + localDateTime);
        System.out.println("Year: " + localDateTime.getYear());
        System.out.println("Month: " + localDateTime.getMonth());
        System.out.println("Day of Month: " + localDateTime.getDayOfMonth());
        System.out.println("Day of Week: " + localDateTime.getDayOfWeek());
        System.out.println("Day of Year: " + localDateTime.getDayOfYear());
        System.out.println("Hour: " + localDateTime.getHour());
        System.out.println("Minute: " + localDateTime.getMinute());
        System.out.println("Second: " + localDateTime.getSecond());
        System.out.println("Nano: " + localDateTime.getNano());

        LocalDateTime localDateTime1 = localDateTime.plusYears(3);
        System.out.println("Cộng thêm 3 năm: " + localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.minusYears(3);
        System.out.println("Giảm 3 năm: " +localDateTime2);
    }

}
