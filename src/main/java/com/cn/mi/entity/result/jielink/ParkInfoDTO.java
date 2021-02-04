package com.cn.mi.entity.result.jielink;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2021-01-19 18:09
 *
 * @author wub
 */

@AllArgsConstructor     /*全参构造*/
@NoArgsConstructor
@Data
public class ParkInfoDTO {

        private String projectCode;
        private String parkNo;
        private String parkId;
        private String parkName;
}
