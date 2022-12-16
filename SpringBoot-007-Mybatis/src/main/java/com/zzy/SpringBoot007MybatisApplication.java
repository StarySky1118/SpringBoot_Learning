package com.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.zzy.mapper")
public class SpringBoot007MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot007MybatisApplication.class, args);
    }

}
