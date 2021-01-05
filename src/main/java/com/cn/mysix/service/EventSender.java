package com.cn.mysix.service;

import com.cn.mysix.retype.Msg;

/**
 * 消息处置接口类
 *
 * created on 2021-01-04 14:45
 *
 * @author wub
 */

public interface EventSender {

    void send(Msg msg);

    String getType();

}
