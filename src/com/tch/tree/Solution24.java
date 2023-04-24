package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution24
 * @Description: 450. 删除二叉搜索树中的节点
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的key对应的节点，
 * 并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
 *
 * @date : 2023-04-24 10:36
 * 力扣连接：https://leetcode.cn/problems/delete-node-in-a-bst/submissions/
 **/


/**
 * 1.没找到删除的节点
 * 2.删除的点是叶子节点
 * 3.删除的节点，左不空，右为空
 * 4.删除的节点，左为空，右不空
 * 5.删除的节点，左右都不为空
 */
public class Solution24 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key){
            if(root.left == null && root.right == null) return null;
            else if(root.left == null && root.right != null) return root.right;
            else if(root.left != null && root.right == null) return root.left;
            else{
                TreeNode cur = root.left;
                while(cur.right != null) cur = cur.right;
                cur.right = root.right;
                return root.left;
            }
        }
        if(key < root.val) root.left = deleteNode(root.left,key);
        if(key > root.val) root.right = deleteNode(root.right,key);
        return root;
    }
}
