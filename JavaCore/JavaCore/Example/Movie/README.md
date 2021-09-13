## Mô tả quản lý trang web xem phim
Quản lý thông tin các phim ta sẽ cần có id, tên phim, thể loại, đạo diễn, ngôn ngữ, năm công chiếu, nhà làm phim, thời lượng.  

## Bài toán
Các công việc có thể sảy ra trong quá trình quản lý các bộ phim như tìm kiếm phim  (tìm theo tên, thể loại, ...)  

Tại đây mình đã thực hiện tìm kiếm phim theo tên, thể loại và ngôn ngữ  
Sắp xếp phim theo tên   
Để sắp xếp phim ta sử dụng Comparable hoặc Comparator  
## Sorting trong collections
Lớp Collections cung cấp các phương thức static để sắp xếp các phần tử của collection. Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap. Nhưng chúng ta không thể sắp xếp các phần tử của List. Collections cung cấp phương thức sort() để phân sắp xếp các phần tử của List.  
![image](https://user-images.githubusercontent.com/70504465/123612158-8109dd00-d82c-11eb-9be8-028b2c0342ed.png)

### Collections.sort(List list)

public void sort(List list): được sử dụng để sắp xếp các phần tử của List.  
Ví dụ sắp xếp đối tượng String
```java
// create list
List<String> list = new ArrayList<String>();
// add elements to list
list.add("Java");
list.add("C");
list.add("C++");
list.add("PHP");
list.add("Python");
// sort list
Collections.sort(list);
```


## Comparable interface
Là một interface trong java, được sử dụng để sắp xếp các đối tượng của lớp do người dùng tự định nghĩa.    
interface này có duy nhất một phương thức compareTo(), có kiểu trả về là int. Nó có thể trả về một số nguyên âm nếu đối tượng đã cho nhỏ hơn đối tượng chỉ định, trả về 0 nếu bằng nhau hoặc trả về số nguyên dương nếu đối tượng đã cho lớp hơn đối tượng chỉ định
```java
public int compareTo(T o);
```
Chúng ta có thể sắp xếp các phần tử của:  

- Các đối tượng String.  
- Các đối tượng của lớp Wrapper.  
- Các đối tượng của lớp do người dùng định nghĩa (User-defined).  


## Comparator interface
Là một interface được sử dụng để sắp xếp các đối tượng của lớp do người dùng tự định nghĩa.
Comparator có 2 phương thức là compare(Object obj1,Object obj2) và equals(Object element)  
```java
int compare(T o1, T o2);
```
```java
boolean equals(Object obj);
```

Chúng ta có thể sắp xếp các phần tử của:  

-  Các đối tượng String.  
-  Các đối tượng của lớp Wrapper.  
-  Các đối tượng của lớp do người dùng định nghĩa (User-defined).  

Tham khảo thêm tại đây: https://github.com/EriChannel/JavaCore/tree/main/JavaCore_3/Collections/Comparator%26Comparable

## Hãy thực hiện thêm các công việc sau:
Thực hiện tìm phim theo tên, thể loại, ngôn ngữ, nêu không có thì thông báo không có phim đó  
Tìm kiếm phim theo tên tác giả  
Sắp xếp các phim theo sự tăng dần của thời lượng   
Sắp xếp phim theo thời gian công chiếu  
Liệt kê các loại ngôn ngữ và số lượng phim theo từng loại ngôn ngữ đó  

