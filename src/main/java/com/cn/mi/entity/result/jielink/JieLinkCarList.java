package com.cn.mi.entity.result.jielink;

import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * created on 2021-01-20 10:37
 *
 * @author wub
 */

@NoArgsConstructor
@Data
public class JieLinkCarList {


        private String deviceGuid;
        private String deviceId;
        private String deviceName;
        private String deviceIp;
        private String deviceGateway;
        private String deviceNetmask;
        private Integer deviceIoType;
        private String parentId;
        private String remark;
}
