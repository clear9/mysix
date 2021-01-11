package com.cn.mi.config.timed_task;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author wub
 * @version 1.0
 */

@Configuration
@Getter
@Setter
public class TimeTaskConfig {


    public static String T1;


    @Value("${timeTask.t1}")
    public void setT1(String t1) {
        T1 = t1;
    }
}
