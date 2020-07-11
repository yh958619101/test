package yh;

import yh.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class demo5 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        //1.加载类对象
        Class<Student> studentClass = Student.class;
        //解析成员方法
        Method[] methods = studentClass.getMethods();
        for (Method method : methods) {
            System.out.println("1"+method.toString());
        }
//获取protected
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("protected"+ "  "+  declaredMethod);
        }
        //获取某个方法
        Student student = studentClass.newInstance();
        Method say = studentClass.getMethod("say");
         say.invoke(student);

        Method say1 = studentClass.getMethod("say", String.class);
        say1.invoke(student,"我什么也不想说");

        Method say2 = studentClass.getDeclaredMethod("say", String.class, Date.class);
        say2.setAccessible(true);
        say2.invoke(student,"我什么也不想说",new Date());

    }
}