package com.tch;

import com.tch.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution08
 * @Description: 从上到下打印二叉树 II(从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。)
 * @date : 2023-04-18 20:33
 * 力扣链接：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/submissions/
 **/
class Solution08 {
    List<List<Integer>> list = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return list;
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> l = new ArrayList<>();
            int size = queue.size();
            for(int i = 0 ;i < size; i++){
                TreeNode treeNode = queue.poll();
                l.add(treeNode.val);
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
            list.add(l);
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
 *     TreeNode(int x) { val = x; }
 * }
 */