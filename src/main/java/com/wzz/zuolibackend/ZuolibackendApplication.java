package com.wzz.zuolibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.wzz.zuolibackend.dao")
public class ZuolibackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuolibackendApplication.class, args);
    }
}
