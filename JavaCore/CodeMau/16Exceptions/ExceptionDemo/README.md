# Ngoại lệ (Exception) là gì?
Ngoại lệ là một sự kiện xảy ra trong quá trình thực thi của một chương trình Java, nó làm phá vỡ luồng xử lý bình thường của một chương trình, thậm chí chết chương trình.   
Ngoại lệ sảy ra với nhiều lý do khác nhau, nó nằm ngoài dự tính của chương trình. Nó có thể xảy ra bởi lỗi của người dùng, một số khác bởi lỗi của lập trình viên hoặc lỗi của nguồn dữ liệu vật lý     
Ví dụ điển hình nhất là khi chúng ta viết chương trình chia hai số. Nếu ta cho mẫu số bằng 0 thì sẽ phát sinh ngoại lệ vì thông thường không thể chia một số cho 0

# Các loại exceptions

![image](https://user-images.githubusercontent.com/70504465/123300868-34c94f00-d545-11eb-9ceb-aca283134d76.png)

Thông thường có thể chia exception ra làm hai loại:  
- checked (compile time exceptions)
- unchecked (Runtime exceptions)

## Checked
Là loại exception sảy ra trong lúc compile time. Loại này không thể bỏ qua được trong quá trình compile, mà bắt buộc ta phải xử lý nó

## Unchecked Exception
Là loại exception xảy ra tại thời điểm thực thi chương trình.  Loại exception này được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó.

## Error
Ngoài ra, cần đề cập tới error, đây là những vấn đề quan trọng liên quan đến môi trường thực thi hoặc hệ thống mà lập trình viên không thể kiểm soát. Nó thường làm chết chương trình.  
Error là những ngoại lệ mà chúng ta không thể bắt từ chương trình.   

# Một số exceptions thường gặp
## ArithmeticException
Sảy ra khi chúng ta chia một số bất kỳ cho 0  
Ví dụ:   
```java
int num = 5/0;
System.out.println(num);
```
![image](https://user-images.githubusercontent.com/70504465/123302058-7c9ca600-d546-11eb-8071-1b1b15bd83c8.png)

## NullPointerException
Nếu một bất kỳ biến nào có giá trị null, thực hiện bất kỳ hoạt động nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException.  
Ví dụ:  
```java
String str = null;
System.out.println(str.length());
```
![image](https://user-images.githubusercontent.com/70504465/123302381-ddc47980-d546-11eb-85f3-19c635f37f73.png)

## NumberFormatException
Một biến String có giá trị là các ký tự, chuyển đổi biến này thành số sẽ xảy ra NumberFormatException.  
```java
String str = "Java";
int number = Integer.valueOf(str);
```
![image](https://user-images.githubusercontent.com/70504465/123302641-1fedbb00-d547-11eb-8b3c-56088cbb0c11.png)

## ArrayIndexOutOfBoundsException
Nếu bạn chèn bất kỳ giá trị nào vào index sai, sẽ xảy ra ngoại lệ ArrayIndexOutOfBoundsException.
```java
int array[] = new int[5];
array[-1] = 10;
```

![image](https://user-images.githubusercontent.com/70504465/123302971-765af980-d547-11eb-8ed2-b3c9113f7b69.png)

Ngoài ra còn một số exception đáng kể đến như InputMismatchException, NoSuchElementException, FileNotFoundException, ...