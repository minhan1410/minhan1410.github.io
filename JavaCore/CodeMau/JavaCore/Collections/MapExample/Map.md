# Map interface
Trong java, map được sử dụng để lưu trữ và truy xuất dữ liệu theo cặp khóa (key) và giá trị (value). Mỗi cặp key và value được gọi là entry.

Map chỉ chứa các giá trị key duy nhất, không  chứa các key trùng lặp.

Các lớp cài đặt (implements) Map interface là HashMap, LinkedHashMap and TreeMap.

- HashMap không đảm bảo thứ tự các entry được thêm vào.
- LinkedHashMap đảm bảo thứ tự các entry được thêm vào.
- TreeMap duy trình thứ tự các phần tử dựa vào bộ so sánh Comparator.


![image](https://user-images.githubusercontent.com/70504465/122809670-9ba5f880-d2f8-11eb-9eac-ea86da8ea61e.png)

## Map.Entry interface
Entry là một interface con của Map. Vì vậy, chúng ta được truy cập nó bằng tên Map.Entry. Nó cung cấp các phương pháp để truy xuất các key và value.
Nó được định nghĩa như sau:

```java
public interface Map<K,V> {
    interface Entry<K,V> {
 
    }
}
```
