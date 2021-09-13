## For looping
Vòng lặp for trong java được sử dụng để lặp một phần của chương trình nhiều lần

Cú pháp:
```java
for (<Khởi tạo biến>; <Điều kiện>; <Tăng/giảm biến>){
     <Khối lệnh>;
}
```

![image](https://user-images.githubusercontent.com/70504465/117866689-9c8f4780-b2c1-11eb-9f7c-f5ba865197de.png)

Khi gặp vòng lặp for, đầu tiên nó sẽ tiến hành khởi tạo biến, bước này chỉ thực hiện một lần duy nhất
Sau đó tiến hành kiểm tra điều kiện. 
+ Nếu điều kiện lặp đúng (`true`), khối lệnh bên trong vòng lặp được thực hiện.
+ Nếu điều kiện lặp sai (`false`), thoát khỏi vòng lặp.
Sau khi thực hiện khối lệnh trong for, sang đến bước tăng/giảm biến. sau khi tăng/giảm biến, sẽ quay lại kiểm tra điều kiện lặp. Nếu điều kiện vẫn đúng, ta lại tiếp tục lặp lại các bước trên. Quá trình này sẽ thực hiện đi thực hiện lại cho đến khi điều kiện lặp sai.
  