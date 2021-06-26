# Tại sao phải xử lý ngoại lệ
Xử lý ngoại lệ (Exception Handling) trong java là một cơ chế xử lý các lỗi runtime để có thể duy trì luồng bình thường của ứng dụng.  

Quá trình xử lý exception được gọi là catch exception, nếu Runtime System không xử lý được ngoại lệ thì chương trình sẽ kết thúc.  

# Cú pháp xử lý ngoại lệ
### Khối lệnh try catch  
```java
try {
    // code có thể ném ra ngoại lệ
} catch(Exception_class_Name e) {
    // code xử lý ngoại lệ
}
```
### Khối lệnh try finally
```java
try {  
    // code có thể ném ra ngoại lệ
} finally {
    // code trong khối này luôn được thực thi
} 
```
### Khối lệnh try catch finally
```java
try {
    // code có thể ném ra ngoại lệ
} catch(Exception_class_Name e) {
    // code xử lý ngoại lệ
} finally {
    // code trong khối này luôn được thực thi
} 
```

# Một số phương thức của lớp Exception
- getMessage(): trả về một message cụ thể về exception đã sảy ra
- getCause(): Trả về nguyên nhân xảy ra exception
- toString(): Trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
- printStackTrace(): In ra kết quả của phương thức toString cùng với stack trace đến System.err
- fillInStackTrace(): Làm đầy stack trace của đối tượng Thowable bằng stack trace hiện tại
