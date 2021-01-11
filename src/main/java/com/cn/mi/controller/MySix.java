package com.cn.mi.controller;

import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.cn.mi.config.MessageType;
import com.cn.mi.entity.result.Msg;
import com.cn.mi.Async.EventAsyncService;
import com.cn.mi.tools.NetServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * created on 2021-01-11 13:50
 *
 * @author wub
 */


@Slf4j
@Api("MySix测试模块")
@RestController()
@RequestMapping("/six")
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
            Msg msg = new Msg("six", 200, "真的");
            re = JSONObject.toJSONString(msg);
        }
        log.info("答案：" + re);
        return re;
    }


    @ApiOperation(value = "远程桌面")
    @GetMapping("/remote")
    public String remote() {

        RuntimeUtil.execForStr("mstsc");
        return JSONObject.toJSONString(new Msg(MessageType.SIX_INSERT, 200, "调动完成"));
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

