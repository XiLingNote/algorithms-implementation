package com.jared.algorithmsimplementation.sort;

/**
 * 选择排序
 */
public class SelectSort {
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
        for (int i : array
             ) {
            System.out.println(i);

        }
    }
}
