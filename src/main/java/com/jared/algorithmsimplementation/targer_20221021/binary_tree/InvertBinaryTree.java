package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 226 反转二叉树
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode treeNodeLeft = invertTree(root.left);
        TreeNode treeNodeRight = invertTree(root.right);
        root.left = treeNodeRight;
        root.right = treeNodeLeft;
        return root;
    }
}
