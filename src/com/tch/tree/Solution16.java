package com.tch.tree;



/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution16
 * @Description: 112. 路径总和
 * 给你二叉树的根节点 root 和一个表示目标和的整数 targetSum 。判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和 targetSum 。如果存在，返回 true ；否则，返回 false 。
 * @date : 2023-04-22 11:13
 * 力扣链接：https://leetcode.cn/problems/path-sum/
 **/
public class Solution16 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return traversal(root,targetSum - root.val);
    }

    public boolean traversal(TreeNode root, int count){
        if(root.left == null && root.right == null && count == 0){
            return true;
        }
        if(root.left == null && root.right == null && count != 0){
            return false;
        }

        //左
        if(root.left != null){
            count -= root.left.val;
            if(traversal(root.left,count)){
                return true;
            }
            count += root.left.val;
        }
        //右
        if(root.right != null){
            count += root.right.val;
            if(traversal(root.right,count)){
                return true;
            }
            count += root.right.val;
        }
        return false;
    }
}