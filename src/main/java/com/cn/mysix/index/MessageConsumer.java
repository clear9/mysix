//package com.cn.mysix.index;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
///**
// * @ClassName MessageConsumer
// * @Description MessageConsumer
// * @Author wub
// * @Date 2020/3/9 14:08
// * @Version 1.0
// *
// */
//
//@Service
//public class MessageConsumer {
//
//    private static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
//
//
//    @KafkaListener(topics = "Device_Plate")
//    public void deviceMessage(String Message) {
//        logger.info("MessageConsumer: onMessage: message is: [" + Message + "]");
//        logger.info("收到Kafka消息: [Message]");
//    }
//
//}
