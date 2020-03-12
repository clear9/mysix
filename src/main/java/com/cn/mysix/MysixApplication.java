package com.cn.mysix;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("com.cn.mysix.dao")
@SpringBootApplication
public class MysixApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MysixApplication.class);
    }
    public static void main(String[] args) {


        SpringApplication.run(MysixApplication.class, args);

        System.out.println("启动0.0");
    }

}
