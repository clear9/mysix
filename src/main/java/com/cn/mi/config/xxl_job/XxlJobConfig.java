//package com.cn.mi.config.xxl_job;
//
//import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
//import org.springframework.context.annotation.Bean;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName XxlJobConfig
// * @Description XxlJobConfig
// * @Author wub
// * @Date 2020/10/20 9:53
// * @Version 1.0
// */
//
//
//@Configuration
////指定任务Handler所在包路径
//@ComponentScan(basePackages = "com.cn.mysix.config.xxl_job")
//public class XxlJobConfig {
//
//        private Logger logger = LoggerFactory.getLogger(XxlJobConfig.class);
//
//        @Value("${xxl.job.admin.addresses}")
//        private String adminAddresses;
//
//        @Value("${xxl.job.executor.appname}")
//        private String appName;
//
//        @Value("${xxl.job.executor.ip}")
//        private String ip;
//
//        @Value("${xxl.job.executor.port}")
//        private int port;
//
//        @Value("${xxl.job.accessToken}")
//        private String accessToken;
//
//        @Value("${xxl.job.executor.logpath}")
//        private String logPath;
//
//        @Value("${xxl.job.executor.logretentiondays}")
//        private int logRetentionDays;
//
//
//        @Bean(initMethod = "start", destroyMethod = "destroy")
//        public XxlJobSpringExecutor xxlJobExecutor() {
//            logger.info("====xxl-job config init====");
//            XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
//            xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
//            xxlJobSpringExecutor.setAppName(appName);
//            xxlJobSpringExecutor.setIp(ip);
//            xxlJobSpringExecutor.setPort(port);
//            xxlJobSpringExecutor.setAccessToken(accessToken);
//            xxlJobSpringExecutor.setLogPath(logPath);
//            xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);
//            return xxlJobSpringExecutor;
//        }
//
//
//}
