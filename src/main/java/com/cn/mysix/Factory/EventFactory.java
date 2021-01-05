package com.cn.mysix.Factory;

import com.cn.mysix.service.EventSender;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * created on 2021-01-04 14:52
 *
 * @author wub
 */

@Component
public class EventFactory {

    List<EventSender> eventSenderList;

    public EventFactory(List<EventSender> eventSenderList) {
        this.eventSenderList = eventSenderList;
    }


    public EventSender getEvent(String eventType) {

        for (EventSender eventSender : eventSenderList) {
            if (eventSender.getType().equals(eventType)) {

                return eventSender;
            }
        }

        return null;
    }

}
