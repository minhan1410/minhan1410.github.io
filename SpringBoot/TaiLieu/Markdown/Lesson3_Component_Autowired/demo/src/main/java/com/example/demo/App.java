package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        // ApplicationContext chính là container, chứa toàn bộ các Bean
        ApplicationContext context = SpringApplication.run(App.class, args);

        // Khi chạy xong, lúc này context sẽ chứa các Bean có đánh dấu @Component (nói nôm na là trong context chứa Bikini)

        // Lấy Bean ra bằng cách
        Outfit outfit = context.getBean(Outfit.class);

        // In ra để xem thử nó là gì
        System.out.println("Output Instance: " + outfit);
        // xài hàm wear()
        outfit.wear();

        // Mình cũng đánh dấu Girl là một @Component nên trong context cũng chứa Girl
        Girl girl = context.getBean(Girl.class);

        System.out.println("Girl Instance: " + girl);

        // Mình đánh dấu thuộc tính Outfit của Girl bởi annotation @Autowired (Điều này nói với Spring Boot hãy tự inject (tiêm) một instance của Outfit vào thuộc tính này khi khởi tạo Girl)
        System.out.println("Girl Outfit: " + girl.outfit);

        girl.outfit.wear();
    }
}
