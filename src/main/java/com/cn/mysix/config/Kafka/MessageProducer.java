package com.cn.mysix.config.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @ClassName MessageProducer
 * @Description MessageProducer
 * @Author wub
 * @Date 2020/3/9 14:09
 * @Version 1.0
 * 消息生产者：用于发送消息
 */

@Service
public class MessageProducer {


    private static Logger logger = LoggerFactory.getLogger(MessageProducer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String channel, String message) {
        kafkaTemplate.send(channel, message);
        logger.info("MessageProducer: send: message is: [" + message + "]");
    }

}
