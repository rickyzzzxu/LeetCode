package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/3/27 16:35
 */
public class maxSubArray {
    /* 53. 最大子数组和
     给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     子数组 是数组中的一个连续部分。*/
    class Solution {
        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
                res = Math.max(res, dp[i]);
            }

            return res;
        }
    }
}
