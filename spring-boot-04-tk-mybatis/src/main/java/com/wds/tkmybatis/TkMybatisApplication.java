package com.wds.tkmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wds.tkmybatis.tk.mapper")
public class TkMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisApplication.class, args);
    }

}
