package com.tch.array;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution5
 * @Description: 59. 螺旋矩阵 II
 * @date : 2023-04-27 09:27
 * 力扣链接：https://leetcode.cn/problems/spiral-matrix-ii/
 **/
public class Solution5 {
    public int[][] generateMatrix(int n) {
        int a = n / 2;
        int start = 0;
        int offset = 1;
        int num = 1;
        int[][] result = new int[n][n];
        int i = 0 ; int j = 0;
        for(int c = 0 ; c < a ;c++){
            for(i =start; i < n - offset; i++){
                result[start][i] = num++;
            }
            for (j = start; j < n - offset; j++) {
                result[j][i] = num++;
            }

            for( ; i > start;i--){
                result[j][i] = num++;
            }
            for( ; j > start ;j--){
                result[j][i] = num++;
            }
            start++;
            offset++;
        }
        if(n % 2 == 1) result[a][a] = num++;
        return result;
    }
}