package com.cn.mi.ttps.tcp;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * created on 2021-02-05 09:49
 *
 * @author wub
 */

@Slf4j
public class TcpClient {

    public static void main(String[] ar) {

        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 10086);

        Socket socket = new Socket();

        try {
            socket.connect(address);
            String udpMS;
            Scanner input=new Scanner(System.in);
            //通过控制台输入消息
            udpMS=input.next();

            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            os.write(udpMS);
            os.flush();
            socket.shutdownOutput();
            String s = is.readLine();
            log.info("服务器回复：" + s);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
