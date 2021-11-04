package com.jared.algorithmsimplementation.atguigu;

/**
 * @author sou
 * 稀疏数组的实现
 */
public class _7_9_SparseArray {
    public static void main(String[] args) {
        //创建一个11行11列的棋盘
        int [][] array = new int[11][11];
        array[1][2] = 1;
        array[2][3] = 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf( "%d\t",array[i][j]);
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("总数：" + sum);
        //创建稀疏数组
        int [][] sparseArray = new int[sum+1] [3];
        //设定稀疏数组的第一列
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]!=0){
                    count ++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] =j;
                    sparseArray[count][2] = array[i][j];
                }
            }
        }
        //输出稀疏数组的样式
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }
        //恢复后的二维数组

        int[][] arrayCover = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i < sparseArray.length; i++) {
            arrayCover[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        //打印恢复后的二维数组
        for (int i = 0; i < arrayCover.length; i++) {
            for (int j = 0; j < arrayCover[i].length; j++) {
                System.out.printf( "%d\t",arrayCover[i][j]);
            }
            System.out.println("");
        }
    }
}
