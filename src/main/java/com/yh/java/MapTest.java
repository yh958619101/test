package com.yh.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * @author yh
 * @version 1.0
 * @date 2020/4/30 0030 16:59
 */
public class MapTest{
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("好人","小黑");
        map.put("坏人","小白");
        //大多数情况下采用这种遍历方式"注意：这个方式不可以进行remove()方法删除");
        System.out.println("===在for循环中使用entries实现Map的遍历，===");
        for (Map.Entry<String,String> entry:map.entrySet()){
            String  key=entry.getKey();
            String  value=entry.getValue();
            System.out.println(key+value);
        }
        System.out.println("==在for循环中遍历key或者values，一般适用于只需要map中的key或者value时使用==");
        ////单独遍历key
        for (String key : map.keySet()) {
            System.out.println(key);
        }
//单独遍历value
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("==通过iterator迭代器遍历，与方法一类似，这个方法可以执行remove()方法删除==");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String keys = entry.getKey();
            String values = entry.getValue();
            System.out.println(keys+values);
        }
        System.out.println("==在for循环中使用keySet实现Map的遍历==");
        for (String key : map.keySet()) {
            System.out.println(key);
            String value = map.get(key);
            System.out.println(value );
        }
        System.out.println("==通过Lambada表达式进行遍历==");
        map.forEach((key,value) ->  {
            System.out.println(key);
            System.out.println(value);
        });
    }
}
