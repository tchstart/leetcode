package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution14
 * @Description: 左叶子之和
 * @date : 2023-04-21 17:03
 * 链接：https://leetcode.cn/problems/sum-of-left-leaves/
 **/
public class Solution14 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 0;
        //左
        int leftNum = sumOfLeftLeaves(root.left);
        if(root.left != null && root.left.left == null && root.left.right == null){
            leftNum = root.left.val;
        }
        //右
        int rightNum = sumOfLeftLeaves(root.right);
        //中
        int total = leftNum + rightNum;
        return total;
    }
}
