# Những điểm cần chú ý khi làm việc với kiểu trong Java

![](images/java-data-types.png)

## Kiểu long là primitive còn Long là object
Object có thể gán null, hoặc là kiểu phần tử trong Collection
```java
long primitiveLong = 10L; //Không thể gán null
Long objectLong = null;  //Có thể gán null

ArrayList<Long> numbers = new ArrayList<>(); //Không thể ArrayList<long> numbers
```

Kiểu Long, Integer, String là final class, không thể kế thừa
```java
public final class Long extends Number implements Comparable<Long>, Constable, ConstantDesc
```

## Không nên so sánh 2 số kiểu dấu phẩy động
```java
double a = 1.4142135623f;
double b = Math.sqrt(2.0);
if (a == b) {  // This is dangerous comparison
  System.out.println("hai số bằng nhau");
} else {
  System.out.println("hai số không bằng nhau");
}
```

## String là kiểu không sửa (immutable), muốn thay đổi phải dùng StringBuilder

Ví dụ hàm đảo chuỗi
```java
public String reverseAString(String inString) {
  StringBuilder sb = new StringBuilder();
  for (int i = inString.length() - 1; i >= 0; i--) {
    sb.append(inString.charAt(i));
  }
  return sb.toString();
}
```

Trong class String có một phương thức transform giúp biến đổi một chuỗi sang chuỗi khác (đảo chuỗi, loại bỏ ký tự đặc biệt) hoặc sang dạng List.

Đảo chuỗi trả về kiểu String
```java
public String reverseAString2(String inString) {
  return inString.transform(str -> {
    StringBuilder sb = new StringBuilder();
    for (char c:str.toCharArray()) {
      sb.insert(0, c);
    }
    return sb.toString();
  });
}
```

Chia một chuỗi thành mảng các từ trả về ```List<String>```
```java
public List<String> splitWords(String inString) {
  return inString.transform(str -> Arrays.asList(str.split("[\\s,]+"))
  );
}
```
