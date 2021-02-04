package com.cn.mi.entity.result;

import lombok.Data;

import java.io.Serializable;


/**
 * created on 2021-01-19 18:02
 *
 * @author wub
 */
@Data
public class IscResult<T> implements Serializable {

    private static final long serialVersionUID = 3892938465921752701L;

    private String code;
    private String msg;
    private T data;
}
