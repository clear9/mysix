package com.cn.mysix.service;

import com.cn.mysix.Factory.EventFactory;
import com.cn.mysix.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
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

    public void dispose(Msg msg,Integer id){

        EventSender eventSender=eventFactory.getEvent(id);
        if(eventSender==null){
            log.info("没有此类型的消息");
        }else{
            eventSender.send(msg);
        }

    }

}
