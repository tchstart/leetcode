package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution26
 * @Description: 108. 将有序数组转换为二叉搜索树
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * @date : 2023-04-24 11:59
 *
 * 力扣连接：https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/
 **/
public class Solution26 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int right = nums.length;
        return traversal(nums,0,right-1);
    }
    public TreeNode traversal(int[] nums,int left,int right){
        if(left > right) return null;
        int mid = left + right + 1 >> 1; // 加1的目的是 (1 + 0) / 2 = 0 ;  到后面递归的手mid -1 就成-1报错了。
        TreeNode root = new TreeNode(nums[mid]);
        root.left = traversal(nums,left,mid-1);
        root.right = traversal(nums,mid+1,right);
        return root;
    }
}