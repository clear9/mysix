package com.cn.mysix.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * @ClassName SysUser
 * @Description SysUser
 * @Author wub
 * @Date 2020/3/9 17:41
 * @Version 1.0
 */



@ApiModel("用户信息")
@Data    /*该注解相当于同时加上以下注解@Setter @Getter,@ToString,@EqualsAndHashCode*/
@AllArgsConstructor     /*全参构造*/
@NoArgsConstructor      /*无参构造*/
public class SysUser implements Serializable {



    /**
     * 序号
     */
    @ApiModelProperty(value = "序号", example = "1，2，3")
    Integer count;
    /**
     * 账号
     */
    @ApiModelProperty(value = "用户名", example = "knight")
    String user;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", example = "aqa")
    String password;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "昵称", example = "knight")
    String name;
    /**
     * 数据字段
     */
    @ApiModelProperty(value = "标识参数", example = "Integer型，最好不要改")
    Integer fno;
    /**
     * 预留
     */
    @ApiModelProperty(value = "预留", example = "简介")
    String userdd;

}
