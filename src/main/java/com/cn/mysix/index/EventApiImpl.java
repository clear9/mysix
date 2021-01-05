package com.cn.mysix.index;

import com.cn.mysix.retype.Msg;
import com.cn.mysix.service.EventAsyncService;
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
    public Msg eventReceiver(String eventInfos) {


        eventAsyncService.dispose(eventInfos);
        return new Msg("",200,null);
    }
}
