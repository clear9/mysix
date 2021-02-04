package com.cn.mi.config.jinlin;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created on 2021-01-25 10:09
 *
 * 捷顺平台请求参数类
 * @author wub
 */

@Data
@ConfigurationProperties(prefix = "jie")
public class JieLinkProperties {

    private String ip;
    private String port;
    private String userName;
    private String passWord;
}
