import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //LocalDateExample.methodInLocalDate();
        //LocalTimeExample.methodInLocalTime();
        //LocalDateTimeExample.methodInLocalDateTime();

        LocalDateTime toDay = LocalDateTime.now();
        System.out.println("Khi chưa format: " + toDay);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy, HH:mm");
        String formatterDate = toDay.format(myFormatter);
        System.out.println("Sau khi format: " + formatterDate);
    }
}
