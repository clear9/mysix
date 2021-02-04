package com.cn.mi.entity.result.jielink;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2021-01-20 11:49
 *
 * @author wub
 */

@NoArgsConstructor
@Data
public class JieLinkCarOutParamDTO {


    /**
     * 车场唯一标识
     */
    private String parkId;
    /**
     * 出场记录唯一标识
     */
    private String outRecordId;
    /**
     * 出场设备标识
     */
    private String outDeviceId;
    /**
     * 出场设备 名称 (通道名称)
     */
    private String outDeviceName;
    /**
     * 出场图片地址，可以在浏览器访问
     */
    private String outImage;
    private String inRecordId;
    private String inDeviceId;
    private String inDeviceName;
    private String inTime;
    /**
     * 出场时间
     */
    private String outTime;
    /**
     * 车牌号
     */
    private String plateNumber;
    private String plateColor;
    private String inImage;
    private String sealName;
    private String stationOperator;
    private Integer chargeTotal;
    private Integer discountAmount;
    private Integer charge;
    /**
     * 车场事件 类型
     */
    private String parkEventType;
    private String remark;
    private String setmealNo;
}
