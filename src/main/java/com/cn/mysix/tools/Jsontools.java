package com.cn.mysix.tools;

import com.alibaba.druid.support.json.JSONUtils;
import com.cn.mysix.retype.Msg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName Jsontools
 * @Description Jsontools
 * @Author wub
 * @Date 2020/11/17 11:02
 * @Version 1.0
 */

@RestController
public class Jsontools {

    Logger logger= LoggerFactory.getLogger(getClass());


    @GetMapping("asd")
    public Msg asd(){

//        logger.info("json");
        return new Msg();
    }

}
