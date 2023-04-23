package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution23
 * @Description: 二叉搜索树中的插入操作
 * @date : 2023-04-23 21:07
 * 力扣连接：https://leetcode.cn/problems/insert-into-a-binary-search-tree/
 **/
public class Solution23 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            TreeNode treeNode = new TreeNode(val);
            return treeNode;
        }

        if(val < root.val){
            root.left =  insertIntoBST(root.left,val);
        }
        if(val > root.val){
            root.right = insertIntoBST(root.right,val);
        }
        return root;
    }
}
