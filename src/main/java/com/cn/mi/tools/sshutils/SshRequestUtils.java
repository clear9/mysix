package com.cn.mi.tools.sshutils;

import cn.hutool.extra.ssh.JschUtil;
import cn.hutool.extra.ssh.Sftp;
import com.cn.mi.entity.param.SshConnect;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * created on 2021-01-14 15:14
 * <p>
 * ssh命令请求实现类
 *
 * @author wub
 */
@Slf4j
@Service
public class SshRequestUtils {

    private static Session session = null;

    /**
     * @param sshConnect 连接参数
     * @return 结果
     */
    public boolean connectSSH(SshConnect sshConnect) {
        try {
            session = JschUtil.getSession(sshConnect.getSshHost(), sshConnect.getSshPort(), sshConnect.getSshUser(), sshConnect.getSshPass());
        } catch (Exception e) {
            log.info("连接失败");
            return false;
        }
        log.info("连接成功");
        return true;
    }

    /**
     * @param cmd 要执行的命令
     * @return  结果
     */
    public String execSSH(String cmd) {
        String result = "没有ssh连接";
        if (session == null || !session.isConnected()) {
            return result;
        }
        try {
            result = JschUtil.exec(session, cmd, StandardCharsets.UTF_8);
        } catch (Exception e) {
            log.info("失败,建议重连");
            return "失败,建议重连";
        }
        log.info("执行命令"+cmd);
        return result;
    }

    /**
     * 关闭ssh会话
     * @return 结果
     */
    public String closeSSH() {
        JschUtil.close(session);
        log.info("关闭ssh会话");
        return "关闭ssh会话";

    }

    /**
     *
     * @param Local 本地文件全路径
     * @param directory 上传到服务器的目录
     * @return 结果
     */
    public String uploadSSH(String Local, String directory) {
        String result = "没有ssh连接";
        if (session == null || !session.isConnected()) {
            return result;
        }
        try {
            Sftp sftp = JschUtil.createSftp(session);
            sftp.put(Local, directory);
        } catch (Exception e) {
            log.info("失败,建议重连");
            return "失败,建议重连";
        }
        log.info("上传完成。。");
        return "上传完成。。";
    }
}