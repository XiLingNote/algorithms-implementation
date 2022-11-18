package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 105 前中序构造二叉树
 */
public class ConstructBinaryTreeFromPreorderAndInorder {
    
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeHelper(preorder,0,preorder.length,inorder,0,inorder.length);

    }
    public TreeNode buildTreeHelper(int[] perOrder ,int pStart,int pEnd,int[]inOrder , int iStart,int iEnd ){
        if(pStart == pEnd){
            return null;
        }
        int rootVal = perOrder[pStart];
        TreeNode treeNode = new TreeNode(rootVal);
        int i_root_index = 0;
        for (int i = iStart; i < iEnd ; i++) {
            if(rootVal == inOrder[i]){
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - iStart;
        treeNode.left= buildTreeHelper(perOrder,pStart + 1,pStart+ leftNum +1,inOrder,iStart,i_root_index);
        treeNode.right = buildTreeHelper(perOrder,pStart + leftNum+1,pEnd,inOrder,i_root_index+1,iEnd);

        return treeNode;
    }
}
