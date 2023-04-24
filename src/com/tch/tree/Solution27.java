package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution27
 * @Description: 538. 把二叉搜索树转换为累加树
 * @date : 2023-04-24 12:25
 *
 * 力扣连接：https://leetcode.cn/problems/convert-bst-to-greater-tree/
 **/
public class Solution27 {
    int pre = 0;
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        return root;
    }
    public void traversal(TreeNode cur){
        if(cur == null) return;

        traversal(cur.right);
        cur.val += pre;
        pre = cur.val;
        traversal(cur.left);
    }
}