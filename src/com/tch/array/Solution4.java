package com.tch.array;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution4
 * @Description: 长度最小的子数组
 * @date : 2023-04-26 20:07
 *
 * 力扣链接：https://leetcode.cn/problems/minimum-size-subarray-sum/
 **/
public class Solution4 {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0 ;
        int i = 0 ;
        int length = 0 ; // 每次符合要求的长度，在里面取最小长度
        int result = Integer.MAX_VALUE; // 最终结果，最小满足要求的长度
        for(int j = 0 ; j < nums.length; j++){ // j定义我们的初始位置
            sum += nums[j];
            while(sum >= target){
                length = j - i + 1;
                result = Math.min(result,length);
                sum -= nums[i];
                i++;
            }
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }
    }
}