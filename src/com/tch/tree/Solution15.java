package com.tch.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution15
 * @Description: 找树左下角的值
 * @date : 2023-04-21 17:49
 * 力扣链接：https://leetcode.cn/problems/find-bottom-left-tree-value/
 **/
public class Solution15 {
    Queue<TreeNode> queue = new LinkedList<>();
    public int findBottomLeftValue(TreeNode root) {
        if(root == null) return 0;
        queue.add(root);
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i< size ;i ++){
                TreeNode treeNode = queue.poll();
                if(i == 0 ){
                    res = treeNode.val;
                }
                if(treeNode.left != null) queue.add(treeNode.left);
                if(treeNode.right != null) queue.add(treeNode.right);
            }
        }
        return res;
    }
}