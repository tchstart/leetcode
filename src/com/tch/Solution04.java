package com.tch;

import com.tch.tree.TreeNode;

import java.util.*;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: test
 * @Description: 从上到下打印二叉树 III
 * @date : 2023-04-18 08:55
 * 力扣：https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 **/
class Solution04 {
    List<List<Integer>> list=  new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        boolean b = false;
        while (!queue.isEmpty()) {
            b = !b;
            int size = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = 0 ; i < size ;i++){
                TreeNode treeNode = queue.poll();
                if(b){
                    temp.addLast(treeNode.val);
                }else{
                    temp.addFirst(treeNode.val);
                }
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
            list.add(temp);
        }
        return list;
    }
}