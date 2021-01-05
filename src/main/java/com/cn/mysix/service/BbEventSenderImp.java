package com.cn.mysix.service;

import com.cn.mysix.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * created on 2021-01-04 15:28
 *
 * @author wub
 */

@Slf4j
@Service
public class BbEventSenderImp implements EventSender{
    @Override
    public void send(Msg msg) {

        log.info("第三方消息[{}]",msg);
    }

    @Override
    public String getType() {
        return "2";
    }
}
