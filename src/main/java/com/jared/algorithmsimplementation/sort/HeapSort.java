package com.jared.algorithmsimplementation.sort;

/**
 * 堆排序
 * 堆排序是一种树形选择排序，是对直接选择排序的有效改进。
 *
 * 堆的定义下：具有n个元素的序列 （h1,h2,...,hn),当且仅当满足（hi>=h2i,hi>=2i+1）或
 * （hi<=h2i,hi<=2i+1） (i=1,2,...,n/2)时称之为堆。在这里只讨论满足前者条件的堆。由堆的定义可以看出，
 * 堆顶元素（即第一个元素）必为最大项（大顶堆）。
 * 完全二 叉树可以很直观地表示堆的结构。堆顶为根，其它为左子树、右子树。
 * 思想:初始时把要排序的数的序列看作是一棵顺序存储的二叉树，
 * 调整它们的存储序，使之成为一个 堆，这时堆的根节点的数最大。
 * 然后将根节点与堆的最后一个节点交换。然后对前面(n-1)个数重新调整使之成为堆。
 * 依此类推，直到只有两个节点的堆，并对 它们作交换，最后得到有n个节点的有序序列。
 * 从算法描述来看，堆排序需要两个过程，一是建立堆，二是堆顶与堆的最后一个元素交换位置。
 * 所以堆排序有两个函数组成。一是建堆的渗透函数，二是反复调用渗透函数实现排序的函数。
 * @author jared
 * @date 2018-09-30 15:17
 **/
public class HeapSort {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,20};
    }
    public void HeapSort(){
        //1.将数组与堆联系一起
        //将堆顶与堆的最后一个元素交换位置
    }
}