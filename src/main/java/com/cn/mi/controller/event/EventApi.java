package com.cn.mi.controller.event;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * created on 2021-01-05 11:11
 *
 * @author wub
 */
@Api(
        value = "EventApi",
        tags = {"消息管理API"}
)
public interface EventApi {

    @ApiOperation("接收第三方消息")
    @PostMapping({"/api/v1/event/receiver"})
    String eventReceiver(@ApiParam(name = "eventInfos",value = "消息内容") @RequestBody String eventInfos);


}
