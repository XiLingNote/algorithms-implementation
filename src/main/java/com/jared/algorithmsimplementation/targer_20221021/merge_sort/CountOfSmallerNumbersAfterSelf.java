package com.jared.algorithmsimplementation.targer_20221021.merge_sort;

import java.util.LinkedList;
import java.util.List;

/**
 * 315 计算右侧小于当期元素的个数
 * 15721
 */
public class CountOfSmallerNumbersAfterSelf {
    private class Pair{
        int val,id;
        Pair(int val,int id){
            this.val = val;
            this.id  = id;
        }
    }
    private Pair[] temp;
    private int [] count;
    public List<Integer> countSmaller(int [] nums){
        int n = nums.length;
        count = new int [n];
        temp = new Pair[n];
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(nums[i],i);
        }
        sort(arr,0,n-1);
        List<Integer> res = new LinkedList<>();
        for (int c : count) {
            res.add(c);
        }
        return res;
    }
    private void sort(Pair[] arr,int lo,int hi){
        if(lo == hi){
            return; 
        }
        int mid = (hi + lo)/2;
        sort(arr,lo,mid);
        sort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }
    private void merge(Pair[]arr , int lo ,int mid,int hi){
        for (int i = lo; i <= hi ; i++) {
            temp[i]= arr[i];
        }
        int i = lo,j= mid +1;
        for (int p = lo; p <=hi ; p++) {
            if(i == mid+1){
                arr[p] = temp[j++];
            }else if(j == hi +1){
                arr[p] = temp[i++];
                count[arr[p].id] += j -mid -1;
            } else if (temp[i].val>temp[j].val) {
                arr[p] = temp[j++];
            }else {
                arr[p] = temp[i++];
                count[arr[p].id] += j - mid-1;
            }
        }
    }
    
}

class Solution {
    private void merge(Pair[] arr, int lo, int mid, int hi) {
        for (int i = lo; i <= hi; i++) {
            temp[i] = arr[i];
        }
        int i = lo, j = mid + 1;
        for (int p = lo; p <= hi; p++) {
            if (i == mid + 1) {
                arr[p] = temp[j++];
            } else if (j == hi + 1) {
                arr[p] = temp[i++];
// 更新 count 数组
                count[arr[p].id] += j - mid - 1;
            } else if (temp[i].val > temp[j].val) {
                arr[p] = temp[j++];
            } else {
                arr[p] = temp[i++];
// 更新 count 数组
                count[arr[p].id] += j - mid - 1;
            }
        }
    }
    // 归并排序
    private void sort(Pair[] arr, int lo, int hi) {
        if (lo == hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid + 1, hi);
        merge(arr, lo, mid, hi);
    }
    
    
    // 合并两个有序数组

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        count = new int[n];
        temp = new Pair[n];
        Pair[] arr = new Pair[n];
// 记录元素原始的索引位置，以便在 count 数组中更新结果
        for (int i = 0; i < n; i++){
            arr[i] = new Pair(nums[i], i);
        }
// 执⾏归并排序，本题结果被记录在 count 数组中
        sort(arr, 0, n - 1);
        List<Integer> res = new LinkedList<>();
        for (int c : count){
            res.add(c);
        }
        return res;
    }
    private class Pair {
        int val, id;
        Pair(int val, int id) {
// 记录数组的元素值
            this.val = val;
// 记录元素在数组中的原始索引
            this.id = id;
        }
    }
    // 归并排序所⽤的辅助数组
    private Pair[] temp;
    // 记录每个元素后⾯⽐⾃⼰⼩的元素个数
    private int[] count;
    // 主函数


}