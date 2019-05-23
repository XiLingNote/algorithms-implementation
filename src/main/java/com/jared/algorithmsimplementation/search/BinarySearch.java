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

    public boolean Find(int target, int [][] array) {
        for(int i = 0;i<array.length;i++){
            if(findByArray(target,array[i])!=-1) {
                return true;
            }
        }
        return false;
    }
    public int findByArray(int target,int [] array){
        int start = 0;
        int end = array.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            int val = array[mid];

            if( val== target){
                return mid;
            }
            if(val > target){
                end = mid -1;
            }else if(val < target){
                start = mid+1;
            }
        }
        return -1;
    }
    /**
     * 二分查找的
     * @param args
     */
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int [][] doubleArray = {{1,2,3},{1,5,6},{7,8,9}};
        int[] array = {1,2,3};

        for (int i = 0; i < 49; i++) {
            System.out.println(i+"--"+b.Find(i,doubleArray));
        }

    }
}
