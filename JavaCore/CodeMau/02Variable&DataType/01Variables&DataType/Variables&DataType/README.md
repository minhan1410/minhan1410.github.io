# Variable
### Khái niệm
Biến là vùng nhớ dùng để lưu trữ các giá trị của chương trình. Mỗi biến gắn liền với một kiểu dữ liệu và một định danh duy nhất gọi là tên biến.

### Cú pháp
Cú pháp khai báo biến:
`<Kiểu dữ liệu> <Tên biến>;`

Gán giá trị cho biến:
`<Tên biến> = <Giá trị>;`

Hoặc có thể viết gộp như sau:
`<kiểu dữ liệu> <Tên biến> = <Giá trị>;`

### Phân loại
Biến được chia làm hai loại:
- Biến toàn cục: Biến có thể truy xuất ở khắp nơi trong chương trình, thường được khai báo dùng từ khoá public, hoặc đặt chúng trong một class.
- Biến cục bộ: Biến chỉ có thể truy xuất trong khối lệnh nó khai báo

# Kiểu dữ liệu
Kiểu dữ liệu thông thường có thể chia thành hai loại:
- Các kiểu dữ liệu nguyên thuỷ (Primitive type)
- Các kiểu dữ liệu tham chiếu (Reference type)

## Kiểu dữ liệu nguyên thuỷ
### Kiểu số nguyên
Java cung cấp 4 kiểu số nguyên khác nhau là: byte, short, int, long. 

![image](https://user-images.githubusercontent.com/70504465/123027665-70123380-d408-11eb-85e8-ebf92344d65e.png)

### Kiểu số thực
Đối với kiểu dấu chấm động hay kiểu thực, java hỗ trợ hai kiểu dữ liệu là float và double. 
Số kiểu dấu chấm động không có giá trị nhỏ nhất cũng không có giá trị lớn nhất. 


![image](https://user-images.githubusercontent.com/70504465/123027735-8c15d500-d408-11eb-8357-412dc6bc062c.png)

### Kiểu ký tự
Kiểu ký tự trong ngôn ngữ lập trình java có kích thước là 2 bytes và chỉ dùng để biểu diễn các ký tự trong bộ mã Unicode. Như vậy kiểu char trong java có thể biểu diễn tất cả 2^16 = 65536 ký tự khác nhau.
Giá trị mặc định cho một biến kiểu char là null
Giá trị nhỏ nhất của một biến kiểu ký tự là 0 và giá trị lớn nhất là 65535

### Kiểu luận lý
Kiểu boolean chỉ nhận 1 trong 2 giá trị: true hoặc false.
Trong java kiểu boolean không thể chuyển thành kiểu nguyên và ngược lại.
Giá trị mặc định của kiểu boolean là false


## Kiểu dữ liệu tham chiếu
Kiểu reference (Kiểu dữ liệu tham chiếu) là kiểu dữ liệu của đối tượng. 
Một số kiểu dữ liệu cụ thể như mảng (Array), lớp đối tượng (Class) hay kiểu giao tiếp (Interface), kiểu String,…





