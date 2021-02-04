package com.cn.mi.entity.param.jielink;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * created on 2021-01-20 10:52
 *
 * @author wub
 */
@Data
public class VehicleAlarmSyncParamDO {

    @ApiModelProperty("操作类型")
    private Integer operator;
    @ApiModelProperty("车牌号码")
    private String plateNo;
    @ApiModelProperty("开始时间")
    private String beginTime;
    @ApiModelProperty("结束时间")
    private String endTime;
}
