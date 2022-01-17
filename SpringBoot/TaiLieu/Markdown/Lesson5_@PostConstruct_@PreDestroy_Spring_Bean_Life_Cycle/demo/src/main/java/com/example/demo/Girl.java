package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
