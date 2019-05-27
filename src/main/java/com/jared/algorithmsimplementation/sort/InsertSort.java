package com.jared.algorithmsimplementation.sort;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        int[] array={9,1,4,3,4,5,6,7,8,9,20};
        int[] ints = sort.insetSortByMy(array);

        for (int i : ints) {
            System.out.println(i);

        }
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
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
}
