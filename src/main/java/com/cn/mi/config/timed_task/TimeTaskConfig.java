package com.cn.mi.config.timed_task;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author wub
 * @version 1.0
 */

@Component
@Getter
@Setter
public class TimeTaskConfig {


    public static String T1;


    @Value("${tt.t1}")
    public void setT1(String t1) {
        T1 = t1;
    }
}
