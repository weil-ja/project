package com.lw;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboWebApplication.class, args);
    }

}
