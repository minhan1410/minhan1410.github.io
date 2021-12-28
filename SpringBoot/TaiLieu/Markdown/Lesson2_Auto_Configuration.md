# **Auto Configuration**

**Spring Boot Auto Configuration** tự động cấu hình ứng dụng Spring của bạn dựa trên các phụ thuộc JAR mà bạn đã thêm vào trong dự án.

Ví dụ: nếu cơ sở dữ liệu MySQL nằm trên đường dẫn lớp của bạn, nhưng bạn chưa định cấu hình bất kỳ kết nối cơ sở dữ liệu nào, thì Spring Boot sẽ tự động định cấu hình cơ sở dữ liệu trong bộ nhớ.

Với mục đích này, bạn cần phải thêm `@EnableAutoConfiguration` chú thích hoặc `@SpringBootApplication` chú thích để file class chính của bạn. Sau đó, ứng dụng Spring Boot của bạn sẽ được tự động cấu hình.

Hãy quan sát đoạn mã sau để hiểu rõ hơn:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}
```

# **Spring Boot Application**

Điểm đầu vào của Spring Boot Application là lớp chứa annotation `@SpringBootApplication`. Lớp này phải có phương thức chính để chạy Spring Boot Application.

Nếu bạn thêm annotation `@SpringBootApplication` thì sẽ không cần thêm các annotations như `@EnableAutoConfiguration`, `@ComponentScan` và `@SpringBootConfiguration` vì nó đã bao gồm tất cả các annotations đấy.

Hãy quan sát đoạn mã sau để hiểu rõ hơn:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}
```

# Component Scan

Spring Boot application sẽ quét tất cả các `bean` và khai báo các `packages` khi khởi chạy. Bạn cần thên annotation `@ComponentScan` cho class của mình để Spring Boot quét tất cả các components và thêm vào project của bạn.

Hãy quan sát đoạn mã sau để hiểu rõ hơn:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}
```

*Đọc thêm các bài viết sau:*

**[Spring Boot - Introduction](https://www.tutorialspoint.com/spring_boot/spring_boot_introduction.htm)**

**[Spring Boot Tutorial – Bootstrap a Simple Application](https://www.baeldung.com/spring-boot-start)**