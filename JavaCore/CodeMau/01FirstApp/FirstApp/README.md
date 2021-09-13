# Java là gì?
Java là một trong những ngôn ngữ lập trình hướng đối tượng, nó có khả năng chạy trên mọi nền tảng mà không cần phải biên dịch lại  
Nó giúp các lập trình viên phát triển các ứng dụng mà có thể chạy trên nhiều thiết bị phần cứng và hệ điều hành khác nhau  


# Lịch sử phát triển
Java ban đầu được phát triển bởi hãng Sun Microsystems do Jame Gosling khởi xướng và thiết kế vào năm 1991  
Ban đầu ngôn ngữ này có tên là Oak (Cây sồi – do bên ngoài cơ quan của ông Gosling có nhiều cây sồi). Sau đó không lâu được đổi thành Java và được giới thiệu vào năm 1995  
Đến nay, Java đã trở thành ngôn ngữ lập trình ứng dụng phổ thông và là một trong những ngôn ngữ quan trọng nhất để phát triển các ứng dụng web   

# Đặc tính của Java
- Là ngôn ngữ lập trình hướng đối tượng: Việc thiết kế chương trình bằng ngôn ngữ java xoay quanh việc thiết kế các lớp (Class) và tạo các đối tượng (Object)
- Có tính chắc chắn: Không như nhiều ngôn ngữ lập trình khác, lỗi trong chương trình java sẽ không gây nên sự cố hệ thống, đặc tính này còn cho phép phát hiện ra nhiều lỗi tiềm tàng trước khi chương trình chạy
- Có tính độc lập nền tảng: Một chương trình java có thể chạy trên nhiều máy tính có hệ điều hành khác nhau miễn sao nó có máy ảo JVM.
- Tính khả chuyển: Java được tạo ra với tiêu chí Write once, run anywhere (Viết một lần, thực thi khắp nơi) có nghĩa là một chương trình java có thể chạy trên các nền tảng khác nhau mà không cần phải dịch lại
- Đa nhiệm – đa luồng: java hỗ trợ lập trình đa nhiệm, đa luồng cho phép nhiều tiến trình, tiểu trình có thể chạy song song cùng một thời điểm và tương tác với nhau
- Là ngôn ngữ an toàn: Được thiết kế để dùng cho các mạng máy tính, java có những đặc tính tự bảo vệ mình trước những phần mã không được tin cậy, những phần mã có thể đưa virut vào trong hệ thống hoặc là gây rối hệ thống bằng cách nào đó

![image](https://user-images.githubusercontent.com/70504465/123025435-d006db00-d404-11eb-9500-ce67a7d58525.png)

# JVM và bytecode
Máy ảo java (Java Virtual Machine – JVM) là một máy ảo cho phép các chương trình java được biên dịch sang mã máy  
Ngôn ngữ máy dành cho máy ảo java được gọi là java bytecode, hay ngắn gọn là bytecode  

### Phân biệt JDK, JRE, JVM 
`JDK` (Java Development Kit): Cho phép tạo các chương trình java có thể thực thi và chạy bởi JVM và JRE  
`JRE` (Java Runtime Environment): là sự kết hợp giữa JVM cùng với các thư viện cần thiết để có thể thực thi một chương trình Java thành công  
`JVM` (Java Virtual Machine): Máy ảo Java, cho phép chạy các chương trình java trên đó  

# Các nền tảng java
Hãng Sun đã định nghĩa và hỗ trợ 4 nền tảng java hướng tới các môi trường ứng dụng khác nhau và 4 nền tảng đó là
- Java card: Dành cho thẻ thông minh và các thiết bị nhớ nhỏ vd như thẻ sim, thẻ atm
- Java Platform, Micro Edition (Java ME): dành cho môi trường hệ thống nhúng vd: điện thoại di động 
- Java Platform, Standard Edition (Java SE): đây là nền tảng tiêu chuẩn dành cho môi trường máy chạm và thường được dùng để phát triển java application và java aplet, đây là nền tảng được sử dụng rộng rãi dùng để triển khai các ứng dụng nhẹ cho mục đích sử dụng tổng quát
- Java Platform, Enterprise Edition (Java EE): dành cho môi trường lớn và phân tán của doanh nghiệp hoặc internet, thường được dùng đẻ phát triển server 

# Cấu trúc của chương trình Java
Ngôn ngữ Java được thiết kế xoay quanh đặc trưng hướng đối tượng. Đó là xoay quan việc thiết kế các lớp (class) và tạo các đối tượng (object).  
Phát triển ứng dụng java được khởi đầu bằng việc định nghĩa các lớp. Sau khi định nghĩa các lớp xong, định dạng của tệp lưu trữ các lớp sẽ được lưu có phần đuôi mở rộng là .java
Trong đó:
- package: Một package (gói) mô tả không gian tên có chứa các lớp của java, ta có thể xem package như một thư mục
- import: Nhằm sử dụng để xác định các class hoặc package được sử dụng trong lớp này
- public: Xác định phạm vi truy cập của lớp
- class: Từ khóa nhằm định nghĩa lớp của java
- Variables: Biến
- Method: Phương thức


Trong java, mỗi ứng dụng muốn chạy được phải có một phương thức main() là điểm khởi đầu cho ứng dụng để gọi tất cả các phương thức khác cần thiết để chạy chương trình.
```java
public static void main(String[] args)
```
Từ khóa `static` nhằm chỉ ra rằng đây là một phương thức tĩnh có thể chạy mà không cần khởi tạo đối tượng  
Hàm main nhận một tham số là một mảng dữ liệu kiểu `String`.  
```java
System.out.println("Hello, World!");
```
Dòng này để in ra màn hình chữ `Hello, World!`
