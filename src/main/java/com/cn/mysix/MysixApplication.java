package com.cn.mysix;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@EnableAdminServer
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
