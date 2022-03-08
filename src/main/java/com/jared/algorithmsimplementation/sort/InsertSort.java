package com.jared.algorithmsimplementation.sort;

import java.util.Arrays;

/**
 *
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并
 * 插入。
 * @Author shouxu
 * @Date 2022/3/3 16:16
 */
public class InsertSort {
    public  int [] insetSort_20210303(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >0; j--) {
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] array={9,1,4,3,4,5,6,7,8,9,20,9,1};
        sort.insetSort_20210303(array);
        System.out.println(Arrays.toString(array));
    }


    /**
     * 插入排序：
     * 当前的索引的数据和之前的数据对比，如果当前数据小的话，切换
     * @param array
     * @return
     */
     public  int [] insetSortByMy(int [] array){

         for (int i = 0; i < array.length; i++) {
             if(i==0){
                 continue;
             }

             int val = array[i];

             for (int j = i-1; j >=0; j--) {
                if(array[j]>val){
                    array[j]= array[j+1];
                }

             }
         }
        return array;
     }
    public  int [] insertSort(int[] array){
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            System.out.println( "i+ 1:"+ i);

            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                System.out.println("pre: "+ preIndex);
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
