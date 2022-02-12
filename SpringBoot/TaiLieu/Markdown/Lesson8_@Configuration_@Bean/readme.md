# **@Configuration và @Bean**

`@Configuration` là một **Annotation** đánh dấu trên một **Class** cho phép **Spring Boot** biết được đây là nơi định nghĩa ra các **Bean**.

`@Bean` là một **Annotation** được đánh dấu trên các **method** cho phép **Spring Boot** biết được đây là **Bean** và sẽ thực hiện đưa **Bean** này vào **Context**.

`@Bean` sẽ nằm trong các **class** có đánh dấu `@Configuration`

## **VD**

**SimpleBean.java**

```java
/*
    Một class cơ bản, không sử dụng `@Component`
*/
public class SimpleBean {
    private String username;

    public SimpleBean(String username) {
        setUsername(username);
    }

    @Override
    public String toString() {
        return "This is a simple bean, name: " + username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
```

**AppConfig.java**

```java
@Configuration
public class AppConfig {
    @Bean
    SimpleBean simpleBeanConfigure() {
        // Khởi tạo một instance của SimpleBean và trả ra ngoài
        return new SimpleBean("MinhAn");
    }
}
```

**DemoApplication.java**

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        // Lấy ra bean SimpleBean trong Context
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        // In ra màn hình
        System.out.println("Simple Bean Example: " + simpleBean.toString());
    }
}
```

**Output**

```
Simple Bean Example: This is a simple bean, name: MinhAn
```

### **Giải thích cách chạy**

Đằng sau chương trình, **Spring Boot** lần đầu khởi chạy, ngoài việc đi tìm các `@Component` thì nó còn làm một nhiệm vụ nữa là tìm các **class `@Configuration`**

1. Đi tìm **class** có đánh dấu `@Configuration`

2. Tạo ra đối tượng từ **class** có đánh dấu `@Configuration`

3. Tìm các **method** có đánh dấu `@Bean` trong đối tượng vừa tạo

4. Thực hiện gọi các **method** có đánh dấu `@Bean` để lấy ra các **Bean** và đưa vào `Context`.

### **Tại sao SimpleBean là một object được quản lý trong Context của Spring Boot, mặc dù trong bài này, chúng ta không hề sử dụng tới các khái niệm `@Component`?**

Về bản chất, `@Configuration cũng là @Component`. Nó chỉ khác ở ý nghĩa sử dụng(Giống với việc **class** được đánh dấu `@Service` chỉ nên phục vụ logic vậy).

### **`@Configuration` và `@Bean` sẽ có ý nghĩa gì khi chúng ta đã có `@Component` sao không đánh dấu SimpleBean là `@Component` cho nhanh?**

Việc sử dụng `@Component` cũng hoàn toàn ổn, thông thường thì các **class** được đánh dấu `@Component` đều có thể `tạo tự động và inject tự động` được. 

Tuy nhiên trong thực tế, nếu một **Bean** có quá nhiều logic để khởi tạo và cấu hình, thì chúng ta sẽ sử dụng `@Configuration` và `@Bean` để tự tay tạo ra **Bean**. Việc tự tay tạo ra Bean như này có thể hiểu phần nào là chúng ta đang **config** cho chương trình.

#### **VD: Chúng ta sẽ ví dụ với việc cấu hình kết nối tới Database. Đây vẫn là một ví dụ hết sức đơn giản**

Tạo ra một **Abstract Class DatabaseConnector** chịu trách nhiệm kết nối tới **Database**.

**DatabaseConnector.java**

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

Kế thừa class này có 3 class đại diện: **MySqlConnector, PostgreSqlConnector, MongoDbConnector**

**MongoDbConnector.java**

```java
public class MongoDbConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Mongodb: " + getUrl());
    }
}
```

**MySqlConnector.java**

```java
public class MySqlConnector extends DatabaseConnector {
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Mysql: " + getUrl());
    }
}
```

**PostgreSqlConnector.java**

```java
public class PostgreSqlConnector  extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("Đã kết nối tới Postgresql: " + getUrl());
    }
}
```

Tạo ra **Bean** trong **AppConfig**

**AppConfig.java**

```java
@Configuration
public class AppConfig {
    @Bean
    SimpleBean simpleBeanConfigure() {
        // Khởi tạo một instance của SimpleBean và trả ra ngoài
        return new SimpleBean("MinhAn");
    }

    @Bean("mysqlConnector1")
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:33060/minhan");
        // Set username, password, format, v.v...
        return mySqlConnector;
    }

    @Bean("mysqlConnector2")
    DatabaseConnector mysqlConfigure(SimpleBean simpleBean /* SimpleBean được tự động inject vào */) { 

        /* 
            Nếu method được đánh dấu bởi @Bean, có tham số truyền vào thì Spring Boot sẽ tự inject các Bean đã có trong Context vào làm tham số.
        */

        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl("jdbc:mysql://host1:33060/" + simpleBean.getUsername() + " @Bean có tham số");
        // Set username, password, format, v.v...
        return mySqlConnector;
    }

    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector mongoDbConnector = new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017/minhan");
        // Set username, password, format, v.v...
        return mongoDbConnector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure() {
        DatabaseConnector postgreSqlConnector = new PostgreSqlConnector();
        postgreSqlConnector.setUrl("postgresql://localhost/minhan");
        // Set username, password, format, v.v...
        return postgreSqlConnector;
    }
}
```

**DemoApplication.java**

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        // Lấy ra bean SimpleBean trong Context
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        // In ra màn hình
        System.out.println("Simple Bean Example: " + simpleBean.toString());

        System.out.println("--------------------------------------------------------");

        DatabaseConnector mysql1 = (DatabaseConnector) context.getBean("mysqlConnector1");
        mysql1.connect();

        DatabaseConnector mysql2 = (DatabaseConnector) context.getBean("mysqlConnector2");
        mysql2.connect();

        DatabaseConnector mongodb = (DatabaseConnector) context.getBean("mongodbConnector");
        mongodb.connect();

        DatabaseConnector postgresql = (DatabaseConnector) context.getBean("postgresqlConnector");
        postgresql.connect();
    }
}
```

**Output**

```
Simple Bean Example: This is a simple bean, name: MinhAn
--------------------------------------------------------
Đã kết nối tới Mysql: jdbc:mysql://host1:33060/minhan
Đã kết nối tới Mysql: jdbc:mysql://host1:33060/MinhAn @Bean có tham số
Đã kết nối tới Mongodb: mongodb://mongodb0.example.com:27017/minhan
Đã kết nối tới Postgresql: postgresql://localhost/minhan
```