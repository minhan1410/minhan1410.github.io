import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Hinh.ChuNhat(4, 3);

        QuanLySanPham ql = new QuanLySanPham();
        // demo 2
        ql.Add(new Product(1, "banh", ProductType.ThucAn, 1000, 15, 800));
        ql.Add(new Product(2, "keo", ProductType.ThucAn, 1000, 15, 800));
        ql.Add(new Product(3, "sua", ProductType.ThucAn, 1000, 15, 800));
        ql.Add(new Product(4, "keo", ProductType.ThucAn, 1000, 15, 800));
        ql.Add(new Product(1, "keo cao su", ProductType.ThucAn, 1000, 15, 800));

        ql.Add(new Product(5, "mat na", ProductType.MyPham, 1000, 20, 700));
        ql.Add(new Product(6, "kem duong", ProductType.MyPham, 1000, 20, 700));
        ql.Add(new Product(7, "serum", ProductType.MyPham, 1000, 20, 700));
        ql.Add(new Product(8, "nuoc hoa hong", ProductType.MyPham, 1000, 20, 700));

        ql.Add(new Product(9, "quan au", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(10, "quan kaki", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(11, "ao phong", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(12, "ao so mi", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(13, "dong ho", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(14, "nhan", ProductType.ThoiTrang, 2000, 200, 900));
        ql.Add(new Product(15, "khuyen tai", ProductType.ThoiTrang, 2000, 200, 900));

        ql.Add(new Product(16, "tivi", ProductType.DoGiaDung, 3000, 2000, 1000));
        ql.Add(new Product(17, "tu lanh", ProductType.DoGiaDung, 3000, 2000, 1000));
        ql.Add(new Product(18, "noi com", ProductType.DoGiaDung, 3000, 2000, 1000));
        ql.Add(new Product(19, "dieu hoa", ProductType.DoGiaDung, 3000, 2000, 1000));

        // demo 1
        ql.Show();
        ql.Add(new Product(20, "Keo cao su", ProductType.ThucAn, 1000, 15, 800));

        // demo 3
        ql.Filter(20);
        ql.Show();

        // demo4
        ql.Remove(20);

        // demo 5
        System.out.println("5 - Xem sản phẩm và số lượng bán được (Sử dụng Map)");
        ql.ThongKeSoLuong().forEach((k, v) -> System.out.println(k + " : " + v));

        // demo 6
        System.out.println("6 - Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó");
        for (Entry<ProductType, List<Product>> list : ql.ThongKeLoaiSanPham()) {
            System.out.println(list.getKey() + ":");
            for (Product product : list.getValue()) {
                System.out.println("-) " + product);
            }
        }

        System.out.println("\n Thong ke theo so:");
        ql.ThongKeSoLoaiSanPham().forEach((k, v) -> System.out.println(k + " : " + v));

        // demo 7
        ql.Add(new Product(51, "f", ProductType.DoGiaDung, 3000, 2000, 1000));
        ql.Add(new Product(71, "g", ProductType.DoGiaDung, 3000, 2000, 1000));
        ql.Add(new Product(61, "a", ProductType.DoGiaDung, 3000, 2000, 1000));

        ql.SortName();
        ql.Show();
    }
}
