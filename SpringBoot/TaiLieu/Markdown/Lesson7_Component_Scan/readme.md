# **Component Scan**

Trong [bài 1](../Lesson1_DI_IOC.md) tôi có đề cập một lần về việc **Spring Boot** khi chạy sẽ dò tìm` toàn bộ các Class cùng cấp` hoặc `ở trong các package thấp hơn` và `tạo ra Bean từ các Class tìm thấy`.

Cấu trúc thư mục:

![img](packages.jpg)

Tôi tạo ra 2 Bean:

1. **Girl** nằm cùng **package** với **DemoApplication**
2. **OtherGirl** nằm ở **package other** (**other** cùng cấp với **DemoApplication**)

`Girl.java`

```java
@Component
public class Girl {
    @Override
    public String toString() {
        return "Girl.java";
    }
}
```

`OtherGirl.java`

```java
@Component
public class OtherGirl {
    @Override
    public String toString() {
        return "OtherGirl.java";
    }
}
```

`DemoApplication.java`

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if (otherGirl != null) {
                System.out.println("Bean: " + otherGirl.toString());
            }
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }
    }
}
```

`Output`

```
Bean: Girl.java
Bean: OtherGirl.java
```

Kết quả in ra màn hình là **cả 2 bean Girl và OtherGirl** đều được tạo ra trong **Context**.

Điều này chứng tỏ **Spring Boot** đã đi tìm các **Bean** bên cạnh **class DemoApplication** và những **package** con bên cạnh **DemoApplication**

## **Trong trường hợp bạn muốn tuỳ chỉnh cấu hình cho Spring Boot chỉ tìm kiếm các bean trong một package nhất định thì có các cách sau đây:**

<details>
  <summary markdown="span">
    1. Sử dụng <b>@ComponentScan</b>
  </summary>

`Sửa file DemoApplication.java thành`

```java
@ComponentScan(basePackages = "com/example/demo/other")
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if (otherGirl != null) {
                System.out.println("Bean: " + otherGirl.toString());
            }
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }
    }
}
```

</details>

<details>
    <summary markdown="span">
        2. Sử dụng <b>scanBasePackages</b> trong <b>@SpringBootApplication</b>
    </summary>

`Sửa file DemoApplication.java thành`

```java
@SpringBootApplication(scanBasePackages = "com/example/demo/other")
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        try {
            Girl girl = context.getBean(Girl.class);
            System.out.println("Bean: " + girl.toString());
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }

        try {
            OtherGirl otherGirl = context.getBean(OtherGirl.class);
            if (otherGirl != null) {
                System.out.println("Bean: " + otherGirl.toString());
            }
        } catch (Exception e) {
            System.out.println("Bean Girl không tồn tại");
        }
    }
}
```

</details>

**Cả 2 cách đều cho kết quả in ra màn hình như sau**

```
Bean Girl không tồn tại
Bean: OtherGirl.java
```

Lúc này, **Spring Boot** chỉ tìm kiếm các **bean** trong **package others** mà thôi. Nên khi lấy ra **Girl** thì nó không tồn tại trong **Context**

# **Multiple package scan**

Bạn có thể cấu hình cho Spring Boot Tìm kiếm các Bean ở nhiều package khác nhau bằng cách

```java
@ComponentScan(basePackages = {"com/example/demo/other1","com/example/demo/other2"})
```

hoặc

```java
@SpringBootApplication(scanBasePackages = {"com/example/demo/other1","com/example/demo/other2"})
```
