package com.yh.java.test5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * IO流：
 * 1.创建一个文件user.txt.
 * 2.向文件写入序列化对象User
 * 属性:account,值:danny  属性:password,值:123456 属性:age,值:26 属性:high,值:172.5
 * 3.从文件user.txt中读出User对象的数据 name，age，high
 *
 * 程序分析：
 * 1.创建文件使用file.createNewFile();
 * 2.使用ObjectOutputStream和它的方法writeObject来进行写入对象。
 * 3.使用ObjectInputStream和它的readObject来进行对象的读取。
 * */
public class IOTest {

    public static void main(String[] args) {

        // 在D盘创建一个文件user.txt，使用File的方法
        File file = new File("D:", "user.txt");//指定文件路径
        try {
            file.createNewFile();// 创建文件
        } catch (IOException e1) {
        }

        if (file.exists()) {
            //文件的写入
            ForWrite(file);
            //文件的读取
            ForRead(file);
        } else {
            System.out.println("文件不存在！");
        }

    }

    private static void ForRead(File file) {
        // 文件的读取
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            //在输入流中读取对象
            User temp=(User) ois.readObject();
            System.out.println("读取的文件内容为：");
            System.out.println(temp);

        } catch (Exception e) {
            System.out.println(e.getMessage() + "错误!");
        }finally{
            try {
                ois.close();// 关闭输入流
            } catch (IOException e) {
            }

        }
    }

    private static void ForWrite(File file) {
        ObjectOutputStream oos =null;
        try {
            // 把对象写入到文件中，使用ObjectOutputStream
            oos = new ObjectOutputStream(
                    new FileOutputStream(file));
            // 创建对象
            User user = new User("danny", "123465", 26, 172.5);
            // 把对象写入到文件中
            oos.writeObject(user);
            System.out.println("写入文件完毕！");
        } catch (IOException e) {
            System.out.println(e.getMessage() + "错误！");
        }finally{
            try {
                oos.close();//关闭输出流
            } catch (IOException e) {
            }

        }
    }

}
