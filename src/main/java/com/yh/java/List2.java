package com.yh.java;
import java.util.*;

/**
 * @author yh
 * @version 1.0
 * @date 2020/4/30 0030 16:43
 */
public class List2 {
    public static void main(String[] args) {
      List<String> list=new ArrayList<String>();
      list.add("11");
        list.add("12");
        System.out.println("遍历list");
        for (String list1:list
             ) {
            System.out.println(list1);
        }
      Map<String,Object>  map=new HashMap<>();
        System.out.println("遍历map");
      map.put("1","2");
        map.put("3","4");
        map.forEach((key,value) ->  {
            System.out.println(key);
            System.out.println(value);
        });
       /* Map<String,Object>  set= (Map<String, Object>) new HashSet<Object>();
        set.put("11","22");
        set.put("33","44");
        set.forEach((key,value) ->  {
            System.out.println(key);
            System.out.println(value);
        });*/

    }
}
