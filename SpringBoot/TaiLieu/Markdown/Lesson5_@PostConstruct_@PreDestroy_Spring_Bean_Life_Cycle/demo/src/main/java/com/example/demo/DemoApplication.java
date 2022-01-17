package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

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
