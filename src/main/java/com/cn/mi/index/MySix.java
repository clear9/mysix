package com.cn.mi.index;

import cn.hutool.core.util.RuntimeUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.cn.mi.bean.SysUser;
import com.cn.mi.config.MessageType;
import com.cn.mi.retype.Msg;
import com.cn.mi.service.EventAsyncService;
import com.cn.mi.service.TestSix;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * created on 2021-01-11 13:50
 *
 * @author wub
 */


@Slf4j
@Api("MySix测试模块")
@RestController()
@RequestMapping("/six")
public class MySix {


    private final TestSix testSix;

    private final EventAsyncService eventAsyncService;

    public MySix(EventAsyncService eventAsyncService, TestSix testSix) {
        this.eventAsyncService = eventAsyncService;
        this.testSix = testSix;
    }


    @ApiOperation(value = "第一个测试")
    @GetMapping("/0")
    public String six() {


        Msg msg = new Msg("six", 200, "真的");

        String re = JSONObject.toJSONString(msg);

        log.info("答案：" + re);
        return re;
    }

    @ApiOperation(value = "用户表查询，可以输入User，不输则查全部")
    @GetMapping("/sel")
    public String  sel(@RequestParam(required = false) Integer countId) {     //注解非必传参数  required = false

        return JSONObject.toJSONString(new Msg(MessageType.SIX_SELECT,200,testSix.selectAll(countId)));

    }

    @ApiOperation(value = "新增用户")
    @PostMapping("/ins")
    public String ins(@RequestParam String User, @RequestParam String Password, @RequestParam String Name, @RequestParam Integer Fno, String Userdd) {

        SysUser sysUser = new SysUser();
        sysUser.setUser(User);
        sysUser.setPassword(Password);
        sysUser.setName(Name);
        sysUser.setFno(Fno);
        sysUser.setUserdd(Userdd);

        return JSONObject.toJSONString(new Msg(MessageType.SIX_INSERT, 200, (testSix.insert(sysUser) > 0) ? "成功" : "失败"));
    }

    @ApiOperation(value = "修改用户信息，根据count和User")
    @PostMapping("/upd")
    public String upd(@RequestParam Integer count, @RequestParam(required = false) String User, String Password, String Name, String Userdd) {

        SysUser sysUser = new SysUser();
        sysUser.setCount(count);
        sysUser.setUser(User);
        sysUser.setPassword(Password);
        sysUser.setName(Name);
        sysUser.setUserdd(Userdd);

        return JSONObject.toJSONString(new Msg(MessageType.SIX_Update, 200, (testSix.update(sysUser) > 0) ? "成功" : "失败"));
    }

    @ApiOperation(value = "删除用户，根据count")
    @GetMapping("/del")
    public String del(@RequestParam Integer countId) {

        return JSONObject.toJSONString(new Msg(MessageType.SIX_Delete, 200, (testSix.delete(countId) > 0) ? "成功" : "失败"));

    }


    @ApiOperation(value = "远程桌面")
    @GetMapping("/remote")
    public String remote() {

        RuntimeUtil.execForStr("mstsc");
        return JSONObject.toJSONString(new Msg(MessageType.SIX_INSERT, 200, "调动完成"));
    }

    @ApiOperation(value = "接收消息")
    @GetMapping("/receiver")
    public String receiver(@RequestParam String id) {

        Msg msg=new Msg();
        msg.setMsgType(id);

        eventAsyncService.dispose(JSONUtil.toJsonStr(msg));

        return "200";
    }

}

