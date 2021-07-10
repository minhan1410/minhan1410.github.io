import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            list.add((int) (Math.random()) * 100 + i);
        }

        list.forEach(i -> System.out.printf("%d, ", i));

        // filter: Lọc
        System.out.println("\nChia het cho 5:");
        list.stream().filter(i -> i % 5 == 0).forEach(i -> System.out.printf("%d, ", i));

        System.out.println("\nLon hon 5:");
        list.stream().filter(i -> i > 5).forEach(i -> System.out.printf("%d, ", i));

        // skip: loại bỏ n ptu đầu tiên
        System.out.println("\nLoai bo 90 so dau:");
        list.stream().skip(90).forEach(i -> System.out.printf("%d, ", i));

        // limit: lấy ra n ptu từ đầu tiên
        System.out.println("\nLay 90 so dau:");
        list.stream().limit(90).forEach(i -> System.out.printf("%d, ", i));

        System.out.println("\nDanh sach cac ptu chia het cho 2 lay 2 ptu dau:");
        list.stream().filter(i -> i % 2 == 0).limit(2).forEach(i -> System.out.printf("%d, ", i));

        // map: trả về ánh xạ
        System.out.println("\nDanh sach cac so nhan vs 10:");
        list.stream().map(i -> i * 10).forEach(i -> System.out.printf("%d, ", i));

        // sort: sap xep
        System.out.println("\nSap xep tang dan: ");
        list.stream().sorted().forEach(i -> System.out.printf("%d, ", i));

        System.out.println("\nSap xep giam dan: ");
        list.stream().sorted((o1, o2) -> o1 < o2 ? 1 : -1).forEach(i -> System.out.printf("%d, ", i));

        // anyMatch: kiem tra xm trong ds co ptu nao thoa man dk khong
        System.out.println("\n\nKiem tra xm ds co so am khong: " + list.stream().anyMatch(i -> i < 0));
        System.out.println("Kiem tra xm ds co so 14 khong: " + list.stream().anyMatch(i -> i == 14));

        // allMatch: kiem tra xem tat ca cac ptu trong ds co thoa man dk khong
        System.out.println("\nKiem tra xm ds co so am khong: " + list.stream().allMatch(i -> i < 0));
        System.out.println("Kiem tra xm ds co so 14 khong: " + list.stream().allMatch(i -> i == 14));

        // noneMatch: kiem tra xem tat ca cac ptu trong ds khong thoa man dk(ngc vs
        // allMatch)
        System.out.println("\nKiem tra xm ds co so am khong: " + list.stream().noneMatch(i -> i < 0));
        System.out.println("Kiem tra xm ds co so 14 khong: " + list.stream().noneMatch(i -> i == 14));

        // count: dem so lg
        System.out.println("\nDem xm co bn so >50: " + list.stream().filter(i -> i > 50).count());
        System.out.println("Dem xm co bn so >5: " + list.stream().filter(i -> i > 5).count());

        // max: tim max, min: tim min
        System.out.println("Max list: " + list.stream().max(Integer::compare).get());
        System.out.println("Min list: " + list.stream().min(Integer::compare).get());

        // sum: tinh tong, avg: tinh trung binh cong
        System.out.println("Avg list: " + list.stream().collect(Collectors.averagingDouble(i -> i.intValue())));
        System.out.println("Sum cac ptu chia het cho 2: "
                + list.stream().filter(i -> i % 2 == 0).collect(Collectors.summingInt(i -> i.intValue())));

        
    }
}
// https://gpcoder.com/3973-lop-collectors-trong-java-8/#CacCollectors_duoc_xay_dung_san_build-in
// https://www.geeksforgeeks.org/java-8-collectors-averagingint-in-java-with-examples/