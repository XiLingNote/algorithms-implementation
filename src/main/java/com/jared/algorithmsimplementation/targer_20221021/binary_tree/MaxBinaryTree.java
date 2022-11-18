package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

import java.util.List;

/**
 * 654 最大二叉树
 */
public class MaxBinaryTree {
    public static void main(String[] args) {
        MaxBinaryTree maxBinaryTree = new MaxBinaryTree();
        TreeNode treeNode = maxBinaryTree.constructMaximumBinaryTree(new int[]{1, 2, 3});
        BinaryTreePreorderTraversal b = new BinaryTreePreorderTraversal();
        List<Integer> integers = b.preorderTraversal(treeNode);
        System.out.printf(integers.toString());
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null || nums.length ==0){
            return null;
        }
        int maxNum = nums[0];
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>maxNum){
                maxNum = nums[i];
                maxIndex = i;
            }
        }
        TreeNode treeNode = new TreeNode(maxNum);
        
        treeNode.left = constructMaximumBinaryTree(build(nums, 0,maxIndex));
        treeNode.right = constructMaximumBinaryTree(build(nums,maxIndex+1,nums.length));
        return treeNode;
    }
    public int[] build(int nums[],int start,int end){
        int[] a = new int[end - start];
        int index =0;
        for (int i = start; i < end; i++) {
            a[index] = nums[i];
            index++;
        }
        return a;
    }
}
