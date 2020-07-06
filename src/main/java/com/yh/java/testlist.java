package com.yh.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author yh
 * @version 1.0
 * @date 2020/4/27 0027 12:21
 */
public class testlist {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("11");
        list1.add("11");
        list1.add("12");
        list1.add("15");
        list1.add("16");
        System.out.println(list1);
List<String> list2 = new ArrayList<>(new HashSet<String>(list1));//去重后的集合
Collections.sort(list2);//排序
        System.out.println(list2);
        Collections.reverse(list2);//倒序排序
    }
}
