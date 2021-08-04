# Annotation

Là một thẻ đại diện cho siêu dữ liệu tức là nó được gắn với lớp, interface, phương thức hoặc các trường để chỉ định một số thông tin cụ thể được sử dụng bởi trình biên dịch Java và JVM  

## Các Annotation được sử dụng để
- Chỉ dẫn cho trình biên dịch  
- Chỉ dẫn trong thời điểm biên dịch  
- Chỉ dẫn trong thời gian chạy  

## Các loại Annotation
### Các Annotation được tích hợp sẵn 
Có thể kể đến như: @Override, @SuppressWarnings, @Deprecated đây là các annotation được tích hợp sẵn trong code java    
Hoặc annotation đucợ tích hợp sẵn đucợ sử dụng trong annotation khác như: @ Target, @Retention, @Inherited, @Documented    

@Retention : dùng để chú thích mức độ tồn tại của annotation nào đó  
@Target : Dùng để chú thích cho một annotation khác và annotation đó sẽ được sử dụng trong phạm vị nào   
@Inherited: Theo mặc định, các annotation không được kế thừa cho lớp con. @Inherited đánh dấu chú thích sẽ được kế thừa cho các lớp con   
@Documented: Đánh dấu chú thích để đưa vào tài liệu  
### Annotation tuỳ chỉnh (Custom annotation)
Để tự định nghĩa một annotation ta sử dụng @intrface là từ kháo khai báo một Annotion, nó khá giống một interface  
Đặc điểm của các phần tử (element) của annotation:  
- Không có thân hàm  
- Không có tham số hàm  
- Khai báo trả về phải là một kiểu cụ thể:  

+ Các kiểu nguyên thủy (boolean, int, float, …)  
+ Enum  
+ Annotation  
+ Class (Ví dụ String.class)  
- Có thể có giá trị mặc định.  

Tham khảo: https://loda.me/java-huong-dan-tu-tao-mot-annotations-loda1554297400922/
