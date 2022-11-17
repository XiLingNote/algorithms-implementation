package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的遍历 145 后序遍历 144 前序遍历
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        preOrder(root,list);
        return list;
    }

    private void preOrder(TreeNode treeNode,List<Integer> list){
        if(treeNode== null){
            return;
        }
        list.add(treeNode.val);
        preOrder(treeNode.left,list);
        preOrder(treeNode.right,list);
    }

    private void midOrder(TreeNode treeNode,List<Integer> list){
        if(treeNode== null){
            return;
        }
        midOrder(treeNode.left,list);
        list.add(treeNode.val);
        midOrder(treeNode.right,list);
    }
    private void postOrder(TreeNode treeNode,List<Integer> list){
        if(treeNode== null){
            return;
        }
        postOrder(treeNode.left,list);
        postOrder(treeNode.right,list);
        list.add(treeNode.val);
    }

}
