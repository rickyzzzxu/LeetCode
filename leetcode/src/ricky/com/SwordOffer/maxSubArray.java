package ricky.com.SwordOffer;

public class maxSubArray {
    //剑指 Offer 42. 连续子数组的最大和
    //输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    //要求时间复杂度为O(n)。
    class Solution {
        public int maxSubArray(int[] nums) {
            int dp = nums[0];
            int max = dp;
            for(int i = 1; i < nums.length; i++){
                if(nums[i] < nums[i] + dp){
                    dp = dp + nums[i];
                }else{
                    dp = nums[i];
                }

                max = Math.max(max, dp);
            }

            return max;
        }
    }
}
