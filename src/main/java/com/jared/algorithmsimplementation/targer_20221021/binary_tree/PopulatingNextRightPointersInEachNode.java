package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

/**
 * 116 填充每一个节点下一个右节点指针
 */
public class PopulatingNextRightPointersInEachNode {
    public TreeNode connect(TreeNode root) {
        dfs(root,null);
        return root;
    }
    private void dfs(TreeNode node ,TreeNode next){
        if(node!=null){
            node.next = next;
            dfs(node.left,node.right);
            dfs(node.right,node.next !=null?node.next.left:null);
        }
    }
}
