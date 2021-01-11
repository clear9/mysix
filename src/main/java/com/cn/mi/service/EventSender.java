package com.cn.mi.service;

import com.cn.mi.entity.result.Msg;

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
