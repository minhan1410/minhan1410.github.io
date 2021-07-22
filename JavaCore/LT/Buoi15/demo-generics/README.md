## Generics là gì?
Generics có thể được hiểu là tham số hoá kiểu dữ liệu. Ý tưởng là cho phép các kiểu dữ liệu là một tham số cho các phương thức, lớp và interface. Sử dụng generics có thể tạo các lớp hoạt động với các kiểu dữ liệu khác nhau.  
Một entity như lớp, interface hoặc phương thức hoạt động trên kiểu tham số hoá được gọi là generic entity  

## Tại nào lại sử dụng generics?
*An toàn*: Chúng ta có thể có một loại đối tượng duy nhất trong generics. Nó không cho phép lưu trữ các đối tượng khác  
```java
//Không có generics, chúng ta có thể lưu trữ bất kỳ loại đối tượng nào
List list = new ArrayList();    
list.add(10);  
list.add("10");

//Với generics, bắt buộc chỉ định loại đối tượng mà chúng ta cần lưu trữ
List<Integer> list = new ArrayList<Integer>();    
list.add(10);  
list.add("10");// compile-time error  
```
*Không cần thực hiện ép kiểu*
```java
//KHi không có generics, chúng ta phải thực hiện ép kiểu
List list = new ArrayList();    
list.add("hello");    
String s = (String) list.get(0);//typecasting   

//Với generics, ta không cần ép kiểu
ist<String> list = new ArrayList<String>();    
list.add("hello");    
String s = list.get(0);  
```

*Kiểm tra compile time*: Nó được kiểm tra tại compile time nên sự cố sẽ không sảy ra trong lúc runtime. Chiến lược lập trình tốt cho biết xử lý vấn đề tại compile time tốt hơn nhiều so với runtime

```java
List<String> list = new ArrayList<String>();    
list.add("hello");    
list.add(32);//Compile Time Error    
```

## Một số quy ước đặt tên kiểu Generics
- E: Element 
- K: Key 
- V: Value 
- N: Number 
- T: Type 

## Wildcard
`<?>` : Chấp nhận mọi kiểu của đối tượng  
`<? extends type>`: Chấp nhận bất kỳ đối tượng nào miễn là đối tượng đó kế thừa từ type   
`<? super type>` : chấp nhận bất kỳ đối tượng nào miễn là đối tượng đó là cha của type  