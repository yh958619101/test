package com.yh.java;

import redis.clients.jedis.Jedis;

public class Test {


    /*
     *
     * 冒泡排序
     *
     * //
     */

    public static void main(String[] args) {
        int[] score={5,3,2,4,6,8,9,10,1,7};
        for(int i=0;i<score.length-1;i++)
        {
            for(int j=0;j<score.length-i-1;j++){
                if(score[j]>score[j+1]){
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }
            System.out.print("第"+(i+1)+"趟数组：");
            for(int a=0;a<score.length;a++){
                System.out.print(score[a]);
            }
            System.out.print("\n");
        }
        System.out.print("排好的数组:");
        for(int a=0;a<score.length;a++){
            System.out.print(score[a]);
        }
        Jedis jedis=new Jedis("127.0.0.1", 6379);
        // jedis.auth("123456");
        jedis.set("wxf", "我很强");
        String value=jedis.get("wxf");
        System.out.println(value);
        //释放资源
        jedis.close();
    }
}