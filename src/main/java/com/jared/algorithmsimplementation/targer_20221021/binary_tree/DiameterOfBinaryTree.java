package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 543 二叉树的直径
 */
public class DiameterOfBinaryTree {
    int maxN;
    public int diameterOfBinaryTree(TreeNode root) {
        maxN = 1;
        dfs(root);
        return maxN-1;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        int max = left + right +1;
        maxN  = max>maxN?max:maxN;
        return (left>right?left:right)+1;
    }
}
