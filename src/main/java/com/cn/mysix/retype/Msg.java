package com.cn.mysix.retype;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
