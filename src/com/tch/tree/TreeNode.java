package com.tch.tree;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: TreeNode
 * @Description: TODO(一句话描述该类的信息)
 * @date : 2023-04-14 09:59
 **/
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}
