package com.lw.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableDubbo
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DubboWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboWebApplication.class, args);
    }

}
