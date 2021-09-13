## Kiểu xâu (String)
Trong Java, String là một đối tượng biểu diễn một chuỗi các giá trị char

Có 2 cách để tạo đối tượng String
- Sử dụng String Literal: Các đối tượng String được lưu trữ trong một khu vực bộ nhớ đặc biệt được gọi là String Constant Pool. Sử dụng String literal giúp cho việc sử dụng bộ nhớ hiệu quả hơn vì nếu chuỗi đã tồn tại trong Pool thì sẽ không có đối tượng mới nào được tạo ra
- Sử dụng từ khóa new: Trong trường hợp này, JVM sẽ tạo ra một đối tượng mới như bình thường trong bộ nhớ Heap và giá trị sẽ được đặt trong Pool. Biến sẽ tham chiếu tới đối tượng trong Heap

## Lớp String
Lớp java.lang.String cung cấp rất nhiều phương thức để sử lý chuỗi. Các phương thức này giúp chúng ta thực hiện nhiều thao tác như so sánh, cắt, ghép, chuyển đổi,...
Một số phương thức

![image](https://user-images.githubusercontent.com/70504465/113968672-bd492500-985d-11eb-88e4-4a4615a25adc.png)