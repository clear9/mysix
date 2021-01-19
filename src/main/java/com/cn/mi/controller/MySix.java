package com.cn.mi.controller;

import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.cn.mi.config.MessageType;
import com.cn.mi.entity.result.Msg;
import com.cn.mi.Async.EventAsyncService;
import com.cn.mi.tools.netutils.NetServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 2021-01-11 13:50
 *
 * @author wub
 */


@Slf4j
@Api("MySix测试模块")
@RestController()
@RequestMapping("/api/v1/test")
public class MySix {


    private final EventAsyncService eventAsyncService;

    public MySix(EventAsyncService eventAsyncService) {
        this.eventAsyncService = eventAsyncService;
    }


    @ApiOperation(value = "第一个测试")
    @GetMapping("/0")
    public String six() {

        String re = "127.0.0.1";

        if (NetServer.ping(re)) {
            Msg msg = new Msg("DiEr", 200, "真的");
            re = JSONObject.toJSONString(msg);
        }

        String s=StrUtil.trim("12 1");
        log.info("答案：" + re);
        return re;
    }


    @ApiOperation(value = "本地执行命令")
    @GetMapping("/localCommand")
    public Msg execCommand(@RequestParam String cmd) {
        List<String> result=new ArrayList<>();
        try {
            result=RuntimeUtil.execForLines(cmd);
        }catch (Exception e){
            result.add("命令出错");
        }
        log.info("执行结果："+result);
        return new Msg(MessageType.RETURN_CODE, 200, result);
    }

    @ApiOperation(value = "接收消息")
    @GetMapping("/receiver")
    public String receiver(@RequestParam String id) {

        Msg msg = new Msg();
        msg.setMsgType(id);

        eventAsyncService.dispose(JSONUtil.toJsonStr(msg));

        return "200";
    }

}

