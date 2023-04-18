package com.tch;

import com.tch.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution10
 * @Description: 剑指 Offer II 045. 二叉树最底层最左边的值（给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。）
 * @date : 2023-04-18 20:47
 * 力扣链接：https://leetcode.cn/problems/LwUNpT/
 **/
public class Solution10 {
    Queue<TreeNode> queue = new LinkedList<>();
    public int findBottomLeftValue(TreeNode root) {
        int deep = deep(root);
        if(root == null) return 0;
        queue.add(root);
        int dept = 1;// 当前层数
        int i = 0; // 结果
        while(!queue.isEmpty()){
            if(dept != deep){
                int size = queue.size();
                for(int j = 0 ; j < size ; j++){
                    TreeNode treeNode = queue.poll();
                    if(treeNode.left != null) queue.add(treeNode.left);
                    if(treeNode.right != null) queue.add(treeNode.right);
                }
                dept++;
            }else{
                i = queue.poll().val;
                break;
            }
        }
        return i;
    }
    public int deep(TreeNode root){
        if(root == null) return 0;
        return Math.max(deep(root.left),deep(root.right)) + 1;
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