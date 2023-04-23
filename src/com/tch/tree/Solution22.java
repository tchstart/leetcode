package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution22
 * @Description: 二叉搜索树的最近公共祖先
 * @date : 2023-04-23 19:53
 * 力扣：https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/
 **/
public class Solution22 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val > p.val && root.val > q.val){
            TreeNode leftNode = lowestCommonAncestor(root.left,p,q);
            if(leftNode != null) return leftNode;
        }
        if(root.val < p.val && root.val < q.val){
            TreeNode rightNode = lowestCommonAncestor(root.right ,p ,q);
            if(rightNode != null) return rightNode;
        }
        return root;
    }
}