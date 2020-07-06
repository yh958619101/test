package com.yh.java;

import java.util.Arrays;

/**
 *2.程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。
 *程序要求：
 *	输入：整型数组中的元素个数及各个元素。
 *	输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。
 */
public class CountAvg {
    public static void main(String[] args) {
        int[] array = {1,23,4,13,6};
        System.out.println(Arrays.toString(array)+"的平均值："+avg(array)+"\n" +
                "大于和小于平均值元素的个数分别为："+Arrays.toString(countAvg(array)));

    }
    public static int[] countAvg(int[] array) {
        int gt = 0; //grater than
        int lt = 0;	//less than
        int[] result = {0,0};
        int average = avg(array);
        for(int i = 0;i<array.length;i++) {
            if(array[i]>average) {
                gt++;
            }else if(array[i]<average) {
                lt++;
            }
        }
        result[0] = gt;
        result[1] = lt;
        return result;

    }
    /**
     * average
     * @param array
     * @return
     */
    public static int avg(int[] array) {
        int average = 0;
        int sum = 0;
        for(int i = 0 ;i<array.length;i++) {
            sum += array[i];
        }

        average = sum/array.length;
        return average;
    }

}
