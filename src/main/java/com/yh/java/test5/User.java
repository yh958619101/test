package com.yh.java.test5;

import java.io.Serializable;
/*1 创建一个文件user.txt.
2 向文件写入json数据
key:account,value:danny
key:password,value:123456
key:age,value:26
key:high,value:172.5
3 从文件user.txt中读出数据 name，age，high
*/
public class User implements Serializable {// 实现序列化
    String account = "";
    String password = "";
    int age = 0;
    double height = 0;

    // 重写构造方法，方便数的传入
    public User(String account, String password, int age, double height) {
        super();
        this.account = account;
        this.password = password;
        this.age = age;
        this.height = height;
    }

    // 重写toString方法，方便显示
    @Override
    public String toString() {
        return "account=" + account + ", age=" + age + ", height=" + height;
    }

}
