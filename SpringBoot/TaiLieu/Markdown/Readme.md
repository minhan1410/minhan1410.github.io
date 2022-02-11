# **Tìm hiểu sơ qua Spring Boot**

**Spring Boot** là một dự án phát triển bởi **JAVA(ngôn ngữ java)** trong hệ sinh thái **Spring framework**. Nó giúp cho các lập trình viên chúng ta **đơn giản hóa quá trình lập trình** một ứng dụng với Spring, chỉ **tập trung vào việc phát triển business** cho ứng dụng.

-   Spring Boot là một module của Spring Framework, cung cấp tính năng RAD (Rapid Application Development) – Phát triển ứng dụng nhanh.

-   Spring Boot được dùng để tạo các ứng dụng độc lập dựa trên Spring.

-   Spring Boot không yêu cầu cấu hình XML
    Nó là một chuẩn cho cấu hình thiết kế phần mềm, tăng cao năng suất cho developer.

![img](https://stackjava.com/wp-content/uploads/2018/02/spring-boot-architecture.jpg.png)

# **Ưu điểm của Spring Boot**

1. Có các tính năng của Spring Framework.

2. Tạo ứng dụng độc lập, có thể chạy bằng java -jar (cho cả java web)

3. Nhúng trực tiếp các ứng dụng server (Tomcat, Jetty…) do đó không cần phải triển khai file WAR

4. Cấu hình ít, tự động cậu hình bất kì khi nào có thể (Giảm thời gian viết code, tăng năng suất)

5. Không yêu cầu XML config…

6. Cung cấp nhiều plugin

7. Chuẩn cho Microservices (Cloud support; giảm việc setup, config; các thư viện hỗ trợ…)

# **Các features(tính năng, đặc điểm) của Spring Boot**

## SpringApplication

SpringApplication là một class cung cấp cách thuận tiện để khởi chạy ứng dụng từ hàm main().

Để start ứng dụng, chỉ cần gọi method run().

Ví dụ:

```java
public static void main(String[] args) {
  SpringApplication.run(SpringBootHelloApplication.class, args);
}
```

## Externalized Configuration

Spring Boot cho phép chúng ta cấu hình từ bên ngoài (externalize), do đó một ứng dụng có thể chạy trên nhiều môi trường khác nhau.

Chúng ta có thể sử dụng file YAML, file properties, các biến môi trường và tham số command-line để thực hiện externalize configuration.

Các thuộc tính cấu hình có thể inject trực tiếp vào bean bằng cách sử dụng annotation `@Value` hoặc thông qua object với `@ConfigurationProperites`

Ví dụ:

```java
import org.springframework.stereotype.*
import org.springframework.beans.factory.annotation.*
@Component
public class MyBean {
    @Value("${name}")
    private String name;
    // ...
}
```

## Profiles

Spring Boot Profiles cung cấp một cách để phân chia các cấu hình cho mỗi môi trường.

Các annotation `@Component` hoặc `@Configuration` có thể được đánh dấu `@Profile` để giới hạn khi nào được tải lên.

Ví dụ chỉ tải trong môi trường product

```java
@Configuration
@Profile("production")
public class ProductionConfiguration {
  // ...
}
```

_Đọc thêm các bài viết sau:_

**[Giới thiệu Spring Boot Framework](https://stackjava.com/spring/spring-boot-la-gi-gioi-thieu-spring-boot-framework.html)**

**[Giới thiệu các Annotation cơ bản trong Spring Boot](https://viblo.asia/p/gioi-thieu-cac-annotation-co-ban-trong-spring-boot-gGJ597e1ZX2#_componentscan-5)**

**[Nhật kí Spring Boot](https://viblo.asia/s/nhat-ki-spring-boot-Je5EjWx0KnL)**

**[Loda](https://loda.me/courses/spring-boot)**

**[Deft Blog](https://shareprogramming.net/tag/spring-boot/)**

**[Tutorialspoint](https://www.tutorialspoint.com/spring_boot/index.htm)**

**[Baeldung](https://www.baeldung.com/spring-boot-start)**
