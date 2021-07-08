import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern);

        List<ChoThueNy> list = new ArrayList<ChoThueNy>();
        list.add(new ChoThueNy("thao", 18, "Ha Noi", 1500000, 5));
        list.add(new ChoThueNy("my", 25, "Ha Noi", 1300000, 15));
        list.add(new ChoThueNy("ngoc", 21, "HCM", 2500000, 2));
        list.add(new ChoThueNy("nga", 21, "HCM", 1700000, 4));
        list.add(new ChoThueNy("diem", 20, "HCM", 1000000, 9));
        list.add(new ChoThueNy("huong", 20, "HCM", 500000, 9));

        Collections.sort(list, new Comparator<ChoThueNy>() {
            @Override
            public int compare(ChoThueNy o1, ChoThueNy o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\nSx ten theo Comparator");
        list.forEach(ny -> System.out.println(ny));

        Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println("\nSx ten theo lambda");
        list.forEach(ny -> System.out.println(ny));

        Collections.sort(list, new Comparator<ChoThueNy>() {
            @Override
            public int compare(ChoThueNy o1, ChoThueNy o2) {
                return o1.getAmountSale() - o2.getAmountSale();
            }
        });
        System.out.println("\nSx so lg khach thue theo Comparator");
        list.forEach(ny -> System.out.println(ny));

        Collections.sort(list, (o1, o2) -> o1.getAmountSale() - o2.getAmountSale());
        System.out.println("\nSx so lg khach thue theo lambda");
        list.forEach(ny -> System.out.println(ny));

        System.out.println("\nTk gia hon 1tr");
        for (ChoThueNy ny : list) {
            if (ny.getPrice() > 1000000) {
                System.out.println(ny);
            }
        }

        System.out.println("\nTk gia hon 1tr");
        list.stream().filter(ny -> ny.getPrice() > 1000000).forEach(ny -> System.out.println(ny));

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (ChoThueNy choThueNy : list) {
            map.put(choThueNy.getName(), choThueNy.getPrice() * choThueNy.getAmountSale());
        }
        System.out.println("\nSo tien trong 1 thang cua nhan vien");
        map.forEach((k, v) -> System.out.println(k + " - tien trong thang: " + decimalFormat.format(v) + " tr"));
    }
}
