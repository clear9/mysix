package com.cn.mysix.index;

/**
 * @ClassName mysix
 * @Description mysix
 * @Author wub
 * @Date 2020/3/9 11:23
 * @Version 1.0
 */


import cn.hutool.core.util.RuntimeUtil;
import com.alibaba.fastjson.JSONObject;
import com.cn.mysix.bean.SysUser;
import com.cn.mysix.config.MessagerType;
import com.cn.mysix.retype.Msg;
import com.cn.mysix.service.TestSix;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Api("mysix测试模块")
@RestController()
@RequestMapping("/six")
public class mysix {



    @Autowired
    private TestSix testSix;


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
    public List<SysUser> sel(@RequestParam(required = false) Integer countid) {     //注解非必传参数  required = false

        return testSix.selectall(countid);

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

        return JSONObject.toJSONString(new Msg(MessagerType.SIX_INSERT, 200, (testSix.insert(sysUser) > 0) ? "成功" : "失败"));
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

        return JSONObject.toJSONString(new Msg(MessagerType.SIX_Update, 200, (testSix.update(sysUser) > 0) ? "成功" : "失败"));
    }

    @ApiOperation(value = "删除用户，根据count")
    @GetMapping("/del")
    public String del(@RequestParam Integer countid) {

        return JSONObject.toJSONString(new Msg(MessagerType.SIX_Delete, 200, (testSix.delete(countid) > 0) ? "成功" : "失败"));

    }


    @ApiOperation(value = "远程桌面")
    @GetMapping("/remote")
    public String remote() {

        RuntimeUtil.execForStr("mstsc");
        return JSONObject.toJSONString(new Msg(MessagerType.SIX_INSERT, 200,"调动完成"));
    }



}
