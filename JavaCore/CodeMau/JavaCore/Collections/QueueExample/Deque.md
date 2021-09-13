# Deque interface
Deque interface nằm trong package java.util là một subtype của queue interface. Nó hỗ trợ loại bỏ phần tử ở cả hai đầu. Deque là viết tắt của từ double ended queue. Nó có thể được sử dụng như một queue hoặc stack
Deque interface được khai báo:
```java
public interface Deque extends Queue
```

Vì Deque là một interface nên không thể tạo đối tượng có kiểu deque. Thay vào đó chúng ta có thể sử dụng lớp ArrayDeque
```java
// Obj is the type of the object to be stored in Deque
Deque<Obj> deque = new ArrayDeque<Obj> ();
```
### Các phương thức của Deque interface
Ưu điểm chính của Deque là có thể sử dụng nó như cả Queue và Stack. Các phương thức trong Deque
- `add()` sử dụng để thêm phần tử
- Để thêm vào đầu danh sách ta có thể sử dụng `addFirst()` hoặc `offerFisrt()`. Khác biệt giữa hai phương thức này là nếu thao tác thất bại, `addFirst()` sẽ ném ra ngoại lệ, còn `offerFirst()` sẽ return false 
- Để thêm vào cuối danh sách ta có thể sử dụng `addLast()` hoặc `offerLast()`. Khác biệt giữa hai phương thức này tương tự hai phương thức trên.
- Để truy xuất phần tử ở đầu danh sách ta sử dụng phương thức `getFirst()` hoặc `peekFirst()`. Khác biệt giữa hai phương thức này là nếu danh sách rỗng `getFirst()` sẽ ném ra ngoại lệ còn `peekFirst()` return null.
- Để truy xuất phần tử ở cuối danh sách ta sử dụng phương thức `getLast()` hoặc `peekLast()`. Khác biệt giữa ai phương thức này tương tự hai phương thức trên.
- Để truy xuất và loại bỏ phần tử ở đầu danh sách ta sử dụng phương thức `removeFirst()` hoặc `pollFirst()`. Khác biệt giữa hai phương thức là nếu danh sách rỗng, `removeFirst()` sẽ ném ra ngoại lệ còn `pollFirst()` return null
- Để truy xuất và loại bỏ phần tử ở cuối danh sách ta sử dụng phương thức `removeLast()` hoặc  `pollLast()`. Khác biệt giữa hai phương thức này tương tự hai phương thức trên

### Đặc điểm của Deque
- Deque có thể chứa các phần tử null, tuy nhiên không nên chèn phần tử null vì nhiều phương thức trả về null để cho biết deque rỗng
- Deque có chứa các phần tử trùng lặp
- Không thể truy xuất 1 phần tử ở vị trí bất kỳ của deque. 
- Có thể sử dụng phương thức removeFirstOccurrence(E e), removeLastOccurrence(E e) và remove(E e) để xoá phần tử khỏi deque
- Các lớp implements Deque interface là LinkedList, ArrayDeque

# ArrayDeque
ArrayDeque cung cấp một cách để áp dụng mảng có thể thay đổi kích thước ngoài việc triển khai Deque interface. Nó còn được gọi là Array Double Ended Queue hoặc Array Deck. 
Đây là một loại mảng đặc biệt cho phép người dùng thêm và bớt phần tử từ cả hai đầu.

### Một số tính năng quan trọng của ArrayDeque
- ArrayDeque không có giới hạn về dung lượng và chùng phát triển khi cần thiết để hỗ trợ việc sử dụng.
- ArrayDeque không an toàn khi sử dụng với thread 
- Các phần tử null bị cấm trong ArrayDeque
- Lớp ArrayDeque có thể nhanh hơn Stack khi sử dụng như một ngăn xếp
- Lớp ArrayDeque có thể nhanh hơn LinkedList khi sử dụng như một hàng đợi

### Phân cấp của ArrayDeque
![img.png](img.png)
```java
public class ArrayDeque<E> extends AbstractCollection<E> implements Deque<E>, Cloneable, Serializable
```

### Constructor
1. `ArrayDeque()` : Constructor này được sử dụng để tạo một ArrayDeque rỗng và theo mặc định có dung lượng ban đầu để chứa 16 phần tử
```java
ArrayDeque<E> dq = new ArrayDeque<E>();
```

2. `ArrayDeque(Collection<? extends E> c)` : Constructor này được sử dụng để tạo một ArrayDeque chứa tất cả các phần tử của collections được chỉ định
```java
ArrayDeque<E> dq = new ArrayDeque<E>(Collection col);
```

3. `ArrayDeque(int numofElements)` : Constructor này được sử dụng để tạo một ArrayDeque trống, có khả năng chứa một số phần tử đucợ chỉ định
```java
ArrayDeque<E> dq = new ArrayDeque<E>(int numofElements);
```