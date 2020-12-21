package com.cn.mysix.ttes.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * created on 2019-10-24 13:53
 *
 * @author: wub
 */
public class tts {


    public static void main(String[] args) {

        byte[] bytes=new byte[1024];

        try {
            DatagramSocket datagramSocket =new DatagramSocket(8800);
            DatagramPacket datagramPacket =new DatagramPacket(bytes,bytes.length);

            while (true){
                datagramSocket.receive(datagramPacket);
                bytes=datagramPacket.getData();

                System.out.println(bytes);

                String str=new String(bytes,"UTF-8");
                System.out.println("UDP消息："+str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
