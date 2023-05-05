package com.tch.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution
 * @Description: 77. 组合
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 * @date : 2023-05-05 20:22
 * 力扣连接：https://leetcode.cn/problems/combinations/
 **/
public class Solution {
    List<Integer> path = new ArrayList();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }

    public void backtracking(int n , int k , int startIndex){
        if(k == path.size()){
            result.add(new ArrayList<>(path));
        }

        for(int i = startIndex ; i <= n ; i++){
            path.add(i);
            backtracking(n,k,i+1);
            path.remove(path.size() -1);
        }
    }
}
