package com.tch;

import com.tch.tree.TreeNode;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution03
 * @Description: 判断是否是平衡二叉树
 * @date : 2023-04-17 20:38
 * 力扣链接：https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/solution/ping-heng-er-cha-shu-shi-pin-jiang-jie-b-qwkw/
 **/
class Solution03 {
    //传递参数
    // 1.传入根节点
    // 2.返回是否为平衡二叉树
    public boolean isBalanced(TreeNode root) {
        // 退出条件
        // 1.节点为空，则为平衡二叉树
        if(null == root){
            return true;
        }
        // 2.左右节点有一个不是平衡二叉树，则根节点就不是平衡二叉树
        if(!isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        // 单层逻辑
        // 1.计算左节点深度
        // 2.计算右节点深度
        // 3.计算左右节点深度的差的绝对值是否 > 阈值1
        return Math.abs(deep(root.left)-deep(root.right)) > 1 ? false:true;
    }
    // 传递参数
    // 1.传入根节点
    // 2.返回深度
    private int deep(TreeNode root){
        //空节点的深度为0
        if(null == root){
            return 0;
        }
        return Math.max(deep(root.left),deep(root.right))+1;
    }
}