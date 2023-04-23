package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution19
 * @Description: 617. 合并二叉树
 * @date : 2023-04-23 16:59
 * 力扣连接：https://leetcode.cn/problems/merge-two-binary-trees/
 **/
public class Solution19 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //终止条件
        if(root1 == null) return root2;
        if(root2 == null) return root1;

        root1.val += root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }
}
