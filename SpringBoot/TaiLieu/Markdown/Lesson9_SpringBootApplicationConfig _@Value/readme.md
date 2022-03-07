# **Spring Boot Application Config và @Value**

## Giới thiệu

Trong thực tế không phải lúc nào chúng ta cũng nên để mọi thứ trong code của mình. Có những thông số tốt hơn hết nên được truyền từ bên ngoài vào ứng dụng, để giúp ứng dụng của bạn dễ dàng thay đổi giữa các môi trường khác nhau.

Để phục vụ điều này, chúng ta sẽ tìm hiểu về khái niệm config ứng dụng **Spring Boot** với `application.properties`

Sau bài này bạn có thể xem thêm nội dung sau:

[Hướng dẫn sử dụng Spring Properties với @ConfigurationProperties](https://viblo.asia/p/huong-dan-su-dung-spring-properties-voi-configurationproperties-Ljy5VYJMlra)

[Hướng dẫn sử dụng Spring Profiles](https://viblo.asia/p/spring-boothuong-dan-su-dung-spring-profiles-1Je5E4ojlnL)

## **application.properties**

Trong **Spring Boot**, các thông tin cấu hình mặc định được lấy từ file **`resources/applications.properties`**

### Ví dụ:

Bạn muốn **Spring Boot** chạy trên port 1410 thay vì 8080:

    server.port = 1410

Hoặc bạn muốn log của chương trình chi tiết hơn. Hãy chuyển nó sang dậng Debug bằng cách config như sau:

    logging.level.root=DEBUG

Đây là cách chúng ta có thể can thiệp vào các cấu hình của ứng dụng từ bên ngoài. Cho phép thay đổi linh hoạt tùy môi trường.

## **@Value**

Trong trường hợp, bạn muốn tự **config** những giá trị của riêng mình, thì **Spring Boot** hỗ trợ bạn với **annotation` @Value`**

### Ví dụ

Tôi muốn cấu hình cho thông tin database của tôi từ bên ngoài ứng dụng

**`application.properties`**

    minhan.mysql.url = jdbc:mysql://host1:33060/minhan

**`@Value` được sử dụng trên thuộc tính của class, có nhiệm vụ lấy thông tin từ `file properties` và gán vào biến.**

```java
    public class AppConfig {

        // Lấy giá trị config từ file application.properties

        @Value("${minhan.mysql.url}")
        String mysqlUrl;
    }
```

**Thông tin truyền vào annottaion `@Value` chính là tên của cấu hình đặt trong dấu `${name}`**

## **Ví dụ**

**Thông tin file `application.properties` bao gồm:**

    server.port = 8081
    logging.level.root=INFO
    minhan.mysql.url = jdbc:mysql://host1:33060/minhan

**Tạo ra class `DatabaseConnector` có nhiệm vụ kết nối tới database.**

**`DatabaseConnector.java`**

```java
    public abstract class DatabaseConnector {
        private String url;
        /**
         * Hàm này có nhiệm vụ Connect tới một Database bất kỳ
         */
        public abstract void connect();

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
```

**Kế thừa nó là `MySqlConnector`**

**`MySqlConnector.java`**

```java
    public class MySqlConnector extends DatabaseConnector {
        @Override
        public void connect() {
            System.out.println("Đã kết nối tới Mysql: " + getUrl());
        }
    }
```

**Chương trình sẽ được cấu hình trong `AppConfig`**

**`AppConfig.java`**

```java
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;

    @Configuration
    public class AppConfig {

        // Lấy giá trị config từ file application.properties
        @Value("${minhan.mysql.url}")
        String mysqlUrl;

        @Bean
        DatabaseConnector mysqlConfigure() {
            DatabaseConnector mySqlConnector = new MySqlConnector();
            
            // Set Url
            System.out.println("Config Mysql Url: " + mysqlUrl);
            mySqlConnector.setUrl(mysqlUrl);
            
            // Set username, password, format, v.v...
            return mySqlConnector;
        }
    }
```

**`DemoApplication.java`**

```java
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        DatabaseConnector databaseConnector = context.getBean(DatabaseConnector.class);
        databaseConnector.connect();
    }

}
```

**`Output:`**
```
2022-03-07 21:46:17.743  INFO 6744 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 1410 (http) with context path ''
2022-03-07 21:46:17.754  INFO 6744 --- [           main] com.example.demo.DemoApplication         : Started DemoApplication in 2.005 seconds (JVM running for 3.13)
Đã kết nối tới Mysql: jdbc:mysql://host1:33060/minhan
```