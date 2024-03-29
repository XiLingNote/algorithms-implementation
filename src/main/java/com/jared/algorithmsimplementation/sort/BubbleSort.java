package com.jared.algorithmsimplementation.sort;

import java.util.Arrays;

/**
 *  冒泡排序
  * @author jared
  * @date 2019-05-22 13:53
  *
  * 原理：比较两个相邻的元素，将值大的元素交换至右端。
  *
  * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。
  *  然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。
  *  重复第一趟步骤，直至全部排序完成。
  **/
public class BubbleSort {
    public static int [] bubbleSort_20220303(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("i"+ i);
            for (int j = 0; j < array.length - i - 1 ; j++) {
                System.out.println("j"+ j);
                if( array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]  = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array={9,1,4,3,4,5,6,7,8,9,20,19};
        bubbleSort_20220303(array);
        System.out.println(Arrays.toString(array));
    }
    public static int [] bubbleSort(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if(array[j]<array[j-1]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] =  array[temp];
                }
            }
        }
        return array;
    }

}
