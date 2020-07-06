package com.yh.java;

import java.util.*;

public class demo2 {

    static class  phone{
        private   String name;
        public phone(){
            System.out.println("phone()");
        }
        public phone(String name){
            this.name=name;
        }
        public   String  getName(){
            return  name;
        }
    }
    public static void main(String[] args)  throws   Exception {
        //如何序列化一个对象

        System.out.println("------------------------------");
        Collection c = new HashSet();
        c.add("holy");
        c.add("shit");
        Iterator it = c.iterator();
        System.out.println(c.getClass());
        System.out.println(it.getClass());
        System.out.println(it.hasNext());

    }

}
