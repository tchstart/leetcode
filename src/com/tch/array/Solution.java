package com.tch.array;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution
 * @Description: 704. 二分查找
 * @date : 2023-04-24 14:01
 * 力扣链接：https://leetcode.cn/problems/binary-search/submissions/
 **/
//左闭右开
public class Solution {
    public int search(int[] nums,int target){
        int l = 0;
        int r = nums.length;
        while(l < r){
            int mid = l + r >> 1;
            if(target > nums[mid]){
                l = mid + 1;
            }else if(target < nums[mid]){
                r = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

// 左闭右闭
/*
public class Solution {
    public int search(int[] nums,int target){
        int l = 0;
        int r = nums.length;
        while(l < r){
            int mid = l + r >> 1;
            if(target > nums[mid]){
                l = mid + 1;
            }else if(target < nums[mid]){
                r = mid;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
*/

