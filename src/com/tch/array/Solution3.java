package com.tch.array;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution3
 * @Description: 977. 有序数组的平方
 * @date : 2023-04-24 16:55
 * 力扣链接：https://leetcode.cn/problems/squares-of-a-sorted-array/
 **/

// 双指针 击败用户100%
class Solution3 {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length -1;
        int index= right;
        while(left <= right){
            if(nums[left] * nums[left] > nums[right] * nums[right]){
                arr[index] = nums[left] * nums[left];
                left ++;
                index --;
            }else{
                arr[index] =  nums[right] * nums[right];
                right --;
                index--;
            }
        }
        return arr;
    }
}
/*
暴力，先平方，在排序
public class Solution3 {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        quick_sort(nums,0,nums.length-1);
        return nums;
    }
    public void quick_sort(int[] nums,int l,int r){
        if(l >= r) return;
        int x = nums[l];
        int i = l - 1; int j = r + 1;
        while(i < j){
            do i++;while(nums[i] < x);
            do j--;while(nums[j] > x);
            if(i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        quick_sort(nums,l,j);
        quick_sort(nums,j+1,r);
    }
}
*/

