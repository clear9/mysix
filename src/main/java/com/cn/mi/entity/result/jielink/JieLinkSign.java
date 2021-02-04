package com.cn.mi.entity.result.jielink;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * created on 2021-01-19 17:56
 *
 * @author wub
 */

@AllArgsConstructor     /*全参构造*/
@NoArgsConstructor
@Data
public class JieLinkSign {

    private String appId;
    private String key;
    private List<ParkInfoDTO> parkInfo;

}
