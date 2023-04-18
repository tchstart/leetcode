package com.tch;

import com.tch.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution07
 * @Description: 剑指 Offer II 044. 二叉树每层的最大值
 * @date : 2023-04-18 19:57
 * 力扣链接：https://leetcode.cn/problems/hPov7L/submissions/
 **/
class Solution07 {
    List<Integer> list = new ArrayList();
    int max = Integer.MIN_VALUE;
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            max = Integer.MIN_VALUE;
            for(int i = 0 ;  i < size ;i ++){
                TreeNode treeNode = queue.poll();
                max = max > treeNode.val? max : treeNode.val;
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
            list.add(max);
        }
        return list;
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