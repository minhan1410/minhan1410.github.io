import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuanLySanPham {
    private List<Product> list = new ArrayList<Product>();

    public void Show() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void Add(Product product) {
        if (!list.contains(product)) {
            list.add(product);
        }
    }

    public void Filter(int id) {
        for (Product i : list) {
            if (i.getId() == id) {
                System.out.println(
                        "Ban muon sua thong so gi?\n1) Id\n2) Ten\n3) Kieu\n4) So luong nhap\n5) Gia ban\n6) So luong ban");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Chon: ");
                int chon = scanner.nextInt();

                switch (chon) {
                    case 1: {
                        System.out.print("Nhap id moi: ");
                        int id1 = scanner.nextInt();
                        i.setId(id1);
                        break;
                    }
                    case 2: {
                        scanner.nextLine();
                        System.out.print("Nhap ten moi: ");
                        String name = scanner.nextLine();
                        i.setName(name);
                        break;
                    }
                    case 3: {
                        System.out.println("chon kieu moi: ");
                        System.out.println("1) Thuc an\n2) Do gia dung\n3) Thoi trang\n4) My pham");
                        System.out.print("Chon: ");int chon1= scanner.nextInt();

                        if(chon==1){
                            i.setType(ProductType.ThucAn);
                        }else if(chon==2){
                            i.setType(ProductType.DoGiaDung);
                        }else if(chon==3){
                            i.setType(ProductType.ThoiTrang);
                        }else if(chon==4){
                            i.setType(ProductType.MyPham);
                        }else{
                            System.out.println("Khong co lua chon nay");
                        }
                        break;
                    }
                    case 4: {
                        System.out.print("Nhap so luong moi: ");
                        int soLuong = scanner.nextInt();
                        i.setSoLuong(soLuong);
                        break;
                    }
                    case 5: {
                        System.out.print("Nhap so luong moi: ");
                        double gia = scanner.nextDouble();
                        i.setPrice(gia);
                        break;
                    }
                    case 6: {
                        System.out.print("Nhap so luong ban moi: ");
                        int soLuongBan = scanner.nextInt();
                        i.setSoLuongBan(soLuongBan);
                        break;
                    }
                    default:{
                        System.out.println("Khong co lua chon nay");
                    }
                }
            }
        }
    }

    public void Remove(int id) {
        Iterator<Product> iterator = list.iterator();
        while (iterator.hasNext()) {
            Product p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Map<String, Integer> ThongKeSoLuong() {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        for (Product product : list) {
            map.put(product.getName(), product.getSoLuongBan());
        }
        return map;
    }

    public Map<String, Long> ThongKeSoLoaiSanPham() {
        Map<String, Long> map = new LinkedHashMap<String, Long>();

        map.put("Thuc an", list.stream().filter(i -> i.getType().equals(ProductType.ThucAn)).count());
        map.put("Do gia dung", list.stream().filter(i -> i.getType().equals(ProductType.DoGiaDung)).count());
        map.put("Thoi trang", list.stream().filter(i -> i.getType().equals(ProductType.ThoiTrang)).count());
        map.put("My pham", list.stream().filter(i -> i.getType().equals(ProductType.MyPham)).count());

        return map;
    }

    public Set<Entry<ProductType, List<Product>>> ThongKeLoaiSanPham() {
        Set<Entry<ProductType, List<Product>>> map = list.stream().collect(Collectors.groupingBy(Product::getType)).entrySet();

        return map;
    }

    public void SortName() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().toLowerCase().compareTo(o2.getName().toLowerCase());
            }
        });
    }
}
