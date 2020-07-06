package com.yh.java;

import java.util.HashSet;
import java.util.Set;

/**
 *5、要求：随机打印50个随机（4-10长度）的字符串，要求字符串包含的范围是
 *	  所有的英文字母包含大小写和数字，按照编码顺序排序，每行打印4个，要求首字符对齐
 */
public class RandomStr {
    public static void main(String[] args) {
        Set<String> setStr = new HashSet<String>();
        for(int i = 0 ;i<50;i++) {
            setStr.add(randomStr(5));
        }

        int count = 1;
        for(String i:setStr){
            System.out.print(i+" ");
            if(count%4 == 0) {
                System.out.println();
            }
            count++;
        }
    }
    /**
     * @param strLen:随机字符串的长度
     */
    public static String randomStr(int strLen) {
        char[] str = new char[strLen];
        int i = 0;
        while(i<strLen) {
            int f = (int)Math.random()*3;
            if(f == 0) {
                str[i] = (char)('a' + Math.random()*26);
            }else if(f == 1) {
                str[i] = (char)('A' + Math.random()*26);
            }else {
                str[i] = (char)('0' + Math.random()*10);
            }
            i++;
        }

        return new String(str);
    }
}