# **@Autowired**

## **Cách inject Bean của Spring**

`@Autowired` đánh dấu cho `Spring` biết rằng sẽ tự động **inject bean** tương ứng vào vị trí được đánh dấu.

```java
@Component
public class Girl {
    // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    @Autowired
    Outfit outfit;

    // Spring sẽ inject outfit thông qua Constructor trước
    public Girl() { }


    // Nếu không tìm thấy Constructor thoả mãn, nó sẽ thông qua setter
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
```

Như ví dụ ở trên tôi đã sử dụng cách [Java Reflection](https://loda.me/articles/huong-dan-java-reflection#26756cb11a134f25a0f0df3f60927fee) để **inject Bean** vào class `Girl`. Nếu không sử dụng `@Autowired` thì bạn phải có một **Constructor** thay thế, hoặc một **Setter** tương ứng.

Sau khi tìm thấy một class đánh dấu `@Component` thì quá trình **inject Bean** xảy ra theo cách như sau:

1. **Nếu Class `không có` hàm Constructor hay Setter** thì sẽ sử dụng [Java Reflection](https://loda.me/articles/huong-dan-java-reflection#26756cb11a134f25a0f0df3f60927fee) để đưa đối tượng vào thuộc tính có đánh dấu `@Autowired`

2. **Nếu `có` hàm Constructor hoặc hàm Setter** thì sẽ **inject Bean** vào bởi tham số của hàm

Bạn cũng có thể gắn `@Autowired` lên trên **method**, thay vì **thuộc tính**, chức năng cũng vẫn tương tự, nó sẽ tìm **Bean** phù hợp với **method** đó và truyền vào.

```java
@Component
public class Girl {
    // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    Outfit outfit;

    // Spring sẽ inject outfit thông qua Constructor trước
    public Girl() { }


    // Nếu không tìm thấy Constructor thoả mãn, nó sẽ thông qua setter
    @Autowired
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
```

## **Vấn đề của @Autowired**

Khi `Spring Boot` có chứa **2 Bean** cùng loại trong **Context** thì `Spring` sẽ bối rối và không biết sử dụng **Bean** nào để **inject** vào đối tượng.

Class **Outfit** có 2 kế thừa là **Bikini** và **Naked**

```java
import org.springframework.stereotype.Component;

public interface Outfit {
    public void wear();
}

/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/

@Component
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}


@Component
public class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}
```

Class `Girl` yêu cầu **inject** một `Outfit` vào cho mình

```java
/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/

public class Girl {
    /* @Autowired đánh dấu cho Spring biết rằng sẽ tự động inject bean tương ứng vào vị trí được đánh dấu. */

    @Autowired
    Outfit outfit;
}
```

Lúc này khi chạy chương trình `Spring Boot` sẽ báo lỗi như sau:

```
***************************
APPLICATION FAILED TO START
***************************

Description:

Field outfit in com.example.code.Girl required a single bean, but 2 were found:
	- bikini: defined in file [D:\Techmaster\minhan1410.github.io\SpringBoot\TaiLieu\Markdown\Lesson4_@Autowired_@Primary_@Qualifier\code\target\classes\com\example\code\Bikini.class]
	- naked: defined in file [D:\Techmaster\minhan1410.github.io\SpringBoot\TaiLieu\Markdown\Lesson4_@Autowired_@Primary_@Qualifier\code\target\classes\com\example\code\Naked.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
```

Đại khái là, trong quá trình cài đặt, nó tìm thấy 2 đối tượng thoả mãn `Outfit`. Giờ nó không biết sử dụng cái nào để **inject** vào trong `Girl`

# **@Primary**

`@Primary` là **annotation** đánh dấu trên một **Bean**, giúp nó luôn được ưu tiên lựa chọn trong trường hợp có nhiều **Bean** cùng loại trong **Context**.

```java
/*
 Đánh dấu class bằng @Component
 Class này sẽ được Spring Boot hiểu là một Bean (hoặc dependency)
 Và sẽ được Spring Boot quản lý
*/

@Component
@Primary
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}
```

Lúc này `Spring Boot` đã ưu tiên `Bikini` và **inject** nó vào `Girl`

```java
@SpringBootApplication
public class CodeApplication {

    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        ApplicationContext context = SpringApplication.run(CodeApplication.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        Girl girl = context.getBean(Girl.class);

        System.out.println("Girl Instance: " + girl);

        System.out.println("Girl Outfit: " + girl.outfit);

        girl.outfit.wear();
    }

}
```

```
Girl Instance: com.example.code.Girl@40e4ea87
Girl Outfit: com.example.code.Bikini@58783f6c
Mặc bikini
```

# **@Qualifier**

`@Qualifier `xác định tên của một **Bean** mà bạn muốn chỉ định **inject**.

```java
@Component("Bikini")
public class Bikini implements Outfit {
    @Override
    public void wear() {
        System.out.println("Mặc bikini");
    }
}

@Component("Naked")
public class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang không mặc gì");
    }
}

@Component
public class Girl {
    /* 
        Spring Boot sẽ tìm Bean có @Qualifier("Naked") trong context để inject 
        @Autowired đánh dấu cho Spring biết rằng sẽ tự động inject bean tương ứng vào vị trí được đánh dấu.
    */

    @Qualifier("Naked")
    @Autowired
    Outfit outfit;
}
```

Lúc này `Spring Boot` sẽ tìm **Bean** có `@Qualifier("Naked")` trong **context** để **inject**

```java
@SpringBootApplication
public class CodeApplication {

    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        ApplicationContext context = SpringApplication.run(CodeApplication.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        Girl girl = context.getBean(Girl.class);

        System.out.println("Girl Instance: " + girl);

        System.out.println("Girl Outfit: " + girl.outfit);

        girl.outfit.wear();
    }

}
```

```
Girl Instance: com.example.code.Girl@4d157787
Girl Outfit: com.example.code.Naked@68ed96ca
Đang không mặc gì
```
