# Set interface
Set interface nằm trong gói java.util và kế thừa Collection interface. Nó là tập hợp các đối tượng không có thứ tự trong đó không chứa các giá trị trùng lặp
Set interface được khai báo:
```java
public interface Set extends Collection 
```

Vì Set là một interface nên không thể tạo đối tượng có kiểu Set. Chúng ta cần sử dụng các lớp kế thừa để tạo đối tượng:
```java
// Obj is the type of the object to be stored in Set 
Set<Obj> set = new HashSet<Obj> (); 
```

### Các phương thức trong Set
- `add(element)`: Được sử dụng để thêm một phần tử cụ thể vào set. Phương thức này chỉ được thực hiện nếu phần tử chưa có danh sách và trả về false nếu phần tử đó đã có trong Set.
- `addAll(collection)` : Được sử dụng để nối tất cả các phần tử từ collection chỉ định vào Set hiện có. các phần tử được thêm một cách ngẫu nhiên mà không tuân theo thứ tự nào.
- `clear()` : Được sử dụng để xoá toàn bộ phần tử ra khỏi Set
- `contains(element)`: Được sử dụng để kiểm tra xem một phần tử cụ thể có trong tập hợp hay không
- `containsAll(collection)`: Được sử dụng để kiểm tra xem set có chứa tất cả các phần tử trong collection được chỉ định hay không. Nếu có nó sẽ trả về true và ngược lại trả về false
- `hashCode()`: Sử dụng để lấy giá trị hashCode 
- `isEmpty()` : Được sử dụng để kiểm tra Set có rỗng hay không
- `iterator()`: Được sử dụng để trả về trình lặp của Set. Các phần tử từ tập hợp được trả về theo thứ tự ngẫu nhiên.
- `remove()` : Được sử dụng để loại bỏ phần tử được chỉ định ra khỏi Set. Phương thức này trả về true nếu ohaanf tử đó có trong Set và trả về false nêu không.
- `removeAll()`: Được sử dụng để loại bỏ tất cả cacs phần tử thuộc collection được chỉ định ra khỏi Set.
- `retainAll(collection)`: Phương thức này được sử dụng để giữ lại các phần tử có trong collection được chỉ định.
- `size()`: Sử dụng để lấy kích thước của Set
- `toArray()`: Được sử dụng để tạo một mảng gồm các phần tử giống như của Set