# **@PostConstruct**

**`@PostConstruct` được đánh dấu trên một method duy nhất bên trong `Bean`. `IoC Container` hoặc `ApplicationContext` sẽ gọi hàm này `sau khi một Bean được tạo ra và quản lý`.**

```java
@Component
public class Girl {
    @PostConstruct
    public void postConstruct() {
        System.out.println("\n\t>> Đối tượng Girl sau khi khởi tạo xong sẽ chạy hàm này\n");
    }
}
```

# **@PreDestroy**

**`@PreDestroy` được đánh dấu trên một method duy nhất bên trong `Bean`. `IoC Container` hoặc `ApplicationContext` sẽ gọi hàm này `trước khi một Bean bị xóa `hoặc `không được quản lý nữa`.**

```java
@Component
public class Girl {
    @PreDestroy
    public void preDestroy(){
        System.out.println("\n\t>> Đối tượng Girl trước khi bị destroy thì chạy hàm này\n");
    }
}
```

# **Bean Life Cycle**

`Spring Boot` từ thời điểm **chạy lần đầu** tới khi **shutdown** thì các `Bean` nó quản lý sẽ có **một vòng đời** được biểu diễn như ảnh dưới đây:

![alt](https://super-static-assets.s3.amazonaws.com/8a72ee8e-d4aa-4a06-985f-e92802c5bc44/images/f9b4e79f-24e8-40e6-918e-f66e4fa5ee0a.jpg?w=1500&f=webp)

Nhìn có vẻ loằng ngoằng, trong series căn bản này, bạn có lẽ sẽ chỉ cần hiểu như sau:

1. Khi `IoC Container(ApplicationContext)` tìm thấy một `Bean` cần quản lý, nó sẽ khởi tạo bằng `Constructor`

2. `Inject dependencies` vào `Bean` bằng `Setter`, và thực hiện các quá trình cài đặt khác vào `Bean` như `setBeanName`, `setBeanClassLoader`, v.v..

3. Hàm đánh dấu [@PostConstruct](#PostConstruct) được gọi

4. Tiền xử lý sau khi [@PostConstruct](#PostConstruct)` được gọi.

5. `Bean` sẵn sàng để hoạt động

6. Nếu `IoC Container` **không quản lý bean nữa** hoặc **bị shutdown** nó sẽ gọi hàm [@PreDestroy](#PreDestroy) trong `Bean`

7. Xóa `Bean`

## VD:

```java
@Component
public class Girl {
    @PostConstruct
    public void postConstruct() {
        System.out.println("\n\t>> Đối tượng Girl sau khi khởi tạo xong sẽ chạy hàm này\n");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("\n\t>> Đối tượng Girl trước khi bị destroy thì chạy hàm này\n");
    }
}
```

```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        System.out.println("\n> Trước khi IoC Container được khởi tạo\n");
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println("\n> Sau khi IoC Container được khởi tạo\n");

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh
        // dấu @Component.

        Girl girl = context.getBean(Girl.class);

        System.out.println("\n> Trước khi IoC Container destroy Girl\n");
        ((ConfigurableApplicationContext) context).getBeanFactory().destroyBean(girl);
        System.out.println("\n> Sau khi IoC Container destroy Girl\n");

    }
}
```

```
> Trước khi IoC Container được khởi tạo
	>> Đối tượng Girl sau khi khởi tạo xong sẽ chạy hàm này
> Sau khi IoC Container được khởi tạo
> Trước khi IoC Container destroy Girl
	>> Đối tượng Girl trước khi bị destroy thì chạy hàm này
> Sau khi IoC Container destroy Girl
	>> Đối tượng Girl trước khi bị destroy thì chạy hàm này
```

# **Ý nghĩa**

`@PostConstruct` và `@PreDestroy` là 2 `Annotation` cực kỳ ý nghĩa, nếu bạn nắm được vòng đời của một `Bean`, bạn có thể tận dụng nó để làm các nhiệm vụ riêng như setting, thêm giá trị mặc định trong thuộc tính sau khi tạo, xóa dữ liệu trước khi xóa, v.v.. Rất nhiều chức năng khác tùy theo nhu cầu.
