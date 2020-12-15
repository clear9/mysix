package com.cn.mysix.tools;

import com.cn.mysix.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName Jsontools
 * @Description Jsontools
 * @Author wub
 * @Date 2020/11/17 11:02
 * @Version 1.0
 */

@Slf4j
@RestController
public class Jsontools {



    @GetMapping("asd")
    public Msg ad(){

        log.info("");
        return new Msg();
    }
}
