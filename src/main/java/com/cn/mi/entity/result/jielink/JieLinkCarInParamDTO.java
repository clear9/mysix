package com.cn.mi.entity.result.jielink;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2021-01-20 11:34
 *
 * @author wub
 */

@NoArgsConstructor
@Data
public class JieLinkCarInParamDTO {

    /**
     * 入场记录唯一标识
     */
    private String inRecordId;
    /**
     * 车场唯一标识
     */
    private String parkId;
    /**
     * 入场设备唯一标识 (同 deviceGuid)
     */
    private String inDeviceId;
    /**
     * 设备的名称，可定义为该通道名
     */
    private String inDeviceName;
    /**
     * 入场时间
     */
    private String inTime;
    /**
     * 车牌图片 url 地址，可以在浏览器访问
     */
    private String inImage;
    /**
     * 车牌号
     */
    private String plateNumber;
    private String plateColor;
    private String sealName;
    private String stationOperator;
    /**
     * 车场事件类型
     */
    private String parkEventType;
    private String remark;
    private String setmealNo;
}
