//package com.cn.mysix.config.RabbitMq;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * created on 2019-10-24 15:07
// *
// * @author: wub
// */
//
//@RestController
//public class SendMessageRabbit {
//
//   private final RabbitTemplate rabbitTemplate;
//
//    public SendMessageRabbit(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//
//    @GetMapping("/sendRabbitmq")
//    public String sendRabbitmq(){
//
//        Map<String,Object> map=new HashMap<>();
//        map.put("mesID","rabbitMQ");
//        map.put("mesCle","答案");
//
//        rabbitTemplate.convertAndSend("TestExchange","TestRouting",map);
//
//        return "发送";
//
//    }
//}
