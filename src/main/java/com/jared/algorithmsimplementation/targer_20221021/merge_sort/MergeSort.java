package com.jared.algorithmsimplementation.targer_20221021.merge_sort;

import java.util.Arrays;

/**
 * 归并
 */
public class MergeSort {
     private static int [] temp ;

    public static void main(String[] args) {
        int[] ints = {3, 2, 1,4};
        sort(ints);
        System.out.printf(Arrays.toString(ints));
    }
     private static void sort(int[] nums){
         //开辟辅助函数空间
        temp = new int[nums.length];
        sort(nums,0,nums.length-1);
     }

    /**
     * 子数组 nums[ lo ... ri] 排序
     * @param nums
     * @param lo
     * @param hi
     */
     private static void sort(int[] nums,int lo,int hi){
        if(lo == hi){
            return;
        }
        int mid = (lo + hi)/2;
        
        sort(nums,lo,mid);
         
        sort(nums,mid+1,hi);
        merge(nums,lo,mid,hi); 
     }
     private static void merge(int [] nums  ,int lo, int mid,int hi){
         for (int i = lo; i <=hi ; i++) {
             temp[i] = nums[i];
         }
         int i = lo,j = mid +1;
         for (int p = lo; p <=hi ; p++) {
             if(i == mid +1){
                 nums[p] = temp[j++];
             } else if (j == hi+1) {
                 nums[p] = temp[i++];
             } else if (temp[i]>temp[j]) {
                 nums[p]=temp[j++];
             }else {
                 nums[p]= temp[i++];
             }
         }
     }
}
