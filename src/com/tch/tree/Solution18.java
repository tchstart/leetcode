package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution18
 * @Description: 654. 最大二叉树
 * @date : 2023-04-23 16:28
 * 力扣：https://leetcode.cn/problems/maximum-binary-tree/
 **/
// 采用前序遍历，递归
public class Solution18 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // 终止条件
        if(nums.length == 1){
            return new TreeNode(nums[0]);
        }
        // 中
        int maxValue = 0 ;
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(maxValue < nums[i]){
                maxValue = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(maxValue);
        int[] left = new int[index];
        int[] right = new int[nums.length - index -1];
        for(int i = 0 ; i < left.length ;i++){
            left[i] = nums[i];
        }
        for(int i = 0,j= index+1 ; i < right.length; i++,j++){
            right[i] = nums[j];
        }

        // 左
        if(index > 0) {
            root.left = constructMaximumBinaryTree(left);
        }
        // 右
        if(index < nums.length - 1) {
            root.right = constructMaximumBinaryTree(right);
        }
        return root;
    }
}
