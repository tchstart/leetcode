package com.tch;

import com.tch.tree.TreeNode;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution01
 * @Description: 对称二叉树
 * @date : 2023-04-17 20:01
 * 力扣链接： https://leetcode.cn/problems/symmetric-tree/
 **/
//对称二叉树中序遍历出来的list左右一定相互对称，但是list左右相互对称却不一定是对称二叉树
class Solution01 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isdc(root.left,root.right);
    }
    public boolean isdc(TreeNode L,TreeNode R){
        if(L == null && R == null) return true;
        if(L == null || R == null || R.val != L.val) return false;
        return isdc(L.left,R.right) && isdc(L.right,R.left);
    }
}
