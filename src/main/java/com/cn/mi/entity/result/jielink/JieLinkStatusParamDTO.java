package com.cn.mi.entity.result.jielink;

import lombok.Data;

import lombok.NoArgsConstructor;

/**
 * created on 2021-01-20 12:18
 *
 * @author wub
 */
@NoArgsConstructor
@Data
public class JieLinkStatusParamDTO {
    /**
     * 设备 guid 唯一标识
     */
    private String deviceGuid;
    /**
     * 设备名称
     */
    private String deviceName;
    /**
     * 出入口类 型
     */
    private Integer deviceIoType;
    /**
     * 设备状态
     */
    private String deviceStatus;
}
