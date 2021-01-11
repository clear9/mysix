package com.cn.mi.service;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.json.JSONUtil;
import com.cn.mi.Factory.EventFactory;
import com.cn.mi.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步处理接收到的消息
 *
 * created on 2021-01-04 15:05
 *
 * @author wub
 */
@Slf4j
@Service
@Async
public class EventAsyncService {

    EventFactory eventFactory;

    public EventAsyncService(EventFactory eventFactory) {
        this.eventFactory = eventFactory;
    }

    public void dispose(String eventInfos){

        Msg msg= JSONUtil.toBean(eventInfos,Msg.class);

        EventSender eventSender=eventFactory.getEvent(msg.getMsgType());
        if(ObjectUtil.isNull(eventSender)){

            log.info("没有此类型的消息：[MsgType={}]",msg.getMsgType());
        }else{
            eventSender.send(msg);
        }

    }

}
