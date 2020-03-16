package com.cn.mysix.config.RabbitMq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

/**
 * @ClassName DirectRabbitConfig
 * @Description DirectRabbitConfig
 * @Author wub
 * @Date 2020/3/13 13:49
 * @Version 1.0
 */

@Configuration
public class DirectRabbitConfig {

    @Bean
    public Queue TestDirectQueue(){
        return new Queue("TestDirectQueue1",true);
    }

    DirectExchange TestDirectExchange(){
        return new DirectExchange("TestDirectExchange");
    }

    @Bean
    Binding bindingDirect(){
        return BindingBuilder.bind(TestDirectQueue()).to(TestDirectExchange()).with("TestDirectRouting");
    }

}
