//package com.cn.mysix.config.RabbitMq;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @ClassName SendMessageRabbit
// * @Description SendMessageRabbit
// * @Author wub
// * @Date 2020/3/13 13:57
// * @Version 1.0
// */
//
//@RestController
//public class SendMessageRabbit {
//
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//
//
////    @GetMapping("/sendRabbitmq")
//    public String sendRabbitmq(){
//
//        Map<String,Object> map=new HashMap<>();
//        map.put("mesID","rabbitMQ");
//        map.put("mescle","答案");
//
//        rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting",map);
//
//        return "发送";
//
//    }
//}
