package com.cn.mysix.service;

import com.cn.mysix.retype.Msg;

/**
 * created on 2021-01-04 14:45
 *
 * @author wub
 */

public interface EventSender {

    void send(Msg msg);

    Integer getType();

}
