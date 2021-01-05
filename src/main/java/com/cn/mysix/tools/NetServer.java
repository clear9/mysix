package com.cn.mysix.tools;


import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author wub
 * @version 1.0
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
