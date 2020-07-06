package com.yh.java;

import java.util.*;

public class Removelist {

    /**
     * 数组排序的写法
     * @param array
     * @return
     */
    public static Integer[] unique(int[] array){

        Map<Integer,Object> map = new HashMap();


        /*将所有元素放到Map的Key中    得到去重复的key集合**/
        for(int el : array){
            map.put(el, true);
        }

        /*将Key中所有元素集合转换成数组**/
        Set<Integer> set = map.keySet();
        Integer[] a = new Integer[set.size()];

        //返回泛型数组
        return map.keySet().toArray(a);
    }
    /**
     * 测试函数
     * @param args
     */
    public static void main(String[] args) {
        //定义冗余数组
        int[] array = {6,8,3,4,1,2,7,8,10,3,4,8};

        //获取去重数组
        Integer[] uniqueArray = unique(array);

        //打印下结果
        for (Integer integer : uniqueArray) {
            System.out.println(integer);
        }


    }

}