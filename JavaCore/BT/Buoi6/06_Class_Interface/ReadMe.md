# Căn bản về Class

## Code ví dụ mẫu
- [Basic](Basic)
- [Lab](Lab) có thêm ví dụ về Interface

## Khai báo một class
```java
public class Person {
  String firstName;
  String lastName;
  LocalDate birthday;
  public void sayHi() {
    System.out.println("Hi , I am " + this.firstName + this.lastName);
  }
}
```
`class Person` nằm cùng package với `class App`

Trong class App viết một hàm `demoPerson()` như sau:
```java
static void demoPerson() {
  Person person = new Person();
  person.firstName = "John";
  person.lastName = "Mayer";
  person.birthday = LocalDate.of(1965, 11, 20);
  person.sayHi();
}
```
---

Hỏi: Có thể đặt một public class vào một file có tên khác với tên class?

Đáp: Không! Quy tắc của Java, public class phải đặt vào file cùng tên với class

---

Hỏi: Có thể đặt tên class với ký tự đầu tiên là chữ thường?

Đáp: Không và không nên!

---

Hỏi: một file java có thể chứa nhiều class được không?
Đáp: được ! tuy nhiên chỉ có một class duy nhất là public, các class còn lại phải dùng default access modifier

```java
public class Jungle {
  
}

class Tiger {

}

class Monkey {

}
```

Hỏi: Trong một class, thuộc tính khác phương thức như thế nào?

Đáp: Thuộc tính của một class chỉ tính chất chung mà các đối tượng được tạo ra từ class đều phải có. Còn phương thức là hành vi, hành động của đối tượng

---

Hỏi: phương thức (method) khác với hàm (function) như thế nào?

Đáp: phương thức luôn gắn với một class. Nếu là static method, thì chúng ta chạy bằng `class.staticMethod()`. Nếu là non static method, thì chạy bằng `object.nonStaticMethod()`

Hàm (function) thường không gắn vào một class/object cụ thể. Thế nên người ta hay dùng lambda function (hàm được khai báo trực tiếp tại lúc dùng), chứ ít ai dùng lambda method.

Nếu thỉnh thoảng bạn có nhầm lẫn giữa function và method cũng chả sao. Quan trọng là code đừng lỗi là được.

---

Hỏi: tại sao lập trình hướng đối tượng (OOP) lại phức tạp đến vậy? Có cách nào đơn giản hơn không?

Đáp: Xung quanh ta đều là đối tượng. Khi khái quát hoá lên, chúng ta sẽ có các class tập hợp các đối tượng cùng chung các đặc điểm và hành vi lại. Lập trình hướng đối tượng dễ khi các bạn luôn liên hệ với đời thường.

---

Hỏi: tại sao `demoPerson()` phải khai báo với keyword `static`?

Đáp: trong một class, một static method chỉ có thể gọi đến static method chứ không thể gọi non static method. Ở đây hàm main là static, do đó muốn main gọi được demoPerson thì demoPerson cũng phải là static.

---
Hỏi: `static` khác gì với `non static` ?

Đáp: `static` dùng để chỉ phương thức hoặc thuộc tính luôn gắn với Class chứ không phải Object.

---

Hỏi: `class` khác gì với  `object`?

Đáp: `class` là khuôn mẫu để đúc ra `object`. Trong lập trình hướng đối tượng class là kiểu trừu tượng hoá các thuộc tính và phương thức chung. Từ class sẽ tạo ra object.

---
Hỏi: Ý nghĩa của `import Math.Vector;` là gì?

Đáp: Java tổ chức theo package. Bên trong một package có thể có nhiều file Java. Tên của package cũng trùng tên với thư mục. Ví dụ `class Vector` nằm trong `package Math` thì trong `class App` muốn dùng kiểu Vector sẽ phải khai báo

`import Math.Vector;`

---

## Access Modifier

Hỏi: khi khai báo `class Vector` như sau:
```java
public class Vector {
  float x;
  float y;
}
```
sau đó viết code
```java
static void demoVector() {
  Vector vector = new Vector();
  vector.x = 10;
  vector.y = 11;
}
```
Lúc biên dịch, lỗi như sau
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        The field Vector.x is not visible
        The field Vector.y is not visible
```

Đáp: trong class có các từ khoá gọi access modifier. Chúng là `private, protected, public` chúng dùng để xác định quyền truy cập vào thuộc tính và phương thức bên trong một class. Có một access modifier mặc định không có keyword cụ thể, người ta gọi là package access modifier. Chỉ những class nằm trong cùng một package mới có thể truy xuất được các thuộc tính, phương thức của nhau.


Trong App.java, lệnh này báo lỗi khi biên dịch, vì [App.java](App.java) không cùng package với [Vector.java](Math/Vector.java)
```java
Vector vector = new Vector();
vector.x = 10;
vector.y = 11;
```
Nhưng trong [DemoVector.java](Math/DemoVector.java) thì không báo lỗi vì `DemoVector` cùng package với [Vector.java](Math/Vector.java)

### public vs private. Tại sao cần phải che dấu thuộc tính - phương thức?

Hỏi: `public` là công khai thì rõ rồi. Tại sao phải dùng đến `private`?

Đáp: Hãy nhìn vào ví dụ `class NorthKorea` bạn sẽ thấy có những hoạt động mà Bắc Triều Tiên cần phải giấu thật kỹ, chỉ nội bộ biết, vậy phải dùng đến `private`

```java
public class NorthKorea {
  private void enrichPlutonium() {
    System.out.println("No one should know about this. So it must be private");
  }

  public void runPanoramaShow() {
    System.out.println("It is beautiful so every one should know");
  }

  public void demoNuclearMissile() {
    System.out.println("To threaten South Korea and US");
  }
}
```

### protected dùng khi nào?

Hỏi: `protected` dùng khi nào?

Đáp: `protected` chỉ cho phép các class kế thừa xem được thuộc tính, phương thức của mình. Ví dụ cụ thể: một ông chủ rất giàu, làm ở một công ty có nhiều nhân viên.

- Ông ta có một người con riêng. Ông ta muốn giữ kín chuyện này với bất kỳ ai. Dùng `private`
- Mật khẩu mở cửa công ty, chỉ chia sẻ với nhân viên cùng công ty. Dùng defaul access modifier
- Thành tích tốt của công ty, cần công bố rộng rãi `public`
- Số tiền tích kiệm 1 triệu USD chỉ nói riêng cho con cái của ông ta `protected`

## Constructor 

Constructor là một phương thức đặc biệt của class dùng để khởi tạo nên đối tượng từ class đó.
Constructor có thể nhận 0 hoặc nhiều tham số, và không có kiểu trả về.

```java
public Person(String firstName, String lastName, LocalDate birthday) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.birthday = birthday;
}
```
```java
Person johnHopkin = new Person("John", "Hopkin", LocalDate.of(1865, 05, 20));
```


## Java có Destructor không?

Java không thực sự có Destructor nhưng nó có ghi đè phương thức finalize nếu class kế thừa từ `class Object`

## Kế thừa - extends
Hỏi: Tại sao cần có kế thừa?

Đáp: 
- Để tận dụng lại một kiểu đã có và bổ xung thêm thuộc tính, phương thức.
- Để phân cấp quản lý các đối tượng
- Phần mềm mô phỏng thực tế cuộc sống. Trong cuộc sống có kế thừa, thì phần mềm cũng phải có kế thừa.

```java
public class Employee {
  String fullName;
  LocalDate birthday;
  LocalDate joinDate;
}
```

```java
public class Internship extends Employee{
  String labProject;
  String coach;
}
```

```java
public class FulltimeEmp extends Employee{
  int rank;
  int monthsInService;
}
```

Hỏi: một class có thể kế thừa từ nhiều class không?

Đáp: Không. Mỗi class chỉ kế thừa từ một class khác.

---

Hỏi: Java cho phép kế thừa đến mấy cấp?

Đáp: Tôi không rõ. Nhưng theo nguyên tắc thiết kế clean code, đừng kế thừa quá sâu hơn 4 cấp. `A -> AA -> AAA -> AAAA` là đủ rồi đó. Nhiều hơn cấp độ kế thừa, phần mềm khó bảo trì.

---

Hỏi: Nếu tôi không thích lập trình hướng đối tượng, tôi không muốn khai báo class, mà chỉ viết các hàm vậy có được không?

Đáp: Được nếu bạn chỉ viết những hàm kiểm thử đơn giản. Còn nếu bạn thực sự lập trình ứng dụng Java, hãy nắm vững kỹ thuật lập trình hướng đối tượng.
## @Overide

Hỏi: @Override là gì vậy?

Đáp: Over + ride = phóng xe đè lên. Thực chất ở đây, chúng ta viết lại một phương thức trùng tên đè lên phương thức của base class.
Trong ví dụ dưới, chúng ta viết đè phương thức `toString()`

```java
public class Person{
  String firstName;
  String lastName;
  @Override
  public String toString() {
    return "Person(firstName = '" + firstName + "', lastName = '" + lastName + "')";
  }
}
```

---
Hỏi: tại sao lại phải cần @Override (viết đè) khi lập trình OOP?

Đáp: Bản chất của kế thừa đó là tận dụng thuộc tính, hành vi của lớp cha. Tuy nhiên khi cần vẫn có thể cải tiến, nâng cấp. Có như vậy ứng dụng mới trở nên phong phú và linh hoạt.

## final class không cho phép kế thừa sâu hơn

Chúng ta có `class RomeoJuliet` phiên bản Italy.

```java
public final class RomeoJuliet {
  @Override
  public String toString() {
    return "Romeo loves Juliet forever";
  }  
}
```

Người Trung Quốc muốn copy và cải tiến cho lãng mạn hơn
```java
public class RomeoJulietChina extends RomeoJuliet {
  
}
```

Kết quả báo lỗi biên dịch như sau:
```
The type RomeoJulietChina cannot subclass the final class RomeoJulietJava(16777529)
```

`final class` ngăn không để một class tiếp tục bị kế thừa sâu hơn.

## Từ khoá `this`
Trong constructor của class Person ta thấy từ khoá `this`
```java
public Person(String firstName, String lastName, LocalDate birthday) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.birthday = birthday;
}
```

`this` là từ khoá trong phương thức để truy xuất đến chính đối tượng sở hữu phương thức đó.

## Từ khoá `super`

`super` là từ khoá để gọi phương thức của class cha. Xem ví dụ dưới đây: `class Person` và `class HardworkPerson` đều có phương thức `public void work()`. Trong phương thức `work` của `HardPerson` vừa gọi lại phương thức của `Person` và bổ xung thêm logic của riêng mình. 

```java
public class HardworkPerson extends Person {
  @Override
  public void work() {
    super.work();
    System.out.println("Then continues to work 4 hours more in evening");
  }  
}
```

Kết quả in ra là:
```
Work 8 hours a day
Then continues to work 4 hours more in evening
```

## Constructor có kế thừa được không?

Hỏi: Các phương thức của class nếu không có từ khoá 'final' đề có thể kế thừa và Override. Vậy constructor có thể ghi đè không?

Đáp: Không ! Constructor không thể kế thừa mà cũng không thể override

```java
public Person(String firstName, String lastName, LocalDate birthday) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.birthday = birthday;
}
```
constructor ở HardworkPerson có thể sử dụng lại bằng cách gọi super nhưng không kế thừa
```java
public HardworkPerson(String firstName, String lastName, LocalDate birthday) {
  super(firstName, lastName, birthday);
}
```

## Phương thức `equals` trong class

Hỏi: làm sao để so sánh 2 đối tượng cùng kiểu class và kết luận rằng chúng bằng nhau (equal)

Đáp: Hãy viết đè phương thức equal. Nếu bạn lập trình VSCode hãy dùng chuột phải bật menu Source Action ... rồi chọn Generate Hash Code and Equals

```java
@Override
public boolean equals(Object obj) {
  if (this == obj)
    return true;
  if (obj == null)
    return false;
  if (getClass() != obj.getClass())
    return false;
  Person other = (Person) obj;
  if (birthday == null) {
    if (other.birthday != null)
      return false;
  } else if (!birthday.equals(other.birthday))
    return false;
  if (firstName == null) {
    if (other.firstName != null)
      return false;
  } else if (!firstName.equals(other.firstName))
    return false;
  if (lastName == null) {
    if (other.lastName != null)
      return false;
  } else if (!lastName.equals(other.lastName))
    return false;
  return true;
}
```

Hỏi : `equals` khác gì với `==`?

Đáp: A và B là hai em sinh đôi cùng trứng. Phát biểu sau đây cái nào chính xác?
- A giống B : `A.equals(B)`
- A chính là B: `A == B`

Rõ ràng phát biểu số 1 `A.equals(B)` chính xác hơn.

## Phương thức `hashCode()` trong class

Hỏi: tại sao cần hàm hash trả về giá trị int của một đối tượng

Đáp: `hashCode()` dùng để tính một giá trị int đại diện cho một đối tượng. Hai đối tượng cùng kiểu, chỉ cần khác nhau một chút giá trị thuộc tính sẽ có giá trị hash khác nhau. Tuy nhiên `hashCode()` không đảm bảo tính duy nhất tuyệt đối. Nó chỉ đảm bảo rằng, 2 đối tượng giống hệt nhau giá trị thuộc tính thì có hashCode bằng nhau. hashCode sẽ ứng dụng trong phần bổ đối tượng trong cấu trúc dữ liệu Hash

```java
@Override
public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
  result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
  result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
  return result;
}
```

## Interface khác gì với Class

Hỏi: Interface khác gì với Class, khi nào dùng Interface?

Đáp: Interface ưu tiên tạo ra để định hình các mẫu phương thức. Từ đó các class sẽ `implements` tất cả các mẫu phương thức của Interface. 
- Một class chỉ có thể `extends` một class khác
- Một class interfacecó thể `implements` nhiều interface.
- Một interface có thể `extends` một hoặc nhiều interface khác.
- Một interface không thể 'extends` hay `implements` một class khác.


## Những điều chúng ta tưởng nhầm về Interface

Hỏi: Có phải interface hoàn toàn không có phương thức đầy đủ (có cả phần logic bên trong) và không thể chứa thuộc tính không?

Đáp: Nhầm to. Interface có thể chứa static methods và static hoặc final properties.

Interface không được phép chứa non static method và non static properties

```java
public interface ISecurity {
  void kiemTraThanNhiet();  //hợp lý
  void kiemTraDanhTinh(); //hợp lý
  void chaoHoiKhachHang();//hợp lý

  //Được phép khai báo phương thức static đầy đủ
  static String getKeyCode() {
    return KEY;
  }
  //Cảnh báo : The method doPrivateThing() from the type ISecurity is never used locally
  private void doPrivateThing() {
     System.out.println("do private thing");
  }
  //Lỗi biên dịch : Abstract methods do not specify a body
  public void doOtherthing() {
    System.out.println("doOtherthing");
  }

  //Được phép nhưng phải dùng keyword final
  public final String AGE ="TEST";

  //Được phép nhưng phải dùng keyword static
  static String BADGET = "Demo";
}
```

## Interface vs Abstract Class ?

Hỏi: Interface khác gì với Abtract Class?

Đáp: Thứ nhất Abstract Class có đầy đủ tính chất của một class. Chỉ có điều không được trực tiếp tạo đối tượng từ Abstract class mà phải tạo đối tượng từ một non abstract class.

Abstract class có thể implements một hoặc nhiều interface.
Abstract class có thể chứa non static properties, non static methods nhưng Interface thì không thể.

## Đa kế thừa trong Interface là như thế nào?

Hỏi: class chỉ cho phép đơn kế thừa, vậy Interface thì sao?

Đáp: Một interface được phép kế thừa từ nhiều interface khác.

```java
public interface IBankSecurity extends ISecurity, ISinger{
  void useGun();
  void userTaser();
}
```

## Khi nào dùng Interface và khi nào dùng Class?

Hỏi: Tôi rất phân vân khi sử dụng Interface. Khi nào thì nên dùng nó?

Đáp: Class là khuôn mẫu để tạo ra đối tượng. Còn Interface quy định hành vi (method) để các class khác tuân thủ.
Hãy tận dụng tính chất Multiple implements của Interface để tạo ra sự đa dạng hoá của một class.