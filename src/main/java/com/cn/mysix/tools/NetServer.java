package com.cn.mysix.tools;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName NetServer
 * @Description NetServer
 * @Author wub
 * @Date 2020/10/23 17:07
 * @Version 1.0
 */


public class NetServer {

//    private static Logger logger=LoggerFactory.getLogger(getClass());

    /**
     * 判断主机地址能不能 ping 通，此处主机地址可以域名或者IP
     * @param host
     * @return
     */
    public static boolean ping(String host) {

        InetAddress inetAddress = null;
        boolean reachable = false;
        try {
            inetAddress = InetAddress.getByName(host);
            reachable = inetAddress.isReachable(1000);

        if(reachable) {
//                logger.info("ping success. Host name: " + inetAddress.getHostName() + ", IP addr: " + inetAddress.getHostAddress());
            return true;
        }else {
//                logger.info("ping failed.");
            return false;
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

        return false;
    }

}
