package com.jared.algorithmsimplementation.search;
/**
 * 二分潮州哦啊
 * @author jared
 * @date 2019-05-22 14:38
 * @return
 **/
public class BinarySearch {
    /**
     * 二分查找法
     * @param array
     * @param target
     * @return
     */
    public int arraySearch(int [] array,int target){
        int start = 0;
        //数组初始index = 0;
        int end =array.length-1 ;
        while (start <= end){
            int mid = (start+end)/2;
            int val = array[mid];
            if(val == target){
                return mid;
            }else if(val> target) {
                end  = mid-1;
            }else{
                start = mid+1;
            }
        }
        return  -1;
    }
    public void doubleArraySearch(int [][]array,int target){
        for (int i = 0; i < array.length; i++) {
            int [] arr = array[i];
            int search = arraySearch(arr, target);
            if(search != -1){
                System.out.println("arr["+i+"]["+search+"]");
            }
        }
    }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] array={1,3,4,5,6,7,8,9,20};
        int [][] doubleArray ={{1,2,3},{1,5,6},{7,8,9}};

        int i = b.arraySearch(array, 10);
        System.out.println(i);
    }
}
