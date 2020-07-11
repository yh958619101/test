package myframe;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Myframe {
    public static void main(String[] args) {
        try {
            Properties  properties=new Properties();
        InputStream is = Myframe.class.getClassLoader().getResourceAsStream("myframe.properties");

        //加载配置文件，并且把配置文件的信息封装到properties对象中

            properties.load(is);
            String   fullClassName= properties.getProperty("fullClassName");
            String   methodName= properties.getProperty("methodName");
            String   methodType=properties.getProperty("methodType");
            String   methodValue=properties.getProperty("methodValue");
            System.out.println(methodType);
            String[] strings = methodType.split(",");
            Class[]  classes=new Class[strings.length];
            for (int  i=0;i< strings.length;i++){
                classes[i]=Class.forName(strings[i]);
            }


            System.out.println(methodValue);
//创建类对象
            Class<?> aClass = Class.forName(fullClassName);
            Object o=aClass.newInstance();
            Method declaredMethod = aClass.getDeclaredMethod(methodName,classes);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(o,"18");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
