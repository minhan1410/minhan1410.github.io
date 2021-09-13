## Stream
Stream (luồng) là một đối tượng mới của Java được giới thiệu từ phiên bản Java 8, giúp cho việc thao tác trên collection và array trở nên dễ dàng và tối ưu hơn.  
Một Stream đại diện cho một chuỗi các phần tử hỗ trợ các hoạt động tổng hợp tuần tự (sequential) và song song (parallel).  

## Các tính chất của Stream
- Stream không phải một cấu trúc dữ liệu, đầu vào của Stream có thể là các collections(ArrayList, Set, LinkedList,…), Arrays và các kênh input/output  
- Stream không làm thay dổi dữ liệu gốc mà chỉ trả về kết quả thông qua các methods  
- Về cơ bản các method của Stream được chia thành 2 loại là hoạt động trung gian (intermediate Operation) và hoạt động đầu cuối (Terminal Operation)   


![image](https://user-images.githubusercontent.com/70504465/125028498-55031d00-e0b2-11eb-9237-65fe1f3912aa.png)

## Một số phương thức
- filter() giúp lọc các phần tử dựa trên tiêu chí nhất định  
- skip() loại bỏ n phần tử đầu tiên  
- limit() cắt giảm kích thước  
- map() ánh xạ các phần tử tới các kết quả tương ứng  
- sorted() sắp xếp các phần tử theo thứ tự nhất định  
- forEach() duyệt các phần tử   
- collect() giúp thu thập kết quả Stream sang một Collection
- anyMatch() trả về giá trị boolean tuỳ thuộc vào điều kiện được áp dụng  
- allMatch()  trả về true nếu tất cả phần tử đều thoả mãn điều kiện. Nếu một phần tử không thoả điều kiện, những phần tử còn lại sẽ không được kiểm tra.
- noneMatch() ngược lại với allMatch()  
- count() trả về tổng số phần tử
- min(), max() tìm phần tử lớn nhất và nhỏ nhất


