## Cấu trúc switch - case
```java
switch (<Biến>){
    case <Giá trị 1>:
        <Khối lệnh 1>;
        break;
    case <Giá trị 2>:
        <Khối lệnh 2>;
        break;
    ...
     case <Giá trị n>:
        <Khối lệnh n>;
        break;

    default:
        <Khối lệnh>;
        break;
}

```

![image](https://user-images.githubusercontent.com/70504465/117859389-1ff86b00-b2b9-11eb-90b2-93d75ebfddea.png)

## Hoạt động của switch-case như sau:
Switch sẽ kiểm tra giá trị của biến `variable` (nằm trong ngoặc đơn sau switch kia), và so sánh biến với từng giá trị khác nhau, lần lượt từ trên xuống dưới, mỗi giá trị cần so sánh gọi là một `case`.

Ở đoạn code trên, các giá trị để so sánh với biến `variable` là `value 1`, `value 2`. Khi một trường hợp đúng (`true`), khối lệnh ở trong `case` đó sẽ được thực thi.


Nếu tất cả các trường hợp đều sai (tức là các `value` ở `case` không bằng với biến `variable`), thì khối lệnh ở trong `default` sẽ được thực thi.


Lưu ý là khối `default` là không bắt buộc có ở cấu trúc switch case trong Java, tức là bạn có thể viết cũng được mà không viết cũng không bị lỗi.

 
Trong một `switch` có thể có rất nhiều `case`, nói chung là bao nhiêu `case` cũng được.


Khi thấy một case đúng, khối lệnh trong case đó sẽ được chạy.


Nếu không gặp lệnh `break` trong khối lệnh này, thì chương trình sẽ thực hiện tiếp các `case` bên dưới cho tới khi nó gặp lệnh `break` thì nó sẽ thoát ra khỏi switch.

 
Giả sử mà `switch` không có lệnh `break` nào, thì nó sẽ thực hiện đến khi không còn khối lệnh nào để chạy.

_**Lưu ý!**_ : Giá trị trong case phải là một giá trị cụ thể, không thể thực hiện phép toán so sánh hay tính toán trong case.

