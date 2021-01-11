package com.cn.mi.entity.result;


import lombok.Data;

@Data
public class Msg {

    String msgType;

    int msgCode;

    Object msgContent;


    public Msg(String msgType, int msgCode, Object msgContent) {
        this.msgType = msgType;
        this.msgCode = msgCode;
        this.msgContent = msgContent;
    }

    public Msg() {
    }


}
