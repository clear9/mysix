package com.cn.mysix.service;

import com.cn.mysix.retype.Msg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 消息类型为"1"时的处理
 *
 * created on 2021-01-04 14:48
 * @author wub
 */
@Slf4j
@Service
public class PpEventSenderImp implements EventSender {

    @Override
    public void send(Msg msg) {

        log.info("123");
    }

    @Override
    public Integer getType() {
        return 1;
    }
}
