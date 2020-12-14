package com.cn.mysix;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


//@EnableAdminServer
@Slf4j
@MapperScan("com.cn.mysix.dao")
@SpringBootApplication
public class MysixApplication extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(MysixApplication.class);
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MysixApplication.class);
    }
    public static void main(String[] args) {

        SpringApplication.run(MysixApplication.class, args);

        logger.info("启动0.0");
    }

}
