package com.tch;

import com.tch.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution05
 * @Description: 226. 翻转二叉树
 * @date : 2023-04-18 14:13
 * 力扣链接： https://leetcode.cn/problems/invert-binary-tree/
 **/
class Solution05 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) { return null; }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode treeNode = queue.poll();
                TreeNode temp = treeNode.left;
                treeNode.left = treeNode.right;
                treeNode.right = temp;
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
        }
        return root;
    }
}