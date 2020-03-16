package com.cn.mysix.retype;

/**
 * @ClassName Msg
 * @Description Msg
 * @Author wub
 * @Date 2020/3/9 12:13
 * @Version 1.0
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Msg {

    String msgtype;

    int msgcode;

    Object msgcontent;


    public Msg(String msgtype, int msgcode, Object msgcontent) {
        this.msgtype = msgtype;
        this.msgcode = msgcode;
        this.msgcontent = msgcontent;
    }

    public Msg() {
    }

}
