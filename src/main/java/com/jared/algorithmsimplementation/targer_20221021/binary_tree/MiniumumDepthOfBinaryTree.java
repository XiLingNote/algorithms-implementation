package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 104 二叉树的最大深度
 */
public class MiniumumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int max = 0;
        return getDepth(root,max,0);
    }

    public int getDepth(TreeNode root ,int max ,int length){
        max = max>length?max:length;
        if(root == null){
            return max>length?max:length;
        }
        length = length +1;
        int left = getDepth(root.left,max,length);
        int right = getDepth(root.right,max,length);

        return left>right?left:right;

    }

}
