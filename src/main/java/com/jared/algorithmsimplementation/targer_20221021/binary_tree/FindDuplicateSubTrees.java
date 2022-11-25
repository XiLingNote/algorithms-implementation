package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 652 寻找重复的子树
 */
public class FindDuplicateSubTrees {
    HashMap<String,Integer> memo = new HashMap<>();
    LinkedList<TreeNode> res = new LinkedList<TreeNode>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    String traverse(TreeNode root){
        if(root == null ){
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);

        String subTree = left + "," + right + "," + root.val;

        int frep = memo.getOrDefault(subTree,0);
        if(frep == 1){
            res.add(root);
        }
        memo.put(subTree,frep+1);
        return subTree;

    }
}
