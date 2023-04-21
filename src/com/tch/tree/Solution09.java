package com.tch.tree;

import com.tch.tree.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution09
 * @Description: 剑指 Offer 54. 二叉搜索树的第k大节点(给定一棵二叉搜索树，请找出其中第 k 大的节点的值。)
 * @date : 2023-04-18 20:40
 * 力扣链接：https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 **/
class Solution09 {
    List<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list = bl(root);
        list.sort(Comparator.reverseOrder());
        return list.get(k - 1);
    }
    public List<Integer> bl(TreeNode root){
        if(root == null) return list;
        list.add(root.val);
        bl(root.left);
        bl(root.right);
        return list;
    }
}