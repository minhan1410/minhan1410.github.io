import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
    // Khởi tạo khách hành
    Customer tom = new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA");
    Customer bob = new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ");
    Customer alice = new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng");

    // Khởi tạo sản phẩm
    Product arisPro = new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G");
    Product maiWei = new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít");
    Product supHyper = new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang");

    // Khởi tạo từng mặt hàng trong một đơn hàng Order
    List<LineItem> list1 = new ArrayList<LineItem>();
    list1.add(new LineItem(1000, 1));
    list1.add(new LineItem(2000, 1));
    list1.add(new LineItem(3000, 2));

    List<LineItem> list2 = new ArrayList<LineItem>();
    list2.add(new LineItem(1000, 2));
    list2.add(new LineItem(2000, 2));
    list2.add(new LineItem(3000, 2));

    List<LineItem> list3 = new ArrayList<LineItem>();
    list3.add(new LineItem(1000, 3));
    list3.add(new LineItem(2000, 3));
    list3.add(new LineItem(3000, 3));

    // Khởi tạo đơn hàng
    Order order1 = new Order(tom, LocalDateTime.now(), "oder1", list1);
    Order order2 = new Order(bob, LocalDateTime.now(), "oder2", list2);
    Order order3 = new Order(alice, LocalDateTime.now(), "oder3", list3);


    Database db = new Database();
    // Thêm khách hàng
    db.customerRepo.add(tom);
    db.customerRepo.add(bob);
    db.customerRepo.add(alice);

    System.out.println("\tcustomerRepo");
    db.customerRepo.getAll().forEach(i -> System.out.println(i + "\n"));
    System.out.println("-------------------------------------------------------------------");

    // Xóa khách hàng có id=1
    db.customerRepo.deleteByID(1L);

    System.out.println("\tcustomerRepo");
    db.customerRepo.getAll().forEach(i -> System.out.println(i + "\n"));
    System.out.println("-------------------------------------------------------------------");

    // Thêm sản phẩm
    db.productRepo.add(arisPro);
    db.productRepo.add(maiWei);
    db.productRepo.add(supHyper);

    System.out.println("\tproductRepo");
    db.productRepo.getAll().forEach(i -> System.out.println(i + "\n"));
    System.out.println("-------------------------------------------------------------------");

    // Thêm đơn hàng
    db.orderRepo.add(order1);
    db.orderRepo.add(order2);
    db.orderRepo.add(order3);

    System.out.println("\torderRepo");
    db.orderRepo.getAll().forEach(i -> System.out.println(i + "\n"));
    System.out.println("-------------------------------------------------------------------");

    // Tìm kiếm hách hàng có id=1
    // System.out.println(db.customerRepo.findById(1l).get());

    Optional<Customer> oCustomer = db.customerRepo.findById(1L);
    if(oCustomer.isPresent()) {
      System.out.println(oCustomer.get());
    }

  }
}
/*
 * Optional: Nó được sử dụng để kiểm tra xem một biến có giá trị tồn tại giá trị
 * hay không https://gpcoder.com/3945-optional-trong-java-8
 */