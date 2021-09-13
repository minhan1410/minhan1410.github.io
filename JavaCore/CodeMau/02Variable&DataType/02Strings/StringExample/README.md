# String
Trong java, String là một đối tượng biểu diễn một chuỗi các giá trị char

Có hai cách để tạo đối tượng String
## Sử dụng String Literal
String literal được tạo bằng các sử dụng dấu nháy kép:
`String s = "Ngoc Ban Quyen";`
Các đối tượng String được lưu trữ trong một khu vực bộ nhớ đặc biệt được gọi là String Constant Pool
Sử dụng String literal giúp cho việc sử dụng bộ nhớ hiệu quả hơn vì nếu chuỗi đã tồn tại trong Pool thì sẽ không có đối tượng mới được tạo ra  
*Khuyến khích sử dụng cách này*

## Sử dụng từ khoá new
`String s =new String("TechMaster");`
Trong trường hợp này, JVM sẽ tạo một đối tượng mới như bình thường trong bộ nhớ Heap (Không phải Pool) và hằng Techmaster sẽ được đặt trong Pool. Biến sẽ tham chiếu tới đối tượng trong Heap (Không phải Pool)

# Lớp String
Lớp java.lang.String cung cấp rất nhiều phương thức để xử lý chuỗi. Các phương thức này giúp chúng ta thực hiện nhiều thao tác như cắt, ghép, chuyển đổi, so sánh, thay thế các chuỗi, ...  
Một số phương thức thường gặp:
![image](https://user-images.githubusercontent.com/70504465/113968672-bd492500-985d-11eb-88e4-4a4615a25adc.png)

