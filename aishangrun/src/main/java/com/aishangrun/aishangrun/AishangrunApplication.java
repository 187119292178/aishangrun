package com.aishangrun.aishangrun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class AishangrunApplication {

    public static void main(String[] args) {
        SpringApplication.run(AishangrunApplication.class, args);
    }

}
