package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 106 中序后序构建二叉树
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPostorderTraversal c =new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        c.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,0 ,inorder.length -1,postorder,0, postorder.length-1 );
    }


    public TreeNode build(int[] inorder ,int inStart, int inEnd ,int [] postOrder, int pStart ,int pEnd){
        if(inEnd<inStart){
            return null;
        }

        int rootVal = postOrder[pEnd];
        TreeNode treeNode = new TreeNode(rootVal);
        int i_root_index = 0;
        for (int i = 0; i < inorder.length ; i++) {
            if(rootVal == inorder[i]){
                i_root_index = i;
                break;
            }
        }
        int index = i_root_index - inStart;
        treeNode.left = build(inorder,inStart,i_root_index-1,postOrder,pStart,pStart + index -1);
        treeNode.right = build(inorder,i_root_index + 1,inEnd, postOrder ,pStart + index,pEnd-1);
        return treeNode;
    }
}
