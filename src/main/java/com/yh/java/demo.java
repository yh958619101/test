package com.yh.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo {
    public static void main(String[] args) {
//        安全删除集合中的元素
        List<String> string=new ArrayList<>();
        string.add("a");
        string.add("b");
        string.add("c");

//法一
        for (int i=0;i<string.size();i++){
            if(string.get(i).equals("a")){
                string.remove(i);
            }
        }
        //法2
        Iterator<String> iterator=string.iterator();
        while (iterator.hasNext()){
           String str= String.valueOf(iterator.next());
           if(str.equals("b")){
               iterator.remove();
           }
        }
     string.stream().forEach( System.out::println);
        System.out.println("==========累加计算练习==========");
        int tem=0;
        for (int i=1;i<=9 ;i++ )
        {
            tem+=i;
        }
        System.out.println("结果tem="+tem);//输出和=45;
        System.out.println("======1到10阶乘========");
        int sum = 1;
        for(int i=1; i<=10; i++) {
            sum *= i;
        }
        System.out.println("1*2*3*4*5*6*7*8*9*10的乘积是:"+sum);
        System.out.println("=======1到10阶乘之和============");
        int  sums=0;
        int b=1;
        for(int a=1; a<=10;a++){
            b=b*a;
            sums=sums+b;
        }
        System.out.println("1*2*3*4*5*6*7*8*9*10的乘积和是:"+sums);
    }
}
