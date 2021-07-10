import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Product> products = getData();

        // System.out.println("Bai 1:");
        // Bai1(products, DanhMuc.DienThoai);
        // Bai1(products, DanhMuc.Laptop);

        // System.out.println("\nBai 2:");
        // Bai2(products, "Xiaomi");
        // Bai2(products, "Apple");

        // System.out.println("\nBai 3:");
        // Bai3(products, DanhMuc.DienThoai, "Tu 7 - 13 trieu");
        // Bai3(products, DanhMuc.DienThoai, "Tren 13 trieu");
        // Bai3(products, DanhMuc.Apple, "Tren 13 trieu");

        // System.out.println("\nBai 4:");
        // Bai4(products, "Oppo Reno5");

        Chon();
    }

    public static void Bai1(ArrayList<Product> products, DanhMuc danhMuc) {
        System.out.println("Danh muc " + danhMuc + ":");
        products.stream().filter(i -> i.getDanhMuc() == danhMuc).forEach(i -> System.out.println(i));
        System.out.println();
    }

    public static void Bai2(ArrayList<Product> products, String hang) {
        System.out.println("Danh muc " + hang + ":");
        products.stream().filter(i -> i.getHang().equals(hang)).forEach(i -> System.out.println(i));
        System.out.println();
    }

    public static void Bai3(ArrayList<Product> products, DanhMuc danhMuc, String khoangGia) {
        System.out.println("Danh muc " + danhMuc + ", " + khoangGia + ":");
        switch (khoangGia) {
            case "Duoi 2 trieu": {
                products.stream().filter(i -> (i.getDanhMuc() == danhMuc) && (i.getGia() < 2_000_000d))
                        .forEach(i -> System.out.println(i));
                break;
            }
            case "Tu 2 - 4 trieu": {
                products.stream().filter(
                        i -> (i.getDanhMuc() == danhMuc) && (i.getGia() <= 4_000_000d && i.getGia() >= 2_000_000))
                        .forEach(i -> System.out.println(i));
                break;
            }
            case "Tu 4 - 7 trieu": {
                products.stream().filter(
                        i -> (i.getDanhMuc() == danhMuc) && (i.getGia() <= 7_000_000d && i.getGia() >= 4_000_000))
                        .forEach(i -> System.out.println(i));
                break;
            }
            case "Tu 7 - 13 trieu": {
                products.stream().filter(
                        i -> (i.getDanhMuc() == danhMuc) && (i.getGia() <= 13_000_000d && i.getGia() >= 7_000_000))
                        .forEach(i -> System.out.println(i));
                break;
            }
            case "Tren 13 trieu": {
                products.stream().filter(i -> (i.getDanhMuc() == danhMuc) && (i.getGia() > 13_000_000d))
                        .forEach(i -> System.out.println(i));
                break;
            }
            default: {
                System.out.println("Chịu");
            }
        }
        System.out.println();
    }

    public static void Bai4(ArrayList<Product> products, String str) {
        products.stream().filter(i -> (i.getName().equals(str))).forEach(i -> System.out.println(i));

    }

    public static void Menu() {
        System.out.println("\t\tMenu");
        System.out.println("1. Tim theo danh muc");
        System.out.println("2. Tim theo hang");
        System.out.println("3. Tim theo gia");
        System.out.println("4. Tim kiem theo ten");
        System.out.println("0. Thoat");
    }

    public static void Chon() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = getData();

        int chon;
        do {
            Menu();
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1: {
                    System.out.println("1. Tim theo danh muc");
                    int stt = 1;
                    for (DanhMuc i : DanhMuc.values()) {
                        System.out.println("\t" + stt + ". " + i);
                        stt++;
                    }
                    System.out.print("Chon danh muc: ");
                    int chon_1 = scanner.nextInt();
                    switch (chon_1) {
                        case 1: {
                            Bai1(products, DanhMuc.DienThoai);
                            break;
                        }
                        case 2: {
                            Bai1(products, DanhMuc.Laptop);
                            break;
                        }
                        case 3: {
                            Bai1(products, DanhMuc.Apple);
                            break;
                        }
                        case 4: {
                            Bai1(products, DanhMuc.PhuKien);
                            break;
                        }
                        default: {
                            System.out.println("Chịu");
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("2. Tim theo hang");
                    System.out.print("Nhap hang: ");
                    String hang = scanner.next();
                    Bai2(products, hang);
                    break;
                }
                case 3: {
                    System.out.println("3. Tim theo gia");
                    int stt = 1;
                    for (DanhMuc i : DanhMuc.values()) {
                        System.out.println("\t" + stt + ". " + i);
                        stt++;
                    }
                    System.out.print("Chon danh muc: ");
                    int chon_1 = scanner.nextInt();
                    System.out.print("Nhap gia: ");
                    scanner.nextLine();
                    String khoangGia = scanner.nextLine();
                    switch (chon_1) {
                        case 1: {
                            Bai3(products, DanhMuc.DienThoai, khoangGia);
                            break;
                        }
                        case 2: {
                            Bai3(products, DanhMuc.Laptop, khoangGia);
                            break;
                        }
                        case 3: {
                            Bai3(products, DanhMuc.Apple, khoangGia);
                            break;
                        }
                        case 4: {
                            Bai3(products, DanhMuc.PhuKien, khoangGia);
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("4. Tim kiem ten");
                    System.out.print("Nhap vao ten: ");
                    scanner.nextLine();
                    String ten = scanner.nextLine();
                    Bai4(products, ten);
                    break;
                }
                default: {
                    System.out.println("0. Thoat");
                    System.exit(0);
                }
            }
        } while (chon != 0);
    }

    public static ArrayList<Product> getData() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(100, 7, "Oppo Reno5", "moTa", "OPPO", 8_390_000d, DanhMuc.DienThoai));
        products.add(new Product(100, 8, "Samsung Galaxy Z Flip", "moTa", "Samsung", 20_990_000d, DanhMuc.DienThoai));
        products.add(new Product(100, 9, " Asus Zenbook UX325EA-EG079T", "moTa", " Asus", 20_790_000d, DanhMuc.Laptop));
        products.add(new Product(100, 10, "Dell G3 15 i5 10300H", "moTa", "Dell", 21_840_000d, DanhMuc.Laptop));
        products.add(new Product(100, 11, "iPhone 12 Pro Max 128GB", "moTa", "Apple", 30_990_000d, DanhMuc.Apple));
        products.add(new Product(100, 12, "MacBook Air 13", "moTa", "Apple", 33_990_000d, DanhMuc.Apple));
        products.add(new Product(100, 13, "Loa bluetooth Compact 2", "moTa", "Xiaomi", 290_000d, DanhMuc.PhuKien));
        products.add(new Product(100, 14, "Pin sạc dự phòng 10000mAh Mi Ultra Compact", "moTa", "Xiaomi", 710_000d,
                DanhMuc.PhuKien));
        return products;
    }
}
