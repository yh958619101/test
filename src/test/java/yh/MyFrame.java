package yh;


import yh.annotito.MyAnnot6;

import java.lang.reflect.Method;

@MyAnnot6(className = "com.yh.entity.Student", methodName ="say" )
public class MyFrame {
    public static void main(String[] args) throws NoSuchMethodException {
        //1.获取注解修饰的对象（Class,Method,Field）
        Class<MyFrame> myFrameClass = MyFrame.class;
        //2.获取注解对象
        MyAnnot6 annotation = myFrameClass.getAnnotation(MyAnnot6.class);
        //3.通过注解对象获取属性值
        String className = annotation.className();
        String methodName = annotation.methodName();
        System.out.println(className+","+methodName);

        //2.1.获取注解修饰的对象（Class,Method,Field）
        Method declaredMethod = myFrameClass.getDeclaredMethod("method1");
        //2.2获取注解对象
        MyAnnot6 annotation1 = declaredMethod.getAnnotation(MyAnnot6.class);
        //2.3.通过注解对象获取属性值
        String className1 = annotation1.className();
        String methodName1 = annotation1.methodName();
        System.out.println(className1+","+methodName1);
    }

    @MyAnnot6(className = "com.yh.entity.Student1",methodName = "say1")
    public void method1(){

    }
}

