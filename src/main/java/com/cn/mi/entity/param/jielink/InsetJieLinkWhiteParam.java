package com.cn.mi.entity.param.jielink;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * created on 2021-01-20 10:55
 *
 * 捷顺平台_车辆黑白名单添加 or 查询结果类
 * @author wub
 */
@Data
@NoArgsConstructor
@Builder
public class InsetJieLinkWhiteParam implements Serializable {

    private static final long serialVersionUID = -653260711402179587L;
    /**
     * 黑白名单唯一标识，添加时不填
     */
    private String blackGuid;
    /**
     * 车牌号
     */
    private String plateNumber;
    /**
     * 1 黑名单 2 灰名单 3 白名单
     */
    private int blackWhiteType;
    private String startDate;
    private String endDate;
    private String reason;
    private String remark;

}
