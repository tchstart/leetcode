package com.tch;

import com.tch.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution06
 * @Description:  二叉树的镜像
 * @date : 2023-04-18 19:22
 * 力扣链接：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/submissions/
 **/
class Solution06 {
    Queue<TreeNode> queue = new LinkedList<>();
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null) {return null;}
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            TreeNode node = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = node;
            if(treeNode.left != null) queue.add(treeNode.left);
            if(treeNode.right != null) queue.add(treeNode.right);
        }
        return root;
    }
}