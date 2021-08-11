package com.bixin.ddd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.bixin.ddd", "com.alibaba.cola"})
@MapperScan("com.bixin.ddd.gatewayimpl.database")
public class DddApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddApplication.class, args);
    }

}
