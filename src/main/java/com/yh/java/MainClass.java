package com.yh.java;

/**
 * 数据库操作：
 * 1.创建学生信息表 -- studentInfo。
 * 2.提供添加学生信息（id name phone）， 查询学生信息功能。
 * 3.将SQL语句写在代码中即可
 *
 * 程序分析：
 * 1.创建表格使用的是create table---
 * 2.添加表格信息使用的是insert into----
 * 3.查询信息使用的是select * from ---
 * */
public class MainClass {

    //1.创建学生信息表 的语句
    String sql1="create table studentInfo("
            + "id Integer primary key , "
            + "name varchar(10), "
            + "phone varchar(11),"
            + "); ";

    //2.添加学生信息。
    String sql2="insert into studentInfo values(1,'李文志','18777009999');";
    String sql3="insert into studentInfo values(2,'李嘉诚','18877009999');";

    //3.查询学生信息功能
    String sql4="select * from studentInfo ;";//查询所有用户的信息
    String sql5="select * from studentInfo where name='李文志'; " ;//查询姓名为李文志的用户的信息

}
