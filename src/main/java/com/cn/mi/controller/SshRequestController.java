package com.cn.mi.controller;

import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import com.cn.mi.entity.param.SshConnect;
import com.jcraft.jsch.Session;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;

/**
 * created on 2021-01-14 11:38
 *
 * ssh命令请求类
 * @author wub
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/ssh")
public class SshRequestController {

    private static Session session=null;


    @ApiOperation(value = "连接ssh会话")
    @PostMapping("/connect")
    public String connectSSH(@RequestBody SshConnect sshConnect) {
        log.info("连接ssh");
        try {
            session = JschUtil.getSession(sshConnect.getSshHost(), sshConnect.getSshPort(), sshConnect.getSshUser(), sshConnect.getSshPass());
        }catch (Exception e){
            log.info("连接失败");
            return "连接失败";
        }
        return "200";
    }

    @ApiOperation(value = "执行ssh命令")
    @GetMapping("/exec")
    public String execSSH(@RequestParam String cmd) {
        if(session!=null){
            log.info("开始执行..");
            return JschUtil.exec(session,cmd, StandardCharsets.UTF_8);
        }
        return "没有ssh连接";
    }

    @ApiOperation(value = "关闭ssh会话")
    @GetMapping("/close")
    public String closeSSH() {

        JschUtil.close(session);
        log.info("关闭ssh会话");
        return "200";
    }

    @ApiOperation(value = "上传文件到服务器")
    @GetMapping("/upload")
    public String uploadSSH(@ApiParam(name="Local",value="本地文件地址") @RequestParam String Local,@ApiParam(name="directory",value="上传到服务器的目录") @RequestParam String directory) {
        if(session!=null) {
            Sftp sftp = JschUtil.createSftp(session);
            sftp.put(Local, directory);
            log.info("上传完成..");
        }
        return "200";
    }

    @ApiOperation(value = "一键部署")
    @GetMapping("/deploy")
    public String deploy(){

        SshConnect sshConnect=new SshConnect();
        sshConnect.setSshHost("172.16.11.107");
        sshConnect.setSshPort(22);
        sshConnect.setSshUser("root");
        sshConnect.setSshPass("123.com");
        connectSSH(sshConnect);
        uploadSSH("F:/workspace/mysix/target/mySix.jar","/home/dockerfiles/myapp/");
        execSSH("sh /home/dockerfiles/myapp/restart");
        closeSSH();

        return "部署完成";
    }

}
