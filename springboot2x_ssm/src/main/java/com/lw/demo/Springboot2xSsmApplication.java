package com.lw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lw.demo.mapper")
public class Springboot2xSsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2xSsmApplication.class, args);
    }

}
