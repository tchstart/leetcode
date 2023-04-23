package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution21
 * @Description: 236. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
 * @date : 2023-04-23 17:14
 * 力扣连接：https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/submissions/
 **/
public class Solution21 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 终止条件
        if(root == null) return null;
        if(root == p || root == q) return root;

        //左
        TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
        //右
        TreeNode rightNode = lowestCommonAncestor(root.right,p,q);
        //中
        if(leftNode != null && rightNode != null) return root;
        if(leftNode != null && rightNode == null) return leftNode;
        else if(leftNode == null && rightNode != null) return rightNode;
        else return null;
    }
}