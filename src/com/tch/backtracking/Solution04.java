package com.tch.backtracking;

import java.util.*;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution04
 * @Description: 131. 分割回文串
 * @date : 2023-05-06 18:12
 * 力扣：https://leetcode.cn/problems/palindrome-partitioning/
 **/
public class Solution04 {
    public List<List<String>> lists = new ArrayList<>();
    public Deque<String> deque = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return lists;
    }
    public void backtracking(String s,int startIndex){
        if(s.length() == startIndex){
            lists.add(new ArrayList(deque));
            return;
        }

        for(int i = startIndex ; i < s.length() ; i++){
            if(isPalindrome(s,startIndex,i)){
                String str = s.substring(startIndex,i + 1);
                deque.add(str);
            }else{
                continue;
            }
            backtracking(s,i+1);
            deque.removeLast();
        }
    }
    public boolean isPalindrome(String s, int start, int end){
        for(int i = start , j = end ; i < j ; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
