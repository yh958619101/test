package yh;

import yh.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class demo4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException,  InstantiationException {
        //1.加载类对象
        Class<Student> studentClass = Student.class;
        //2.解析构造器
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.toString());
        }

        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.toString());
        }

        Constructor<Student> constructor = studentClass.getConstructor();

        System.out.println(constructor.toString());
        Constructor<Student> constructor2 = studentClass.getConstructor(String.class,String.class,Integer.class,String.class);
        System.out.println(constructor2.toString());
        Constructor<Student> constructor3 = studentClass.getDeclaredConstructor(String.class);
        System.out.println(constructor3.toString());
        constructor3.setAccessible(true);
        Student lisi = null;
        try {
            lisi = constructor3.newInstance("lisi");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(lisi.getUsername());
        //通过无参构造去创建对象时，推荐使用如下方法，类对象.newInstance();
        Student student = studentClass.newInstance();
    }
}