package com.example.btvn.Config;

import com.example.btvn.Repository.EmployeeDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepoConfig {

    @Bean
    public EmployeeDao bookDao() {
        return new EmployeeDao();
    }

}
