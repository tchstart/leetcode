package com.tch.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution03
 * @Description: 组合总和 II
 * @date : 2023-05-06 09:38
 * https://leetcode.cn/problems/combination-sum-ii/submissions/
 **/
class Solution03 {
    List<List<Integer>> result = new ArrayList();
    List<Integer> path = new ArrayList();
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backtracking(candidates,target,0,0);
        return result;
    }
    public void backtracking(int[] candidates,int target,int numtarget,int startindex){
        if(numtarget > target) return;
        if(numtarget == target){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = startindex ;i < candidates.length; i ++){
            if(i > 0 && candidates[i] == candidates[i-1] && !used[i - 1]){
                continue;
            }
            used[i] = true;
            path.add(candidates[i]);
            numtarget += candidates[i];
            backtracking(candidates,target,numtarget,i+1);
            used[i] = false;
            numtarget -= candidates[i];
            path.remove(path.size() -1);
        }
    }
}