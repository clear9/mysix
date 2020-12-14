package com.cn.mysix.config.timed_task;

import com.cn.mysix.tools.NetServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @ClassName TimeTask
 * @Description TimeTask
 * @Author wub
 * @Date 2020/10/23 16:08
 * @Version 1.0
 */

@PropertySource("classpath:application-tt.properties")
@Configuration
@EnableScheduling
public class TimeTask {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private int asd=1;

//    @Scheduled(cron = "${tt.t1}")
//    public void timet(){
//
//        logger.info("每个十分整点任务");
//    }

//    @Scheduled(fixedRate=10000)
//    public void timett(){
//        logger.info("192.168.2."+asd+(NetServer.ping("192.168.2."+asd)==true?":ok":":no"));
//        if(asd<255){
//            asd++;
//        }else{
//            asd=0;
//        }
//
//    }

}
