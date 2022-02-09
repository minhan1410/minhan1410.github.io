# **Dependency Injection (DI)**

## Khái niệm

**Dependency Injection (DI)** Là một design pattern, **một cách code nhằm `giảm sự phụ thuộc giữa` các Object để `tiện cho việc thay đổi hay mở rộng code sau này`**.

Các **Object** nên phục thuộc vào các **Abstract Class** và thể hiện chi tiết của nó sẽ được **Inject** vào lúc runtime chương trình.

_VD_

```java
public class Girl{
    private Bikini outfit; // mỗi cô gái sẽ có một bộ outfit khi ra ngoài
    public Girl(){
      outfit = new Bikini(); // Khi bạn tạo ra 1 cô gái, bạn cho cô ta mặc Bikini chẳng hạn
    }
}
```

Trước hết, qua đoạn code này, bạn sẽ thấy là khi bạn tạo ra một `Girl`, bạn sẽ tạo ra thêm 1 bộ `Bikini` đi kèm với cô gái đó. Lúc này, `Bikini` tồn tại mang ý nghĩa là `dependency (phụ thuộc)` của `Girl`.

Khi khởi tạo thuộc tính như này, bạn vô tình tạo ra một điểm thắt nút trong chương trình của mình. Giả sử `Girl` muốn mặc một bộ Váy + Áo thun hở rốn hay không mặc gì thì sao? Hay nguy hiểm hơn, bộ đồ `Bikini` bị hỏng? (code lớp `Bikini` không hoạt động?) nó sẽ ảnh hưởng trực tiếp tới `Girl`.

_Vấn đề là ở đó, nguyên tắc là:_

    Các Class không nên phụ thuộc vào các kế thừa cấp thấp, mà nên phụ thuộc vào Abstraction (lớp trừu tượng).

_Nghe hơi khó hiểu. Bây giờ mình thay đoạn code như này:_

```java
// Một interface cho việc ăn mặc
public interface Outfit {
  public void wear();
}

// Một object cấp thấp, implement của Outfits
public class Bikini implements Outfit {
  public void wear() {
    System.out.println("Đã mặc Bikini");
  }
}

// Bây giờ Girl chỉ phụ thuộc vào Outfit. nếu muốn thay đổi đồ của cô gái, chúng ta chỉ cần cho Outfit một thể hiện mới.
public class Girl{
    private Outfit outfit;
    public Girl(){
      outfit = new Bikini();
    }
}
```

Tới đây, chúng ta mới chỉ `Abtract` hóa thuộc tính của `Girl` mà thôi, còn thực tế, `Girl` vẫn đang bị gắn với một bộ `Bikini` duy nhất. Vậy muốn thay đồ cho cô gái, bạn phải làm như nào?

_Phải sửa code thêm chút nữa:_

```java
public class Girl{
    private Outfit outfit;
    public Girl(Outfit anything){
      this.outfit = anything // Tạo ra một cô gái, với một món đồ tùy biến
      // Không bị phụ thuộc quá nhiều vào thời điểm khởi tạo, hay code.
    }
}

public class Main {
  public static void main(String[] args) {
    Outfit bikini = new Bikini(); // Tạo ra đối tượng Bikini ở ngoài đối tượng
    Girl ngocTrinh = new Girl(bikini); // Mặc nó vào cho cô gái khi tạo ra cô ấy.
  }
}
```

Chúng ta đã gần như tách được `Bikini` ra hoàn toàn khỏi `Girl`, điều này làm giảm sự phụ thuộc giữa `Girl` và `Bikini` làm tăng tính tùy biến, linh hoạt cho code. Bây giờ `Girl` sẽ hoạt động với `Outfit` và `Outfit` ở đâu ra? Chúng ta tạo ra và đưa nó vào (Inject) cô gái `Girl`

_Khái niệm `Dependency Injection` từ đây mà ra:_

    Dependency Injection là việc các Object nên phụ thuộc vào các Abstract Class và thể hiện chi tiết của nó sẽ được Inject vào đối tượng lúc runtime.

Bây giờ muốn `Girl` mặc gì khác, bạn chỉ cần tạo một Class kế thừa `Outfit` và `Inject` (dịch là Tiêm vào cũng được) nó vào `Girl` là xong!

# **Inversion of Control (IoC)**

**Dependency Injection** giúp chúng ta `dễ dàng mở rộng code` và `giảm sự phụ thuộc giữa các dependency với nhau`. **Tuy nhiên lúc này khi code bạn sẽ phải kiêm thêm nhiệm vụ Inject dependency (tiêm sự phụ thuộc)**

**Nếu một class có nhiều `dependency` thì bạn sẽ phải `inject` từng cái một điều này dẫn tới khó khăn trong việc `code`, `quản lý code` và `dependency`**

## Khái niệm

**`Inversion of Control (IoC) `thay vì phải `khởi tạo` và `quản lý bộ nhớ cho các Object` như cách thông thường thì ta `đảo ngược chiều điều khiển để Spring` `tạo` và `quản lý` bộ nhớ cho các Object thay việc của chúng ta**

_VD_

```java
public static void main(String[] args) {
    Outfit bikini = new Bikini();
    Accessories gucci = new GucciAccessories();
    HairStyle hair = new KoreanHairStyle();
    Girl ngocTrinh = new Girl(bikini, gucci, hair);
}
```

Bây giờ giả sử, chúng ta định nghĩa trước toàn bộ các `dependency` có trong `Project`, mô tả nó và tống nó vào 1 cái `kho` và giao cho một thằng tên là `framework` quản lý. Bất kỳ các `Class` nào khi khởi tạo, nó cần `dependency` gì, thì cái `framework` này sẽ tự tìm trong `kho` rồi inject vào đối tượng thay chúng ta. sẽ tiện hơn phải không?

![img](https://super-static-assets.s3.amazonaws.com/8a72ee8e-d4aa-4a06-985f-e92802c5bc44/images/ec534834-b4fb-430c-9283-f8fe77dffec4.jpg?w=1500&f=webp)

**That it, chính nó, đó cũng chính là nguyên lý chính của `Inversion of Control (IOC) - Đảo chiều sự điều khiển`**

**[Tham khảo Loda](https://loda.me/articles/core-gii-thch-dependency-injection-di-v-ioc-bng-ngc-trinh)**

**[Tham khảo Viblo](https://viblo.asia/p/gioi-thieu-cac-annotation-co-ban-trong-spring-boot-gGJ597e1ZX2)**
