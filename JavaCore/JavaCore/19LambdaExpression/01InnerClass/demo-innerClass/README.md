## Inner Class

Lớp lồng nhau (inner class) trong java là một lớp được khai báo trong lớp (class) hoặc interface khác.  
Chúng ta sử dụng inner class để nhóm các lớp và các interface một cách logic lại với nhau ở một nơi để giúp cho code dễ đọc và dẽ bảo trì hơn.  
Thêm vào đó, nó có thể truy cập tất cả các thành viên của lớp bên ngoài (outer class) bao gồm các thành viên dữ liệu private và phương thức.  
Cú pháp:
```java
public class OuterClass{
    class InnerClass{

    }
}
```
Ta có thể ap dùng với cả interface
