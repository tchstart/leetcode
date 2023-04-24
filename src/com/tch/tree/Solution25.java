package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution25
 * @Description: 669. 修剪二叉搜索树
 * @date : 2023-04-24 11:40
 *
 * 力扣连接：https://leetcode.cn/problems/trim-a-binary-search-tree/
 **/
public class Solution25 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null) return null;
        if(root.val < low){
            TreeNode right = trimBST(root.right, low, high);
            return right;
        }
        if(root.val > high){
            TreeNode left = trimBST(root.left ,low,high);
            return left;
        }
        root.left = trimBST(root.left,low,high);
        root.right = trimBST(root.right,low,high);
        return root;
    }
}
