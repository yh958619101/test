package yh;

import yh.entity.Student;
import java.lang.reflect.Field;
public class demo3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.加载类对象
        Class<Student> studentClass = Student.class;
       //解析成员变量
         Field[] fieldss = studentClass.getFields();
        for (Field field : fieldss) {
            System.out.println(field.getName());
        }
         Student  stu=new Student();
        stu.setUsername("zx");
        Field[] declaredFields = studentClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+declaredField.getType());
        }
//获取成员变量值
        Field realname = studentClass.getField("realname");
        System.out.println(realname);
        //给stu这个变量的rename字段赋值
        realname.set(stu,"你好");
        System.out.println("1"+stu.getRealname());
        System.out.println("2"+realname.get(stu));
        //不能获取私有的,需要getDeclaredField
        Field username = studentClass.getDeclaredField("username");
        System.out.println(username);
       //暴力访问,操作所有字段
        username.setAccessible(true);
       username.set(stu,"我好");
        System.out.println(username.get(stu));
    }
}