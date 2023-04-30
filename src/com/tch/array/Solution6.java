package com.tch.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution6
 * @Description: 组合
 * @date : 2023-04-30 18:40
 * 力扣链接：https://leetcode.cn/problems/combinations/submissions/
 *
 * 回溯模板：
 * 1.终止条件
 * 2.单层逻辑
 * 3.递归
 * 4.回溯
 **/
public class Solution6 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }
    public void backtracking(int n ,int k ,int startIndex){
        //终止条件
        if(path.size() == k){
            result.add(new ArrayList<>(path));
            return ;
        }

        for(int i = startIndex ; i <= n ; i++){
            path.addLast(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
    }
}
