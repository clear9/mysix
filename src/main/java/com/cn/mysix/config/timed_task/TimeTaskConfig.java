package com.cn.mysix.config.timed_task;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName TimeTaskConfig
 * @Description TimeTaskConfig
 * @Author wub
 * @Date 2020/10/26 10:27
 * @Version 1.0
 */

@Component
@Getter
@Setter
public class  TimeTaskConfig {

    @Value("${tt.t1}")
    public static String t1;

}
