package com.tch.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution01
 * @Description: 17. 电话号码的字母组合
 * @date : 2023-05-05 20:37
 * 力扣连接：https://leetcode.cn/problems/letter-combinations-of-a-phone-number/submissions/
 **/
public class Solution01 {
    class Solution {
        String[] numString = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder temp = new StringBuilder();
        List<String> result = new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            if(digits == null || digits.length() == 0){
                return result;
            }
            backtracking(digits,0);
            return result;
        }
        public void backtracking(String digits,int num){
            if(digits.length() == num){
                result.add(temp.toString());
                return ;
            }
            // 23
            String str = numString[digits.charAt(num) - '0'];

            for(int i = 0 ; i < str.length(); i ++){
                temp.append(str.charAt(i));
                backtracking(digits,num+1);
                temp.deleteCharAt(temp.length() -1);
            }

        }
    }
