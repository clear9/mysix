package com.cn.mi.controller.ssh;

import com.cn.mi.config.MessageType;
import com.cn.mi.entity.param.SshConnect;
import com.cn.mi.entity.result.Msg;
import com.cn.mi.tools.sshutils.SshRequestUtils;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * created on 2021-01-14 11:38
 * <p>
 * ssh命令请求类
 *
 * @author wub
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/ssh")
public class SshRequestController {

    private final SshRequestUtils sshRequestUtils;

    public SshRequestController(SshRequestUtils sshRequestUtils) {
        this.sshRequestUtils = sshRequestUtils;
    }

    @ApiOperation(value = "连接ssh会话")
    @PostMapping("/connect")
    public Msg connectSSH(@RequestBody SshConnect sshConnect) {
        return new Msg(MessageType.RETURN_CODE, 200, sshRequestUtils.connectSSH(sshConnect) ? "连接成功" : "连接失败");
    }

    @ApiOperation(value = "执行ssh命令")
    @GetMapping("/exec")
    public Msg execSSH(@RequestParam String cmd) {

        return new Msg(MessageType.RETURN_CODE, 200, sshRequestUtils.execSSH(cmd));
    }

    @ApiOperation(value = "关闭ssh会话")
    @GetMapping("/close")
    public Msg closeSSH() {

        return new Msg(MessageType.RETURN_CODE, 200, sshRequestUtils.closeSSH());
    }

    @ApiOperation(value = "上传文件到服务器")
    @GetMapping("/upload")
    public Msg uploadSSH(@ApiParam(name = "Local", value = "本地文件地址") @RequestParam String Local,
                         @ApiParam(name = "directory", value = "上传到服务器的目录") @RequestParam String directory) {

        return new Msg(MessageType.RETURN_CODE, 200, sshRequestUtils.uploadSSH(Local, directory));
    }

    @ApiOperation(value = "一键部署")
    @GetMapping("/deploy")
    public Msg deploy() {

        SshConnect sshConnect = new SshConnect();
        sshConnect.setSshHost("192.168.1.149");
        sshConnect.setSshPort(22);
        sshConnect.setSshUser("root");
        sshConnect.setSshPass("123.com");
        if (sshRequestUtils.connectSSH(sshConnect)) {
            sshRequestUtils.uploadSSH("F:/workspace/mysix/target/mySix.jar", "/home/dockerfiles/myapp/");
            sshRequestUtils.execSSH("sh /home/dockerfiles/myapp/restart");
            sshRequestUtils.closeSSH();
            return new Msg(MessageType.RETURN_CODE, 200, "部署完成..");
        }
        return new Msg(MessageType.RETURN_CODE, 200, "连接失败..");
    }

}