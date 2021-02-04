package com.cn.mi.entity.param.jielink;

import lombok.Builder;
import lombok.Data;

/**
 * created on 2021-01-20 14:40
 *
 * @author wub
 */

@Builder
@Data
public class SelectJieLinkWhiteParam {

    private int pageIndex;
    private int pageSize;
    private String plateNumber;
    private int blackWhiteType;
    /**
     * 记录的唯一标识 如果添值，则其他条件失效
     */
    private String blackGuid;

}
