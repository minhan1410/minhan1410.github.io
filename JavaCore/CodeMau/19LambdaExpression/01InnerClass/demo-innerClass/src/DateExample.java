/**
 * DateExample
 */
public class DateExample {

    public int day, month, year;

    public class TimeExample{ //Lớp TimeExample lồng trong lớp DateExample
        public int hour, minute;

        public void show(){
            System.out.printf("%d/%d/%d\n", day, month, year);
            System.out.printf("%d:%d", hour, minute);
        }
    }
}