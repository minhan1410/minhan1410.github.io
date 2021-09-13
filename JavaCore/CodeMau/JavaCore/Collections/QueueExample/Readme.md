# Queue interface trong Java
Queue interface nằm trong package java.util và kế thừa Collection interface. Nó được sử dụng để lưu trữ các phần tử theo thứ tự FIFO (First In First Out - Vào trước ra trước).
![image](https://user-images.githubusercontent.com/70504465/122674485-a6c92d80-d1ff-11eb-9ef4-bef3c2258357.png)

Là một interface, queue cần một lớp cụ thể để khai báo và các lớp phổ biến nhất là PriorityQueue và LinkedList. Tuy nhiên hai cách triển khai này đều không an toàn cho luồng. PriorityBlockingQueue là một triển khai thay thế nếu cần triển khai luồng an toàn cho luồng

### Khởi tạo queue
```java
Queue<Obj> queue = new PriorityQueue<Obj> ();
```

### Các phương thức trong Queue interface
- `add(element)` được sử dụng để thêm các các phần tử vào cuối hàng đợi. Cụ thể là cuối danh sách nếu nó được sử dụng hoặc tuỳ vào mức độ ưu tiên 
- `element()` method này tương tự method `peek()`. Nó sẽ ném ra ngoại lệ NoSuchElementException khi queue rỗng.
- `offer(element)` được sử dụng để chèn một phần tử vào queue. Method này thích hợp hơn method `add()` vì nó không ném ra ngoại lệ khi dung lượng container đầy, mà thay vào đó nó trả về false
- `peek()` được sử dụng để truy xuất phần tử đầu tiên của hàng đợi mà không cần xoá nó. Nó sẽ trả về null nếu queue rỗng
- `poll()` được sử dụng để trả về phần tử đầu tiên của hàng đợi và xoá nó khỏi queue. Nó sẽ trả về null nếu queue rỗng.
- `remove()`được sử dụng để trả về phần tử đầu tiên của hàng đợi và xoá nó khỏi queue. Nó sẽ ném ra ngoiaj lệ NoSuchElementException nếu queue rỗng


# PriorityQueue
Một PriorityQueue được sử dụng khi các đối tượng cần được sử lý theo mức độ ưu tiên. Queue (Hàng đợi) tuân theo thuật toán FIFO, nhưng đối khi phần tử của hàng đợi cần được sử lý theo mức độ ưu tiên, đó là khi PriorityQueue được phát huy tác dụng. 
Các phần tử của PriorityQueue được sắp xếp theo thứ tự tự nhiên hoặc bởi Comparator được cung cấp tại thời điểm xây dựng queue, tuỳ thuộc vào contrucstor nào sẽ được sử dụng.
Một số điểm quan trọng về PriorityQueue:
- PriorityQueue không cho phép null 
- Không thể tạo PriorityQueue cho các đối tượng không thể so sánh
- PriorityQueue là hàng đợi không bị ràng buộc
- Phần tử đầu tiên của queue là phần tử ít liên quan đến thứ tự được chỉ định nhất. 
- Vì PriorityQueue không phải là thread-safe, do đó Java cung cấp lớp PriorityBlockingQueue để triển khai BlockingQueue interface để sử dụng trong môi trường đa luồng
- Các phương thức poll, remove, peek truy cập tới phần tử ở đầu queue.
- Nó kế thừa các phương thức từ lớp AsbtractQueue, AsbtractCollection, Collection và Object.

### Constructor:
1. PriorityQueue(): Tạo một PriorityQueue với dung lượng ban đầu mặc định là 11 để sắp xếp các phần tử theo thứ tự tự nhiên của chúng
```java
PriorityQueue<E> pq = new PriorityQueue<E>();
```

2. PriorityQueue(Collection<E> c): Tạo một PriorityQueue chứa các phần tử trong Collection được chỉ định
```java
PriorityQueue<E> pq = new PriorityQueue<E>(Collection<E> c);
```

3. PriorityQueue(int initialCapacity): Tạo một PriorityQueue với dung lượng ban đầu được chỉ định để sắp xếp các phần tử của nó theo thứ tự tự nhiên của chúng
```java
PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity);
```

4. PriorityQueue(int initialCapacity, Comparator<E> comparator): Tạo một PriorityQueue với dung lượng ban đầu được chỉ định để sắp xếp các phần tử của nó theo Comparator
```java
PriorityQueue<E> pq = new PriorityQueue(int initialCapacity, Comparator<E> comparator);
```

5. PriorityQueue(PriorityQueue<E> c): Tạo một PriorityQueue chứa các phần tử trong priority queue đã được chỉ định
```java
PriorityQueue<E> pq = new PriorityQueue(PriorityQueue<E> c);
```

6. PriorityQueue(SortedSet<E> c): Tạo một PriorityQueue chứa các phần tử trong SortedSet đã được chỉ định
```java
PriorityQueue<E> pq = new PriorityQueue<E>(SortedSet<E> c);
```

### Các phương thức trong PriorityQueue
- `add(E e)`: Chèn phần tử vào queue
- `clear()`: Xoá toàn bộ phần tử khỏi queue
- `comparator()`: Trả về bộ so sánh được sử dụng để sắp xếp thứ tự các phần tử trong hàng đợi này hoặc null nếu hàng đợi này được sắp xếp theo thứ tự tự nhiên của các phần tử của nó.
- `contains(Object o)`: Trả về true nếu hàng đợi này chứa phần tử được chỉ định.
- `forEach(Consumer<? super E> action)`: Thực hiện hành động đã cho cho từng phần tử của có thể lặp lại cho đến khi tất cả các phần tử đã được xử lý hoặc hành động ném ra một ngoại lệ
- `iterator()`: Trả về một trình lặp trên các phần tử trong hàng đợi này.
- `offer(E e)`: Chèn phần tử được chỉ định vào queue. 
- `remove(Object o)`: Xoá một phần tử ra khỏi queue.
- `removeAll(Collection<?> c)`: Loại bỏ tất cả các phần tử của collection thoả mãn fitler
- `retainAll(Collection<?> c)`: Chỉ giữ lại các phần tử trong collection này được chứa trong tập hợp đã chỉ định (thao tác tùy chọn).
- `spliterator()`: Tạo một Spliterator ràng buộc các phần tử trong queue.
- `toArray()`: Trả về một mảng chứa tất cả các phần tử trong queue
- `toArray(T[] a)`: Trả về một mảng chứa tất cả các phần tử trong hàng đợi này; kiểu của mảng được trả về là kiểu của mảng được chỉ định