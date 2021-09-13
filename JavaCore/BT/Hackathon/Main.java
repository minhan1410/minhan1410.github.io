import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hackathon1 hackathon1 = new Hackathon1();
        hackathon1.Bai1(3, 4, 5);

        Thread.sleep(1000);

        List<String> list = new ArrayList<String>();
        list.add("Thụy Sĩ");
        list.add("TBN");
        list.add("Bỉ");
        list.add("Đan Mạch");
        list.add("Bồ");
        list.add("Việt Nam");
        list.add("Anh");
        list.add("Pháp");
        list.add("Hàn");
        list.add("Nhật");
        System.out.println("So cach: "+hackathon1.Bai2(list));

        Thread.sleep(1000);

        List<String> fullNames=new ArrayList<String>();
        fullNames.add("Nguyễn    hữu tiến ");
        fullNames.add("   Lê vĂn tốt ");
        fullNames.add("nguyễn việt ANh");
        fullNames.add("  Hoàng trọng  kHoa");
        fullNames.add(" ĐàO         việt phong");

        hackathon1.Bai3(fullNames);

        Thread.sleep(1000);

        hackathon1.Bai4();

    }
}
