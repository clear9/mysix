package com.cn.mi.config.jinlin;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created on 2021-01-25 10:12
 *
 * 捷顺平台请求配置类
 * @author wub
 */

@EnableConfigurationProperties(JieLinkProperties.class)
@Configuration
public class JieLinkConfig {

    public static String jieLinkPath;
    public static String userName;
    public static String passWord;

    private final JieLinkProperties jieLinkProperties;

    public JieLinkConfig(JieLinkProperties jieLinkProperties) {
        this.jieLinkProperties = jieLinkProperties;
    }


    @Bean
    public void jieConfig(){
        jieLinkPath="http://" + jieLinkProperties.getIp() + ":"+jieLinkProperties.getPort()+"/api";
        userName=jieLinkProperties.getUserName();
        passWord=jieLinkProperties.getPassWord();
    }

}
