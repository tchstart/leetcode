package com.tch.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution13
 * @Description: 257. 二叉树的所有路径
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 *
 * 叶子节点 是指没有子节点的节点。
 * @date : 2023-04-21 16:43
 * 链接：https://leetcode.cn/problems/binary-tree-paths/
 **/
class Solution13 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<Integer> paths = new ArrayList<>();
        List<String> res = new ArrayList<>();
        traversal(root,paths,res);
        return res;
    }
    public void traversal(TreeNode root,List<Integer> paths,List<String> res){
        paths.add(root.val);
        if(root.left == null && root.right == null){
            StringBuffer string = new StringBuffer();
            for(int i = 0 ;i < paths.size() -1 ;i ++){
                string.append(paths.get(i) + "->");
            }
            string.append(paths.get(paths.size()-1));
            res.add(string.toString());
            return;
        }

        if(root.left != null){
            traversal(root.left , paths,res);
            paths.remove(paths.size()-1);
        }
        if(root.right != null) {
            traversal(root.right, paths,res);
            paths.remove(paths.size()-1);
        }
    }
}