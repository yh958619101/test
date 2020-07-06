package com.yh.java.test6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端
 * 文件传输功能！能够给客户端发送一个图片
 * */

public class TCPServer extends Thread {

    // 定义服务器接口ServerSocket
    ServerSocket server = null;

    // 定义一个服务器，定义端口
    public TCPServer(int port) {
        try {
            server = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 接收信息的线程
    @Override
    public void run() {
        super.run();
        try {

            while (true) {
                // 建立socket接口，accept方法是一个阻塞进程,等到有用户连接才往下走
                // 定义Socket类
                Socket socket = server.accept();
                // 在服务器显示连接的上的电脑、
                String hostMessage = socket.getInetAddress().getHostAddress().toString();
                System.out.println(hostMessage+"连接上了");

                // 向用户发送图片
                SendPictureToUser(socket);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 把发送给用户一个图片，涉及到写的操作OutStream
    private void SendPictureToUser(Socket socket) {
        // 拿到用户的socket对象，对其进行写入数据

        OutputStream os = null;
        FileInputStream fis = null;
        try {
            os = socket.getOutputStream();
            // 把D盘的一个图片发给用户
            File file = new File("D:", "mm.jpg");
            fis = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int len = 0;
            // 边读边写
            while ((len = fis.read(buf)) != -1) {
                os.write(buf, 0, len);
            }
            os.flush();// 刷新一下写入的数据，很有必要
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                //关闭打开的流
                fis.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
