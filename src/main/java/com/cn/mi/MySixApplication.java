package com.cn.mi;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@Slf4j
@SpringBootApplication
public class MySixApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(MySixApplication.class);
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MySixApplication.class);
    }
    public static void main(String[] args) {

        SpringApplication.run(MySixApplication.class, args);

        logger.info("启动0.0");
    }

}
