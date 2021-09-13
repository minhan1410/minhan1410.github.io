import java.time.Month;

public class Main {
    public static void main(String[] args) {
        //sử dụng if-else
        int month = 7;
        usingIfElseStatement(month);

        //sử dụng switch-case
        usingSwitchStatement(Month.FEBRUARY);
    }

    static void usingIfElseStatement(int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8|| month == 10 || month == 12){
            System.out.println("Tháng " + month+ " có 31 ngày");
        }else if (month == 2){
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Tháng " + month + " có 30 ngày");
        }else {
            System.out.println("Không có tháng "+month);
        }
    }

    static void usingSwitchStatement(Month month){
        switch (month){
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                System.out.println("Tháng "+month.getValue() + " có 31 ngày");
                break;
            case FEBRUARY:
                System.out.println("Tháng "+month.getValue() + " có 28 hoặc 29 ngày");
                break;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                System.out.println("Tháng "+month.getValue() + " có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng " + month.getValue());
                break;
        }
    }
}
