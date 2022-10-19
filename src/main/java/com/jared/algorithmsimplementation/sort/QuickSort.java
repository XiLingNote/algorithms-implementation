package com.jared.algorithmsimplementation.sort;

import java.util.HashMap;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;

/**
 *
 * 算法步骤
 *
 *从数列中挑出一个元素，称为 "基准"（pivot）;
 *
 *重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处
 * 数列的中间位置。这个称为分区（partition）操作；递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序
 * 快速排序
 * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
 * 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
 * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]的值交换；
 * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]的值交换；
 * 5）重复第3、4步，直到i=j； (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。
 * 找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。
 */
public class QuickSort {
    //arr 需要排序的数组
    //low 开始时最左边的索引=0
    //high 开始时最右边的索引=arr.length-1
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp;
        if(low>high){
            return;
        }
        i=low;
        //左边哨兵的索引
        j=high;
        //右边哨兵的索引
         //temp就是基准位
        temp = arr[low];
        //以最左边为  基准位
        while (i<j) {
            //先看右边，依次往左递减
            //先从右往左找一个小于 基准位的数
            //当右边的哨兵位置所在的数>基准位的数 时
            //继续从右往左找（同时 j 索引-1）
            //找到后会跳出 while循环
            while (temp<=arr[j]&&i<j) {
                j--;
            }

            //再看左边，依次往右递增
            //步骤和上面类似
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {

            //z、y 都是临时参数，用于存放 左右哨兵 所在位置的数据
               int z = arr[i];
               int  y = arr[j];

               // 左右哨兵 交换数据（互相持有对方的数据）
                arr[i] = y;
                arr[j] = z;

            }
        }
//这时 跳出了 “while (i<j) {}” 循环
//说明 i=j 左右在同一位置
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];//或 arr[low] = arr[j];
        arr[i] = temp;//或 arr[j] = temp;
//i=j
//这时  左半数组<(i或j所在索引的数)<右半数组
//也就是说(i或j所在索引的数)已经确定排序位置， 所以就不用再排序了，
// 只要用相同的方法 分别处理  左右数组就可以了
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }
    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
