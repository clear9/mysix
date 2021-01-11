package com.cn.mi.controller;

import cn.hutool.json.JSONUtil;
import com.cn.mi.controller.EventApi;
import com.cn.mi.entity.result.Msg;
import com.cn.mi.Async.EventAsyncService;
import org.springframework.web.bind.annotation.RestController;

/**
 * created on 2021-01-05 11:18
 *
 * @author wub
 */
@RestController
public class EventApiImpl implements EventApi {

    private final EventAsyncService eventAsyncService;

    public EventApiImpl(EventAsyncService eventAsyncService) {
        this.eventAsyncService = eventAsyncService;
    }


    @Override
    public String eventReceiver(String eventInfos) {


        eventAsyncService.dispose(eventInfos);
        return JSONUtil.toJsonStr(new Msg("",200,null));
    }
}