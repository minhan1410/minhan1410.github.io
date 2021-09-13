import java.time.LocalTime;

public class LocalTimeExample {

    public static void methodInLocalTime() {
        LocalTime currentTime = LocalTime.now(); // Lấy thời gian hiện tại
        System.out.println("Giờ hiện tại: " + currentTime);

        LocalTime localTime = LocalTime.of(22, 30, 59, 11001); // Tuyền vào giờ cụ thể
        System.out.println("Giờ cụ thể: " + localTime);

        System.out.println("Hour: " + localTime.getHour());
        System.out.println("Minute: " + localTime.getMinute());
        System.out.println("Second: " + localTime.getSecond());
        System.out.println("Nano: " + localTime.getNano());

        LocalTime localTimeLater = localTime.plusHours(3);
        System.out.println("Thêm 3 giờ: " + localTimeLater);

        LocalTime localTimeEarlier = localTime.minusHours(3);
        System.out.println("Trừ 3 giờ: " + localTimeEarlier);
    }

}
