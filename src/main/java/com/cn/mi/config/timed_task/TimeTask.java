package com.cn.mi.config.timed_task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wub
 * @version 1.0
 */

@Configuration
@EnableScheduling
public class TimeTask {

//    private Logger logger = LoggerFactory.getLogger(getClass());

//    private int asd=1;

//    @Scheduled(cron = "${tt.t1}")
//    public void timeT(){
//
//        logger.info("每个十分整点任务");
//    }

//    @Scheduled(fixedRate=10000)
//    public void timeTT(){
//        logger.info("192.168.2."+asd+(NetServer.ping("192.168.2."+asd)==true?":ok":":no"));
//        if(asd<255){
//            asd++;
//        }else{
//            asd=0;
//        }
//
//    }

}
