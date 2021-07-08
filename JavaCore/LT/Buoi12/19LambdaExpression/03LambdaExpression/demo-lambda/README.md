## Lambda Expression

Lamba Expression là một hàm không có tên với các tham số và nội dung thực thi. Nội dung thực thi của Lambda có thể là một khối lệnh hoặc 1 biểu thức  
Cú pháp:
```java
// Không có tham số, có một câu lệnh
() -> expression
 
// Có một tham số, một câu lệnh
(parameters) -> expression 
 
// nhiều tham số và nội dung khối
(arg1, arg2, ...) -> { 
    body-block 
}
 
// có các tham số, nội dung khối và return
(arg1, arg2, ...) -> { 
    body-block;
    return return-value; 
} 
```

## Tại sao lại sử dụng lambda
- Giúp code ngắn gọn hơn, đặc biệt là khi sử dụng với functional interface
- Hiệu quả hơn khi sử dụng với Stream