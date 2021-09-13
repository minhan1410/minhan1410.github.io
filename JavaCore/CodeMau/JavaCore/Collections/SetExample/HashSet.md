# HashSet
Lớp HashSet triển khai của interface Set. ĐƯợc sử dụng để tạo một collection sử dụng hash table (bảng băm) để lưu trữ.
Một hash table lưu giữ thông tin bởi sử dụng một kỹ thuật được gọi là hashing (băm). Trong hashing, nội dung mang tính thông tin của một key được sử dụng để quyết định một value duy nhất, được gọi là hash code của nó.
Hash code sau đó được sử dụng như là index, tại đó dữ liệu mà liên kết với key được lưu giữ. Phép biến đổi của key vào trong hash code của nó được thực hiện tự động.
Một số tính năng quan trọng của HashSet:
- Implements Set interface
- Cấu trúc cơ bản cho HashSet là HashTable
- Khi nó triển khai giao diện Set, không có các giá trị trùng lặp
- Các đối tượng được chèn trong HashSet không được đma rbaor sẽ chèn theo cùng một thứ tự. Các đối tượng được chèn dựa theo mã băm của chúng
- Có thể tồn tại phần tử null trong HashSet
- HashSet cũng triển khai các interface có thể phân loại và sao chép được

### Hệ thống phân cấp của HashSet

![image](https://user-images.githubusercontent.com/70504465/122799878-7dd29680-d2ec-11eb-9ffa-0b5b4c4629e8.png)

### Khai báo HashSet
```java
public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
```