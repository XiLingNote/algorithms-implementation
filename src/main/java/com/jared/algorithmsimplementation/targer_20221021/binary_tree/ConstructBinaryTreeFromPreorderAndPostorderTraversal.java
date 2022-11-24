package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

import java.util.HashMap;

/**
 * 889 先序后序遍历构建二叉树
 */
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
    HashMap<Integer,Integer> valmap = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            valmap.put(postorder[i],i);
        }
        return build(preorder,0,preorder.length-1,
                postorder,0,postorder.length-1);

    }
    public TreeNode build(int [] perorder,int perStart,int perEnd,
                          int [] postorder,int postStart,int postEnd){
        if(perStart>perEnd){
            return null;
        }
        if(perStart  == perEnd){
            return new TreeNode(perorder[perStart]);
        }
        int rootVal = perorder[perStart];

        int leftRootVal = perorder[perStart + 1];
        int index = valmap.get(leftRootVal);
        
        int leftSize = index - postStart + 1;
        TreeNode treeNode = new TreeNode(rootVal);
        treeNode.left = build(perorder,
                perStart + 1, perStart+leftSize,
                postorder,postStart,index);
        treeNode.right = build(perorder,
                perStart+ leftSize + 1,perEnd,
                postorder,index+1,postEnd-1);
        
        return treeNode;
    }
    
    
}
