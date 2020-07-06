package com.yh.java;

import java.util.*;

/**
 * @author yh
 * @version 1.0
 * @date 2020/4/30 0030 16:43
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("789");
        list.add("123");
        Set set = new HashSet();
        List newList = new  ArrayList();
        for (String cd:list) {
            if(set.add(cd)){
                newList.add(cd);
            }
        }
        System.out.println( "去重后的集合： " + newList);
        System.out.println("经典for循环");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Iterator循环");
        Iterator<String>  it=list.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
        System.out.println("增强for循环");

        for(String string:list){
            System.out.println(string);
        }
    }
}
