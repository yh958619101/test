package yh.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String username;
    private String password;
    private Integer age;
    public String realname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Student(String username, String password, Integer age, String realname) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.realname = realname;
    }

    public Student() {
    }

    protected Student(String username){
        this.username=username;
    }
    public void say(){
        System.out.println("我是一个好人");
    }

    public void say(String sayContent){
        System.out.println("我要说："+sayContent);
    }

    protected  void say(String sayContent, Date date){
        System.out.println("我在"+new SimpleDateFormat("yyyy-MM-dd").format(date) +"说"+sayContent);
    }
}
