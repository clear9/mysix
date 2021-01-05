package com.cn.mysix.index;

import com.cn.mysix.retype.Msg;
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
        tags = {"事件管理API"}
)
public interface EventApi {

    @ApiOperation("接收事件")
    @PostMapping({"/api/v1/event/receiver"})
    String eventReceiver(@ApiParam(name = "eventInfos",value = "事件内容") @RequestBody String eventInfos);


}
