//package com.cn.mysix.index;
//
//import com.alibaba.fastjson.JSONObject;
//import com.cn.mysix.retype.Msg;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// * @ClassName boot_kafka
// * @Description boot_kafka
// * @Author wub
// * @Date 2020/3/9 11:54
// * @Version 1.0
// */
//
//@RestController
//public class boot_kafka {
//
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Autowired
//    MessageProducer messageProducer;
//
//    @GetMapping("/sendkafka")
//    public void sendkafka() {
//
//        Msg msg = new Msg("six", 200, "真的");
//
//        String re = JSONObject.toJSONString(msg);
//
//        logger.info(re);
//        messageProducer.send("topic1",re);
//        messageProducer.send("topic1",re);
//    }
//
//}
