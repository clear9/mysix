package com.cn.mi.config.timed_task;

import com.cn.mi.tools.NetServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author wub
 * @version 1.0
 */

@Slf4j
@Component
@EnableScheduling
public class TimeTask {



    @Scheduled(cron = "${timeTask.t1}")
    public void timeT() {

        if (NetServer.ping("172.16.11.245")){
            log.info("连接正常");
        }

    }


}
