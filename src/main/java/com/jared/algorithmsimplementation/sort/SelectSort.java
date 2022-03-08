package com.jared.algorithmsimplementation.sort;

import java.util.Arrays;

/**
 *
 * 选择排序
 * @Author shouxu
 * @Date 2022/3/3 18:03
 */
public class SelectSort {
    public static int [] selectSort_20220303(int [] array){
        //选择最小的值插入当前
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i +1; j < array.length; j++) {
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array [minIndex];
            array[minIndex] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={9,1,4,3,4,5,6,7,8,9,20};

        for (int i = 0; i < array.length; i++) {
            int minindex = i;
            for (int j = i; j <array.length ; j++) {
                if(array[minindex]> array[j]){
                    minindex = j;
                }
            }
            if(i!= minindex){
                int temp = array[i];
                array[i] = array[minindex];
                array[minindex] = temp;

            }
        }

        System.out.println(Arrays.toString(array));
    }

}
