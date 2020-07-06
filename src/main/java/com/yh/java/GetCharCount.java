package com.yh.java;

import java.util.HashMap;
import java.util.Map;

/**

 * 6.手动输入一个字符串，仅限小写字母，统计并输出每个字符在字符串中出现的次数,并输出。
 * 	提示(可以用Map)
 * 	实例：
 * 		输入：aaabbbccc
 * 		输出： a 3
 * 	                b 3
 *		      c 3
 */
public class GetCharCount {
    public static void main(String[] args) {
        String str = "aaabbbrcc";
        String reg = "^[a-z]*$";
        if (str.matches(reg)) {
            Map<Character, Integer> map = getCharCount(str);
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                System.out.println(e.getKey() + ": " + e.getValue());
            }
        }else {
            System.out.println("输入的字符不合法，不是小写字母");
        }
    }
    public static Map<Character,Integer> getCharCount(String str) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        char[] arr = str.toCharArray();
        for(int i = 0;i<str.length();i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], new Integer(1));
            }else {
                map.put(arr[i],map.get(arr[i])+1);
            }

        }
        return map;

    }
}