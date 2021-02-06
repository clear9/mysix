package com.cn.mi.ttps.tcp;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * created on 2020/12/21 17:48
 *
 * @author: wub
 */

@Slf4j
public class TcpServer {
    public static void main(String[] args) {


        //1、创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口 1024-65535的某个端口
        ServerSocket serverSocket;
        try {
            serverSocket = new ServerSocket(10086);
            //2、调用accept()方法开始监听，等待客户端的连接
            Socket socket = serverSocket.accept();

                //3、获取输入流，并读取客户端信息
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String info;
                while ((info = br.readLine()) != null) {
                    log.info("我是服务器，客户端说：" + info);
                }
                socket.shutdownInput();//关闭输入流
                //4、获取输出流，响应客户端的请求s
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os);
                pw.write("你挑的嘛偶像！");
                pw.flush();

                //5、关闭资源
                pw.close();
                os.close();
                br.close();
                isr.close();
                is.close();
                socket.close();
                serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}