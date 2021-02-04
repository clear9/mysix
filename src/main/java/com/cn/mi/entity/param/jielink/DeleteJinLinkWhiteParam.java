package com.cn.mi.entity.param.jielink;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * created on 2021-01-20 11:17
 *
 * @author wub
 */
@Data
@Builder
public class DeleteJinLinkWhiteParam implements Serializable {

    private static final long serialVersionUID = 2477456918790250674L;

    /**
     * 黑白名单唯一标识，与车牌号二选一，目前使用车牌号
     */
    private String blackGuid;
    /**
     * 车牌号
     */
    private String plateNumber;

}
