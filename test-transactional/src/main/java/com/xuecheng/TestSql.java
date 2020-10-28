package com.xuecheng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.xuecheng.dao")
public class TestSql {
    public static void main(String[] args) {
        SpringApplication.run(TestSql.class,args);
    }
}