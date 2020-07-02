package com.jared.algorithmsimplementation.tujie;

/**
 * 图解算法的二分查找算法
 *
 * @Author shouxu
 * @Date 2020/7/2 16:19
 */
public class BinarySearch_01 {

    // has to return boxed integer in order to comfort to interface defined in the book
    private static Integer binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high){
            if(nums[low] == target){
                return low;
            }
            if(nums[high] == target){
                return  target;
            }
            int mid = (low + high)/2;
            int num = nums[mid];
            if( num == target){
                return mid;
            }
            if(target > num){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};
        // 1
        System.out.println(binarySearch(myList, 9));
        // null
        System.out.println(binarySearch(myList, 7));
    }
}
