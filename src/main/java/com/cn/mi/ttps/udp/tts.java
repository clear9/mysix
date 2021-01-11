package com.cn.mi.ttps.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

/**
 * created on 2019-10-24 13:53
 *
 * @author: wub
 */
public class tts {


    public static void main(String[] args) {

        byte[] bytes = new byte[1024];
        DatagramSocket datagramSocket = null;
        try {
            datagramSocket = new DatagramSocket(8800);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        while (true) {
            try {
                assert datagramSocket != null;
                datagramSocket.receive(datagramPacket);
                bytes = datagramPacket.getData();

                String str = new String(bytes, StandardCharsets.UTF_8);
                System.out.println("收到UDP消息" + str);

            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
