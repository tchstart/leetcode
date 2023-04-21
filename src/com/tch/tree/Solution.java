package com.tch.tree;

import com.tch.tree.TreeNode;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution
 * @Description: 给定前序遍历 中序遍历。来还原二叉树
 * @date :  2023-04-14 09:48
 * 力扣： https://leetcode.cn/problems/zhong-jian-er-cha-shu-lcof/submissions/
 **/
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder ,int[] inorder ,int preStart ,int preEnd,int inoStart ,int inoEnd){
        //base case
        if(preStart > preEnd || inoStart > inoEnd){
            return null;
        }
        //树的根节点
        int val = preorder[preStart];
        TreeNode root = new TreeNode(val);
        //查找根节点在中序遍历的位置
        int index = 0 ;
        for(int i = inoStart ; i <= inoEnd ; i++){
            if(inorder[i] == val){
                index = i;
                break;
            }
        }
        //计算左子树在数组中的长度
        int leftSize = index - inoStart;
        //递归构建
        root.left = build(preorder,inorder,preStart+1,preStart + leftSize,inoStart,index-1 );
        root.right = build(preorder,inorder,preStart + leftSize + 1,preEnd,index+1,inoEnd);
        return root;
    }
}