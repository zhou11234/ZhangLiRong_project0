package com.zhou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhou.dao")
public class ZzhWorkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzhWorkApplication.class, args);
    }

}
