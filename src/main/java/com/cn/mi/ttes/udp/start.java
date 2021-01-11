package com.cn.mi.ttes.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * created on 2019-10-24 15:07
 *
 * @author: wub
 */
public class start {

    public static void main(String[] args) {
        while (true){
            try {
                Scanner input=new Scanner(System.in);
                //通过控制台输入udp消息
                String udpMS=input.next();

                DatagramSocket datagramSocket = new DatagramSocket();
                //准备数据，把数据封装到数据包中。

                //创建了一个数据包
                DatagramPacket packet = new DatagramPacket(udpMS.getBytes(), udpMS.getBytes().length, InetAddress.getLocalHost() , 8800);
                //调用udp的服务发送数据包
                datagramSocket.send(packet);
                //关闭资源 ---实际上就是释放占用的端口号
                datagramSocket.close();
            }
            catch (Exception e){
                System.out.println("消息发送异常退出...");
                break;
            }
        }

    }
}
