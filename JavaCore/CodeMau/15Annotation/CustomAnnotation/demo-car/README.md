## Custom Annotation

Đối với JSON, mình sẽ tạo một annotation cho phép dev đánh dấu các trường được đưa vào khi tuần tự hoá một đối tượng.   
Ví dụ, nếu tạo một class Car, chúng ta có thể chú thích các trường của car bằng chú thích của mình.  
Để đơn giản, mình sẽ giả định rằng annotaion này sẽ chỉ được sử dụng với các thuộc tính kiểu String.  

Để tạo annotaion, chúng ta cần sử dụng đến từ khoá @interface.

`public @interface JsonField`

## Sử dụng custom annotation vừa tạo
Để sử dụng annotation vừa tạo, ta chỉ cần đặt nó trước một cấu trúc thích hợp (tuỳ vào target mà ta đã đặt như với field, method, constructor,... )  
Trong ví dụ này mình tạo một class Car. Trong class này thực hiện hai cách sử dụng chính của `@JsonField`: 
- Sử dụng với giá trị rõ ràng  
- Sử dụng với giá trị mặc định     
Giờ mình muốn thông tin được in dưới dạn JSON như sau: `{"manufacturer":"someMake", "model":"someModel"}`, ta có thể áp dụng Map trong trường hợp này 

## Annotation được xử lý như thế nào?

Chúng ta có thể lặp lại từng trường của lớp được liên kết với đối tượng đucợ truyền cho phương thức của chúng ta và tìm ra trường nào được chú thích bằng annotation @JsonField. Nếu trường nào được chú thích bằng @JsonField thì ghi lại tên trường và giá trị cả nó. Khi tất cả các trường đã được xử lý, chúng ta có thể tạo chuỗi JSON bằng cách sử dụng tên trường và các giá trị của nó.

## Kết quả
Kết quả mà ta nhận được là
`{"model":"F150","manufacturer":"Ford"}`
Vì chỉ có make và model được đánh dấu vởi @JsonField, còn year thì không.