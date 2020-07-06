package com.yh.java.test6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 	客户端
 *  接收文件功能，
 *  接收服务器发送过的文件
 * */

public class TCPClient extends Thread {
    Socket socket = null;

    public TCPClient(String host, int port) {
        try {
            socket = new Socket(host, port);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {

        InputStream s =null;
        FileOutputStream fos=null;
        try {
            // 读Sock里面的数据，把读取到的文件写到某个位置
            s = socket.getInputStream();
            byte[] buf = new byte[1024];
            int len = 0;
            fos=new FileOutputStream(new File("C:","server.jpg"));//文件存放的位置
            //边读边写
            while ((len = s.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
            fos.flush();//刷新一下流

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                //关闭打开的流
                s.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}