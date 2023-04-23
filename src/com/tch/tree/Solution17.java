package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution17
 * @Description: 106. 从中序与后序遍历序列构造二叉树
 * 给定两个整数数组 inorder 和 postorder ，其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，请你构造并返回这颗 二叉树 。
 * @date : 2023-04-23 12:28
 **/
public class Solution17 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode build(int[] inorder,int[] postorder, int inoStart,int inoEnd,int postStart,int postEnd){
        //base case
        if(inoStart > inoEnd || postStart > postEnd) return null;

        int index = 0 ;
        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);
        for(int i = 0 ; i < inorder.length ; i++){
            if(inorder[i] == val){
                index = i;
                break;
            }
        }
        //中序的左树长度
        int leftSize = index - inoStart;

        //递归
        root.left = build(inorder,postorder,inoStart,index-1,postStart,postStart + leftSize -1);
        root.right = build(inorder,postorder,index+1,inoEnd,postStart+leftSize,postEnd-1);
        return root;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */