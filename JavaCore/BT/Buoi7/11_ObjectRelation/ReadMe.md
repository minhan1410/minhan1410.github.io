# Mô phỏng web site bán hàng

Một web site bán hàng online luôn có các Entity (Table) như sau:

1. Customer: danh sách khách hàng
2. Product: mô tả sản phẩm / mặt hàng
3. Order: đơn hàng tổng
4. LineItem: từng mặt hàng trong một đơn hàng Order

Thực tế nghiệp vụ phức tạp hơn rất nhiều cụ thể là:
1. Quản lý kho (inventory control)
2. Quản lý thu chi tài chính (finance control)
3. Quản lý giao hàng (shipping)
4. Quản lý bảo hành (guarantee service)
5. Dịch vụ hậu mãi (after sales service)
6. Chạy các chương trình khuyến mãi (promotion)

Một mặt hàng có rất nhiều thuộc tính động (dynamic properties). Ví dụ thuộc tính của một cái tủ lạnh sẽ khác với thuộc tính một màn hình và hoàn toàn khác thuộc tính của vải Bắc Giang.

Đơn vị tính cũng khác nhau nốt:
1. pcs (theo piece từng chiếc một)
2. box (ví dụ một thùng bia 12 lon hoặc 24 lon)
3. theo cân nặng (kg)
4. theo thể tích (litre)

Nhiệm vụ của một lập trình viên là quan sát kỹ hoạt động của doanh nghiệp để mô phỏng phần mềm.

VinGroup xây dựng công ty Adayroi. Phiên bản đầu tiên có khoảng 500 bảng. 
Phần mềm bán hàng trực tuyến dạng đóng gói tự cài, nổi tiếng nhất là Magento, sau đó có Pretashop... Dạng dịch Software As Service thì có Amazon, Shopify, Tiki, Lazada, Shopee.

## Quay về ví dụ tý hon của chúng ta.

1. Thầy không dùng cơ sở dữ liệu quan hệ MySQL hay Postgresql bởi vì muốn các anh hiểu bản chất OOP trước. Khi nào học Spring Boot thì mình dùng Hibernate và JPA.
2. Thầy tạo ra một class ```IdGenerator``` làm nhiệm vụ sinh ra số kiểu Long tăng tuần tự
3. Tạo ra một interface ```Entity``` để cho tất cả các Entity khác (concrete Entity) phải tuân thủ. Tại sao tôi làm như vậy?
  - Vì tôi muốn chuẩn hoá một số thao tác lên nhiều kiểu Entity khác nhau. Ví dụ hàm lấy Id của Entity ```public Long getId()```
  - Sau này sẽ dùng Entity là một kiểu trừu tượng hoá ở ```interface Repository```

```java
public class Product implements Entity {  
  private Long id;
  @Override
  public Long getId() {
    return id;
  }
}
```
4. Tạo Repository để thực hiện các thao tác: CRUD (Create: Thêm, Read: Đọc, Update: Sửa, Delete: Xoá)

## Lập trình Generics khác gì với abstraction?
https://viettuts.vn/java-new-features/generics-trong-java

Abstraction là trừu tượng hoá các đối tượng để chắt lọc ra một kiểu chứa các thuộc tính chung nhất.
Generics: kiểu tổng quát

//khai báo kiểu cụ thể
swap(int a, int b)
swap(String a, String b)
swap(float a, float b) 

//khai bảo kiểu tổng quát T
swap<T>(T a, T b) 

List<Integer> sort(List<Integer>, bool isAscending)
List<Long> sort(List<Long>, bool isAscending)
List<T> sort<T>(List<T>, bool isAscending)
Map<K, V> sort<K, V>(Map<K, V>) //hàm này nhận những 2 kiểu tổng quát: K đại diện cho kiểu Key, V đại diện cho kiểu Value

Hãy chương 19 trong sách "Introduction to Java" của Daniel Lang

Ích lợi lập trình kiểu tổng quát Generics là gì?
Dùng một giải thuật duy nhất, áp dụng cho nhiều kiểu dữ liệu khác nhau. Các kiểu này không cần kế thừa từ base class ! Ở đây chả cần những tính năng OOP.

Generics là một tuyệt chiêu của Java, C++, C#.
Golang không có tính năng Generics. Lập trình rất là mệt

VD: function Sum sử dụng generics
```java
  public static <T extends Number> double Sum (T a,T b){
    return a.doubleValue()+b.doubleValue();
  } 
```

Trong ví dụ cụ thể này, hãy xem Database.java, tôi chỉ cần khai báo 3 dòng lệnh là có ngay 3 class tuỳ biến cho từng kiểu Customer, Product, Oder.
```java
public class Database {
  public Repository<Customer> customerRepo;
  public Repository<Product> productRepo;
  public Repository<Order> orderRepo;
}
```

Nếu dùng theo cách cổ điển tôi phải tạo ra 3 class: ```RepositoryCustomer, RepositoryProduct, RepositoryOrder```. 3 class này vẫn phải kế thừa một class cha. Nói chung là code cực dài. Mà tôi lại ít thời gian.

## Lambda Expression là gì, giải quyết cái gì?

Truyền thông trước khi có Lambda Expression: cần xử lý logic nào thì viết một hàm có tham số truyền vào, trả về kết quả.

Tuy nhiên nếu có quá nhiều logic nhỏ nhỏ, chúng ta cũng sẽ phải viết rất nhiều hàm tương ứng. Người ta mới nghĩ ra Lambda Expression có những đặc điểm sau:

1. Không cần khai báo hàm : do not need to declare explicit function
2. Chỉ cần viết trực tiếp logic xử lý ngay tại chỗ cần nó.
3. Lambda Expression thích hợp khi xử lý collection và hoặc viết hàm xử lý sự kiện

Đọc thêm chapter 73 trong sách Java Notes for Professional ở GoalKicker.com


## Tiêu điểm của bài này đó là:

1. Khai báo interface để trừu tượng hoá hành vi (method)
2. Khai báo generics kiểu tổng quát để dùng một thuật toán cho nhiều cấu trúc dữ liệu
3. Sử dụng Lambda Expression (khai báo hàm trực tiếp tại nơi sử dụng, không cần đặt tên hàm). Quá tiện luôn, nó hơi giống Mỳ Ăn Liền nhỉ.
4. Xoá phần tử trong ArrayList phải sử dụng iterator
5. Khi có nhiều thread cùng có thể truy cập vào một biến thì phải sử dụng ReentrantLock hoặc Mutex hoặc Semaphore. Cái này khi nào học sâu về Multithread thầy sẽ nói.


## implements khác gì với extends?
https://itphutran.com/phan-biet-extends-va-implements-trong-java/

extends: kế thừa và mở rộng. Bản thân nghĩa trong tiếng Anh extends có nghĩa là mở rộng rồi.

implements: nghĩa tiếng Anh là thực hiện. Còn dịch sát nghĩa là tuân thủ.

Một class tuân thủ (implements) một hay nhiều interface
Một class extends một class khác
Một interface extends một interface khác
Một interface sẽ không implements một interface khác

Khi tuân thủ (implements), lập trình viên sẽ phải viết mã cụ thể hoá tên phương thức từ interface.

Nếu chưa hiểu tại sao không tạo một ứng dụng nhỏ rồi thử tất cả các trường hợp để hiểu rõ hơn?

Khi extedends thì có thể @Override (đè lên phương thức của lớp cha)

Khi một interface extends interface khác, nó đơn giản chỉ là bổ xung thêm các mẫu hàm mới. Không có gì để @Override ở đây cả !


## Variadic paramters là gì? Dùng khi nào?
https://www.geeksforgeeks.org/variable-arguments-varargs-in-java/

Khi số lượng tham số cùng kiểu truyền vào phương thức không thể xác định. Có thể là 0, 1, 2 ... N. Lúc này dùng variadic parameters sẽ giúp khai báo phương thức không cần dùng kiểu ArrayList hay Array

Tham số variadic sẽ được đóng gói thành kiểu mảng. Cần check length của mảng trước khi dùng !
```java
public static String lengthBetween(String input, int... values) {
}
```

## Tạo một class có nhiều static method để validate

Cách làm này sẽ tái sử dụng được logic validation ở nhiều nơi. Code gọn và đẹp !
```java
public class Validation {
  public static String validateEmail(String email) {}

  public static String validateMobile(String mobile) {}

  public static String lengthBetween(String input, int... values) {
}
```

## Optional: Nó được sử dụng để kiểm tra xem một biến có giá trị tồn tại giá trị hay không 
https://gpcoder.com/3945-optional-trong-java-8

https://viblo.asia/p/toi-uu-source-code-su-dung-optional-trong-java-8-WkwGnJz3G75g

## Stream (luồng) là một đối tượng mới của Java được giới thiệu từ phiên bản Java 8,giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hơn.
https://gpcoder.com/3923-gioi-thieu-ve-stream-api-trong-java-8/

## filter() method là một intermediate operation, cho phép chúng ta lọc các phần tử thoả các điều kiện được chỉ định
https://shareprogramming.net/loc-cac-phan-tu-trong-collection-voi-stream-filter/

## Iterator trong Java là một interface được sử dụng để thay thế Enumerations trong Java Collection Framework. 
https://viettuts.vn/java-collection/su-dung-iterator-trong-java

### Bạn có thể sử dụng interator để:
    Duyệt các phần tử từ đầu đến cuối của một collection.
    Iterator cho phép xóa phần tử khi lặp một collection.
### Có ba phương thức trong Iterator như sau:
    public boolean hasNext()	Nó trả về true nếu iterator còn phần tử kế tiếp phần tử đang duyệt.
    public object next()	    Nó trả về phần tử hiện tại và di chuyển con trỏ trỏ tới phần tử tiếp theo.
    public void remove()	    Nó loại bỏ phần tử cuối được trả về bởi Iterator. Nó hiếm khi được sử dụng.


## Gợi ý thực hành

Vào App.java hãy bổ xung lệnh để tạo Order và LineItem càng nhiều càng tốt.