package com.jared.algorithmsimplementation.targer_20221021.binary_tree;

import java.util.LinkedList;

/**
 * 297 二叉树的序列化和反序列化
 */
public class SerializeAndDeserializeBinaryTree {

    String SEP = ",";
    String NULL = "#";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder  sb = new StringBuilder();
        serialize(root,sb);
        return sb.toString();
    }
    void serialize(TreeNode treeNode,StringBuilder sb){
        if(treeNode == null){
            sb.append(NULL).append(SEP);
            return;
        }
        //前序遍历位置
        sb.append(treeNode.val).append(SEP);
        serialize(treeNode.left,sb);
        serialize(treeNode.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for (String s: data.split(SEP)) {
            nodes.addLast(s);
        }
        return deserialize(nodes);
    }
    TreeNode deserialize(LinkedList<String> nodes){
        if(nodes.isEmpty()){
            return null;
        }
        String first = nodes.removeFirst();
        if(first.equals(NULL)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(first));
        root.left = deserialize(nodes);
        root.right = deserialize(nodes);
        return root;
    }
}
