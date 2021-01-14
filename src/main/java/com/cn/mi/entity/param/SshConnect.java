package com.cn.mi.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created on 2021-01-14 11:19
 *
 * ssh连接参数
 * @author wub
 */

@ApiModel("连接参数")
@Data    /*该注解相当于同时加上以下注解@Setter @Getter,@ToString,@EqualsAndHashCode*/
@AllArgsConstructor     /*全参构造*/
@NoArgsConstructor      /*无参构造*/
public class SshConnect {

    @ApiModelProperty(value = "主机")
    String sshHost;
    @ApiModelProperty(value = "端口")
    Integer sshPort;
    @ApiModelProperty(value = "用户名")
    String sshUser;
    @ApiModelProperty(value = "密码")
    String sshPass;

}
