package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 114 二叉树展开为链表
 */
public class FlattenBinaryTreeToLinkedList {
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten (root.right);
        flatten(root.left);
        root.right = pre;
        root.left = null;
        pre = root;
    }
}
