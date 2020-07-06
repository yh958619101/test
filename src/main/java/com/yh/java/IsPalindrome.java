package com.yh.java;

import java.util.Scanner;

/**
 *4、回文数字判断。
 *题目描述：
 *	有这样一类数字，他们顺着看和倒着看是相同的数，例如：121,656,2332等，这样的数字就称为：
 *	回文数字。编写一个函数，判断某数字是否是回文数字。
 */
public class IsPalindrome {
    public static void main(String[] args) {
        System.out.print("请输入一个回文数字：");
        Scanner console  = new Scanner(System.in);
        String numStr = console.nextLine();
        if(isPalindrome(numStr)) {
            System.out.println(numStr+"是回文数字！");
        }else{
            System.out.println(numStr+"不是回文数字！");
        }

    }

    public static boolean isPalindrome(String str){
        boolean result = false;
        for(int i = 0 ;i<=str.length()/2-1;i++) {
            if(str.charAt(i) == str.charAt(str.length()-1-i)) {
                result = true;
            }else {
                result = false;
            }
        }

        return result;
    }

}