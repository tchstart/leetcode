package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution20
 * @Description: 二叉搜索树中的搜索
 * 给定二叉搜索树（BST）的根节点root和一个整数值val。
 *
 * 你需要在 BST 中找到节点值等于val的节点。 返回以该节点为根的子树。 如果节点不存在，则返回null。
 * @date : 2023-04-23 17:10
 **/
public class Solution20 {
    public TreeNode searchBST(TreeNode root, int val) {
        //递归的终止条件
        if(root == null) return null;
        //采用中序遍历
        //中
        if(root.val == val) return root;

        //左
        TreeNode leftNode = searchBST(root.left, val);
        if(leftNode != null) return leftNode;
        //右
        TreeNode rightNode = searchBST(root.right, val);
        if(rightNode != null) return rightNode;

        return null;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */