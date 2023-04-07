package ricky.com.Hot100;

/**
 * @Author xdg
 * @Date 2023/4/6 19:38
 */
public class maxProduct {
    /*152. 乘积最大子数组
    给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），
    并返回该子数组所对应的乘积。
    测试用例的答案是一个 32-位 整数。
    子数组 是数组的连续子序列。*/
    class Solution {
        public int maxProduct(int[] nums) {
            //以i结尾的最大和最小乘积子数组
            int[] dpMax = new int[nums.length];
            int[] dpMin = new int[nums.length];
            dpMax[0] = nums[0];
            dpMin[0] = nums[0];
            int maxNum = nums[0];
            int minNum = nums[0];
            int res = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dpMax[i] = Math.max(nums[i], Math.max(dpMax[i - 1] * nums[i], dpMin[i - 1] * nums[i]));
                dpMin[i] = Math.min(nums[i], Math.min(dpMax[i - 1] * nums[i], dpMin[i - 1] * nums[i]));
                res = Math.max(res, dpMax[i]);
            }

            return res;
        }
    }
}
