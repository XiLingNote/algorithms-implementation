package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 二叉树相同
 */
public class SameTree {

    public static void main(String[] args) {
        SameTree sameTree = new SameTree();
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null && q != null){
            return false;
        }
        if(p != null && q == null){
            return false;
        }
        if(p.val !=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
    
}
