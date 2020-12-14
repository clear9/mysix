//package com.cn.mysix.config.xxl_job;
//
//import com.xxl.job.core.biz.model.ReturnT;
//import com.xxl.job.core.handler.IJobHandler;
//import com.xxl.job.core.handler.annotation.JobHandler;
//import com.xxl.job.core.log.XxlJobLogger;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * @ClassName IJobHandler
// * @Description IJobHandler
// * @Author wub
// * @Date 2020/10/20 10:05
// * @Version 1.0
// */
//@JobHandler(value="xxl_job")
//@Component
//public class DemoJobHandler extends IJobHandler {
//
//    public ReturnT<String> (String param) throws Exception {
//        XxlJobLogger.log("XXL-JOB, Hello World.");
//
//        for (int i = 0; i < 5; i++) {
//            XxlJobLogger.log("beat at:" + i);
//            TimeUnit.SECONDS.sleep(2);
//        }
//
//        return SUCCESS;
//    }
//}
