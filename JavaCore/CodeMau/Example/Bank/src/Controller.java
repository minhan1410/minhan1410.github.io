import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private static long balanceNumber = 5000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;
    
    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static long transfer(long money){
      
        //Kiểm tra nếu số tiền nhỏ hơn 50.000 thì thông báo số tiền chuyển tối thiểu phải là 50.000 
        //Nếu số tiền chuyển lớn hơn số dư thì thông báo tài khoản không đủ
        //Nếu chuyển thành công, thì thông báo chuyển khoản thành công, in ra số dư mới và thêm lịch sử giao dịch mới
        return balanceNumber;

    }

    public void actionTransfer(){
        //Thực hiện các công việc như nhập số tài khoản thụ hưởng, số tiền mô tả tại đây
    }

    public void getHistory(){
        //In danh sách lịch sử giao dịch
    }


    //Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
        
    }
    
}
