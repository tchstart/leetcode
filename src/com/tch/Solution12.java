package com.tch;

import com.tch.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution12
 * @Description: 543. 二叉树的直径
 * @date : 2023-04-19 13:43
 * 力扣链接：https://leetcode.cn/problems/diameter-of-binary-tree/solution/
 **/
class Solution12 {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        deep(root);
        return ans-1;
    }
    public int deep(TreeNode root){
        if(root == null){
            return 0;
        }
        int L = deep(root.left);
        int R = deep(root.right);
        ans = Math.max(ans,L + R + 1);
        return  Math.max(L,R)+1;
    }
}