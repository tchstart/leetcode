package com.tch;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution11
 * @Description: 真值二叉树
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 * @date : 2023-04-19 13:19
 * 力扣链接：https://leetcode.cn/problems/univalued-binary-tree/
 **/

import com.tch.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

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
class Solution11 {
    Queue<TreeNode>  queue = new LinkedList<>();
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            if(root.val != treeNode.val) return false;
            else{
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
        }
        return true;
    }
}