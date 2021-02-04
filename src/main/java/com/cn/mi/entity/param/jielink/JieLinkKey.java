package com.cn.mi.entity.param.jielink;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2021-01-19 17:50
 *
 * @author wub
 */

@Data
@Builder
@AllArgsConstructor     /*全参构造*/
@NoArgsConstructor      /*无参构造*/
public class JieLinkKey {


    private String userName;
    private String password;

}
