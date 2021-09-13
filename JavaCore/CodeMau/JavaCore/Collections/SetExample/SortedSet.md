# SortedSet
SortedSet interface kế thừa từ Set interface nên nó cũng có các đặc điểm của Set đó là các phần tử trong SortedSet là duy nhất. 
Ngoài ra, SortedSet có điểm vượt trội hơn Set là thứ tự các phần tử trong SortedSet được sắp xếp theo thứ tự tăng dân hoặc giảm dần(mặc định sẽ là tăng dần).
![image](https://user-images.githubusercontent.com/70504465/122804294-eff9aa00-d2f1-11eb-9e80-26cb136a3c9f.png)

### KHai báo SortesSet:
```java
public interface SortedSet extends Set
```
Vì SortedSet là interface nên không thể tạo đối tượng có kiểu là SortedSet được mà cần phải thông qua một lớp ví dụ như TreeSet.
```java
// Obj is the type of the object to be stored in SortedSet
SortedSet<Obj> set = new TreeSet<Obj> ();
```
