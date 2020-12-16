package com.cn.mysix.tools;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.IdcardUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.system.SystemUtil;
import com.cn.mysix.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


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



    public Msg ad(){

        log.info("ad");
        return new Msg();
    }

//    public static void main(String[] args) {
//
//        System.out.println(SystemUtil.getRuntimeInfo());
//
//    }

}
