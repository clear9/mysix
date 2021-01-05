//package com.cn.mysix.config.RabbitMq;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.DirectExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.amqp.core.Queue;
//
///**
// * created on 2019-10-24 15:07
// *
// * @author: wub
// */
//
//@Configuration
//public class DirectRabbitConfig {
//
//    @Bean
//    public Queue TestDirectQueue(){
//        return new Queue("TestQueue1",true);
//    }
//
//    DirectExchange TestDirectExchange(){
//        return new DirectExchange("TestExchange");
//    }
//
//    @Bean
//    Binding bindingDirect(){
//        return BindingBuilder.bind(TestDirectQueue()).to(TestDirectExchange()).with("TestRouting");
//    }
//
//}
