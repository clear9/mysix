package com.cn.mi.tools.netutils;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author wub
 * @version 1.0
 */
@Slf4j
public class NetServer {


    /**
     * 判断主机地址能不能 ping 通，此处主机地址可以域名或者IP
     * @param  host ip地址
     * @return ping结果
     */
    public static boolean ping(String host) {

        InetAddress inetAddress;
        boolean reachable;
        try {
            inetAddress = InetAddress.getByName(host);
            reachable = inetAddress.isReachable(1000);

        if(reachable) {
                log.info("ping success. Host name: " + inetAddress.getHostName() + ", IP addr: " + inetAddress.getHostAddress());
            return true;
        }else {
                log.info("ping failed.");
            return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
    }

        return false;
    }

}
