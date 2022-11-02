package com.ricky.dp;

public class JZ42 {
    /*连续子数组的最大和
    描述
    输入一个长度为n的整型数组array，数组中的一个或连续多个整数组成一个子数组，子数
    组最小长度为1。求所有子数组的和的最大值。*/
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
        /*int dp[] = new int[array.length];
        dp[0] = array[0];
        int max = dp[0];
        for(int i = 1; i < array.length; i++){
            dp[i] = Math.max(dp[i - 1] + array[i], array[i]);
            max = Math.max(max, dp[i]);
        }
        return max;*/

            //优化版，时间复杂度不变，空间复杂度由O(n)变为O(1);
            //dp表示连续子数组以num[i]结尾的最大值
            int dp = array[0];
            //max记录最大值
            int max = dp;
            for(int i = 1; i < array.length; i++){
                //如果加上array[i]后值变大，就加，否则舍弃dp子数组，从array[i]开始当做子数组第一个元素
                dp = Math.max(dp + array[i], array[i]);
                max = Math.max(max, dp);
            }
            return max;
        }
    }

}
