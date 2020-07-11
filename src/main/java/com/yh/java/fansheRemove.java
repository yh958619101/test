package com.yh.java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class fansheRemove {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        char a = 'a';
        char b = (char) (a ^ 32);
        System.out.println(b);

//利用反射删除
        System.out.println("利用反射删除list元素");
        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('b');
        list.add('v');
        list.add('d');
        System.out.println(list);

        Class l = list.getClass();
        Method method = l.getMethod("remove", int.class);//不能写object对象，写object对象不会根据下标删除，，Integer对象报错
        method.invoke(list, 0);
        System.out.println(list);
    }

}
