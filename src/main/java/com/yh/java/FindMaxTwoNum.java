package com.yh.java;
import java.util.Arrays;
/**
 *3、手动输入一个存储整数的数组，要求输出数组里面的2个最大值。
 *	实例：
 *		输入：1,2,5,9,84,3,2
 *		输出：84,9
 */
public class FindMaxTwoNum {
    public static void main(String[] args) {
        int[] array = {1,2,5,9,84,3,2};
        System.out.println("数组"+Arrays.toString(array)+"里面最大的2个数为：");
        findMaxTwoNum(array);

}
    public static void findMaxTwoNum(int[] array) {
        int[] result = {0,0};
        for(int i = 0 ;i<array.length;i++) {
            for(int j = 0;j<array.length-i-1;j++) {
                if(array[j]<array[j+1]) {
                    int tmp;
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        System.out.println(array[0]+"、"+array[1]);
    }

}
