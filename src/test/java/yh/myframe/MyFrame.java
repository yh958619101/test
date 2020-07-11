package yh.myframe;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyFrame {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException {
        Class<Demo1> demo1Class = Demo1.class;
        Demo1 demo1 = demo1Class.newInstance();
        int totalCheckMethod = 0;
        int execptionMethod = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
        bw.write("测试报告开始");
        //换行
        bw.newLine();

        Method[] declaredMethods = demo1Class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            boolean annotationPresent = declaredMethod.isAnnotationPresent(Check.class);
            if (annotationPresent) {
                totalCheckMethod++;
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(demo1);
                } catch (InvocationTargetException e) {
                    execptionMethod++;
                    e.printStackTrace();
                    bw.write("异常方法名称" + declaredMethod.getName());
                    bw.newLine();
                    bw.write("异常名称" + e.getCause().getClass().getName());
                    bw.newLine();

                    bw.write("异常描述" + "  " + e.getCause().getMessage());
                    bw.newLine();
                }
            }
        }
        bw.write("测试方法总数" + totalCheckMethod);
        bw.newLine();
        bw.write("...............");
        bw.newLine();
        bw.write("异常方法总数" + execptionMethod);
        bw.flush();
        bw.close();
    }
}